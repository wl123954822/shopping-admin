package cn.tjmj.serviceshopping.controller;


import cn.tjmj.serviceshopping.entity.User;
import cn.tjmj.serviceshopping.service.WxUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2018-01-04 14:24
 */

@RestController
@RequestMapping("/wxuser")
public class WxUserController {

    @Autowired
    private WxUserService wxUserService;

    @RequestMapping("/list")
    public Map<String,Object> getUserS(int pageSize, int pageNumber){
        Map<String,Object> map = new HashMap<>();
        PageHelper.startPage(pageNumber,pageSize);
        List<User> list = wxUserService.wxUserList();

        PageInfo<User> info = new PageInfo<>(list);
        map.put("rows",info.getList());
        map.put("total",info.getTotal());
        return map;
    }

}
