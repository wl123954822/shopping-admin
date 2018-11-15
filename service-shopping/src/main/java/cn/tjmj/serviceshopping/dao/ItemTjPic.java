package cn.tjmj.serviceshopping.dao;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-22 15:01
 */

import cn.tjmj.serviceshopping.Dto.ItemTjPicDto;

import java.util.List;

/**
 * 商品销售统计
 */
public interface ItemTjPic {

    List<ItemTjPicDto> getTjByItemId(int itemId);

}
