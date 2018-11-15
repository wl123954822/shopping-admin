package cn.tjmj.serviceadmin.service.serviceImpl;

import cn.tjmj.serviceadmin.dao.AdminLogin;
import cn.tjmj.serviceadmin.entity.Admin;
import cn.tjmj.serviceadmin.service.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 登陆
 *
 * @author wanglei
 * @create 2017-12-20 13:52
 */

@Service
public class AdminLoginServiceImpl implements AdminLoginService {

    @Autowired
    private AdminLogin adminLogin;

    @Override
    public Admin getAdmin(String adpsw) {
        return adminLogin.getUserBypsd(adpsw);
    }


    @Override
    public Admin getAdminByToken(String token) {
        return adminLogin.getUserByToken(token);
    }
}
