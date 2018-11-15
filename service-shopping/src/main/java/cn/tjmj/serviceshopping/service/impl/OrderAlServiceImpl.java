package cn.tjmj.serviceshopping.service.impl;

import cn.tjmj.serviceshopping.Dto.ItemDto;
import cn.tjmj.serviceshopping.Dto.OrderAlDto;
import cn.tjmj.serviceshopping.Dto.OrderDetilDto;
import cn.tjmj.serviceshopping.Dto.OrderTj;
import cn.tjmj.serviceshopping.dao.OrderDao;
import cn.tjmj.serviceshopping.entity.Address;
import cn.tjmj.serviceshopping.entity.Order;
import cn.tjmj.serviceshopping.service.OrderAlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-27 10:44
 */

@Service
public class OrderAlServiceImpl implements OrderAlService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public List<OrderAlDto> getList() {
        return orderDao.getList();
    }

    @Override
    public List<OrderDetilDto> getItemList(int orderId) {
        return orderDao.getItemList(orderId);
    }

    @Override
    public String getNickName(int userId) {
        return orderDao.getNickName(userId);
    }

    @Override
    public List<Address> getAddress(int areaId) {
        return orderDao.getAddress(areaId);
    }

    @Override
    public int OrderNum() {
        return orderDao.getOrderNum();
    }

    @Override
    public List<OrderTj> MonthOrderNum() {
        return orderDao.getMonthOrNum();
    }

    @Override
    public List<OrderAlDto> getOldList() {
        return orderDao.getOldOrder();
    }

    @Override
    public List<OrderAlDto> getNewList() {
        return orderDao.getNewOrder();
    }

    @Override
    public boolean delive(int orderAlId) {
        return orderDao.deLiver(orderAlId);
    }

    @Override
    public int getAlOrderNum() {
        return orderDao.getOrderANum();
    }


}
