package cn.tjmj.serviceadmin.service;

import cn.tjmj.serviceadmin.entity.Admin;

/**
 * 管理登陆service
 *
 * @author wanglei
 * @create 2017-12-20 13:50
 */
public interface AdminLoginService {

    Admin getAdmin(String adpsw);

    //判断用户是否登陆
    Admin getAdminByToken(String token);
}
