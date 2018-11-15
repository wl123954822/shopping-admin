package cn.tjmj.serviceadmin.dao;

import cn.tjmj.serviceadmin.entity.Admin;

/**
 * 管理用户登陆dao
 *
 * @author wanglei
 * @create 2017-12-20 13:41
 */

public interface AdminLogin {

    //用户登陆
    Admin getUserBypsd(String adpsw);

    //访问页面之前判断是否可以登陆
    Admin getUserByToken(String token);
}
