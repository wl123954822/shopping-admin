package cn.tjmj.serviceshopping.service;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-22 15:27
 */

import cn.tjmj.serviceshopping.Dto.ItemTjPicDto;

import java.util.List;

/**
 * 统计商品销售图表
 */
public interface ItemTjPicService  {

    List<ItemTjPicDto> getTjByItemId(int itemId);

}
