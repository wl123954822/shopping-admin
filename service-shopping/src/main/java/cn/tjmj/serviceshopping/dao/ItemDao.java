package cn.tjmj.serviceshopping.dao;

import cn.tjmj.serviceshopping.entity.Item;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-21 14:11
 */
public interface ItemDao {

    List<Item> getAllItem();

    List<Item> getItemById(int id);

    Boolean addItem(Item item);
}
