package cn.tjmj.serviceshopping.service.impl;

import cn.tjmj.serviceshopping.dao.ItemDao;
import cn.tjmj.serviceshopping.entity.Item;
import cn.tjmj.serviceshopping.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-21 15:17
 */

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;

    @Override
    public List<Item> itemList() {
        return itemDao.getAllItem();
    }

    @Override
    public List<Item> getItemById(int id) {
        return itemDao.getItemById(id);
    }

    @Override
    public boolean addItem(Item item) {
        return itemDao.addItem(item);
    }
}
