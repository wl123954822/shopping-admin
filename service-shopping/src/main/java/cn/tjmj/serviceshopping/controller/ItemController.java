package cn.tjmj.serviceshopping.controller;

import cn.tjmj.serviceshopping.Dto.ItemCatDto;
import cn.tjmj.serviceshopping.Dto.ItemTjPicDto;
import cn.tjmj.serviceshopping.entity.Item;
import cn.tjmj.serviceshopping.entity.ItemCat;
import cn.tjmj.serviceshopping.service.ItemCatService;
import cn.tjmj.serviceshopping.service.ItemService;
import cn.tjmj.serviceshopping.service.ItemTjPicService;
import cn.tjmj.serviceshopping.util.RegExpUtil;
import cn.tjmj.serviceshopping.util.uploadFile;
import com.alibaba.druid.sql.visitor.functions.If;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Case;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-21 15:18
 */

@RestController
@RequestMapping("/item")
public class ItemController {

    Logger logger =LoggerFactory.getLogger(ItemController.class);



    @Autowired
    private ItemService itemService;

    @Autowired
    private ItemTjPicService itemTjPicService;

    @Autowired
    private ItemCatService itemCatService;

    @Autowired
    private RedisTemplate redisTemplate;

    //商品所有
    @RequestMapping("/list")
    public Map<String,Object> itemList(){

        Map<String,Object> map = new HashMap<>();
        List<Item> list = itemService.itemList();
        map.put("list",list);
        return map;
    }

    //商品详情
    @RequestMapping("/listById")
    public Map<String,Object> itemLisById(int id){
        Map<String,Object> map = new HashMap<>();
        List<Item> list = itemService.getItemById(id);
        map.put("list",list);
        return map;
    }

    //统计商品月销量
    @RequestMapping("/tj")
    public  Map<String,Object> itemTjByItemId(int itemId) throws ParseException {
        Map<String,Object> map = new HashMap<>();
        List<ItemTjPicDto> list = itemTjPicService.getTjByItemId(itemId);

        LinkedList<Long> longs = new LinkedList<>();
        Long a = Long.valueOf(0);
        for (int i =0 ;i<12;i++){
            longs.add(a);
        }

        for (ItemTjPicDto itemTjPicDto: list) {

            Long qunantity = itemTjPicDto.getQuantity();
            String time = itemTjPicDto.getCreateDate();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = sdf.parse(time);
            Calendar c1 = Calendar.getInstance();
            c1.setTime(date);
            //月
            int ds = c1.get(Calendar.MONTH) + 1;
 /*           int ni = c1.get(Calendar.YEAR) + 1;
            System.out.println(ni);*/
            /*String aa = String.valueOf(ni);
            System.out.println("aa "+aa);*/
            longs.set(ds-1,qunantity);
        }
        map.put("longs",longs);
        return map;
    }


    //商品分类显示
    @RequestMapping("/clist")
    public Map<String,Object> list(int pageSize,int pageNumber){

        Map<String,Object> map = new HashMap<>();
        PageHelper.startPage(pageNumber,pageSize);
        List<ItemCatDto> list = itemCatService.getItemList();
        PageInfo<ItemCatDto> info = new PageInfo<>(list);
        for (ItemCatDto itemCatDto:list) {
            int cid = itemCatDto.getId();

            int num = itemCatService.sum(cid);

            itemCatDto.setItemNum(num);
        }
            map.put("rows",info.getList());
            map.put("total",info.getTotal());

            return map;
    }

    //删除分类
    @RequestMapping("/delete")
    public Map<String,Object> delete(int id){
        Map<String, Object> map = new HashMap<>();
        if (!RegExpUtil.isNull(id + "")) {
            if (itemCatService.delete(id)) {
                map.put("status", "success");
                map.put("text", "删除成功");
            } else {
                map.put("status", "error");
                map.put("text", "删除失败");
            }
        } else {
            map.put("status", "error");
            map.put("text", "参数错误");
        }
        return map;
    }

    //更新状态
    @RequestMapping("/update")
    public Map<String,Object> update(int id,int status){
        Map<String, Object> map = new HashMap<>();

        if (!RegExpUtil.isNull(id + "") && !RegExpUtil.isNull(status + "")) {
            if (itemCatService.update(id,status)) {
                map.put("status", "success");
                map.put("text", "变更成功");
            }
        } else {
            map.put("status", "error");
            map.put("text", "参数错误");
        }
        return map;
    }

    //添加分类
    @RequestMapping("/add")
    public Map<String,Object> add(ItemCat itemCat){
        Map<String, Object> map = new HashMap<>();
        itemCat.setChildId(0);
        itemCat.setStatus(1);
        if (!RegExpUtil.isNull(itemCat.getName())){

            ItemCat itemCat1 =itemCatService.getItemCatByName(itemCat.getName());
            if (itemCat1 ==null) {

                if (itemCatService.appItemCat(itemCat)) {
                    map.put("status", "success");
                    map.put("text", "新增成功");
                }
            }else {
                map.put("stauts","error");
                map.put("text","重复添加");
            }
        }else {
            map.put("status","error");
            map.put("text","参数错误");
        }
        return map;
    }

    @RequestMapping("/upload")
    public Map<String,Object> upload(MultipartFile file) throws IOException {
       Map map=  uploadFile.uploadFile(file);
       return map;
    }



    //商品分类显示
    @RequestMapping("/clists")
    public Map<String,Object> listc(){

        Map<String,Object> map = new HashMap<>();

        List<ItemCatDto> list = itemCatService.getItemList();

        map.put("list",list);

        return map;
    }

    //添加商品
    @RequestMapping("/addItem")
    public Map<String, Object> addIt(Item item) {
        Map<String, Object> map = new HashMap<>();

        if (itemService.addItem(item)) {
            map.put("status", "success");
            map.put("text", "添加成功");
        }
        return map;
    }
}
