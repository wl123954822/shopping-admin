package cn.tjmj.serviceshopping.service.impl;

import cn.tjmj.serviceshopping.dao.WxUserDao;
import cn.tjmj.serviceshopping.entity.User;
import cn.tjmj.serviceshopping.service.WxUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2018-01-04 14:23
 */

@Service
public class WxUserServiceImpl implements WxUserService {

    @Autowired
    private WxUserDao wxUserDao;


    @Override
    public List<User> wxUserList() {
        return wxUserDao.userList();
    }
}
