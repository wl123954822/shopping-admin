package cn.tjmj.serviceshopping.service.impl;

import cn.tjmj.serviceshopping.Dto.ItemTjPicDto;
import cn.tjmj.serviceshopping.dao.ItemTjPic;
import cn.tjmj.serviceshopping.service.ItemTjPicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-22 15:27
 */

@Service
public class ItemTjPicServiceImpl implements ItemTjPicService {

    @Autowired
    private ItemTjPic itemTjPic;
    @Override
    public List<ItemTjPicDto> getTjByItemId(int itemId) {
        return itemTjPic.getTjByItemId(itemId);
    }
}
