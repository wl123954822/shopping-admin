package cn.tjmj.serviceshopping.dao;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-23 15:59
 */

import cn.tjmj.serviceshopping.Dto.ItemCatDto;
import cn.tjmj.serviceshopping.entity.ItemCat;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * 商品分类管理
 */

public interface ItemCatDao {

    List<ItemCatDto> getItemCat();

    //得到该分类下的商品数
    int getSum(int cid);

    //删除
    boolean delete(int id);

    //更新分类状态
    boolean update(@Param("id") int id, @Param("status") int status);

    //新增分类
    boolean add(ItemCat itemCat);

    //防止重复提交
    ItemCat getItemCatByName(String name);
}
