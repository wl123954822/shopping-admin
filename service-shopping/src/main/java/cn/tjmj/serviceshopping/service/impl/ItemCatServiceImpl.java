package cn.tjmj.serviceshopping.service.impl;

import cn.tjmj.serviceshopping.Dto.ItemCatDto;
import cn.tjmj.serviceshopping.dao.ItemCatDao;
import cn.tjmj.serviceshopping.entity.ItemCat;
import cn.tjmj.serviceshopping.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-23 16:04
 */

@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private ItemCatDao itemCatDao;

    @Override
    public List<ItemCatDto> getItemList() {
        return itemCatDao.getItemCat();
    }

    @Override
    public int sum(int cid) {
        return itemCatDao.getSum(cid);
    }

    @Override
    public boolean delete(int id) {
        return itemCatDao.delete(id);
    }

    @Override
    public boolean update(int id, int status) {
        return itemCatDao.update(id,status);
    }

    @Override
    public boolean appItemCat(ItemCat itemCat) {
        return itemCatDao.add(itemCat);
    }

    @Override
    public ItemCat getItemCatByName(String name) {
        return itemCatDao.getItemCatByName(name);
    }
}
