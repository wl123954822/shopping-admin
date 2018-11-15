package cn.tjmj.serviceshopping.service;

import cn.tjmj.serviceshopping.entity.Item;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-21 15:14
 */
//商品列表
public interface ItemService {

    List<Item> itemList();

    List<Item> getItemById(int id);

    boolean addItem(Item item);

}
