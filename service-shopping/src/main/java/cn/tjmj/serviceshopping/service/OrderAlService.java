package cn.tjmj.serviceshopping.service;

import cn.tjmj.serviceshopping.Dto.ItemDto;
import cn.tjmj.serviceshopping.Dto.OrderAlDto;
import cn.tjmj.serviceshopping.Dto.OrderDetilDto;
import cn.tjmj.serviceshopping.Dto.OrderTj;
import cn.tjmj.serviceshopping.entity.Address;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-27 10:43
 */
public interface OrderAlService {

    List<OrderAlDto> getList();

    List<OrderDetilDto> getItemList(int orderId);

    String getNickName(int userId);

    List<Address> getAddress(int areaId);

    int OrderNum();

    List<OrderTj> MonthOrderNum();

    List<OrderAlDto> getOldList();

    List<OrderAlDto> getNewList();

    boolean delive(int orderAlId);

    int  getAlOrderNum();
 }
