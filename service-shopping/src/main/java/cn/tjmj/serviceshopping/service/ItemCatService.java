package cn.tjmj.serviceshopping.service;

import cn.tjmj.serviceshopping.Dto.ItemCatDto;
import cn.tjmj.serviceshopping.entity.ItemCat;


import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-23 16:03
 */
public interface ItemCatService {

    List<ItemCatDto> getItemList();

    int sum (int cid);

    boolean delete(int id);

    boolean update(int id,int status);

    boolean appItemCat(ItemCat itemCat);

    ItemCat getItemCatByName(String name);
}
