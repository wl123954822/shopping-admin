package cn.tjmj.serviceadmin.controller;

import cn.tjmj.serviceadmin.Enum.ResultEnum;
import cn.tjmj.serviceadmin.Vo.ResultVo;
import cn.tjmj.serviceadmin.entity.Admin;
import cn.tjmj.serviceadmin.entity.User;
import cn.tjmj.serviceadmin.service.AdminLoginService;
import cn.tjmj.serviceadmin.util.CookieUtil;
import cn.tjmj.serviceadmin.util.RegExpUtil;
import cn.tjmj.serviceadmin.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-20 13:54
 */

//用户登录
@RestController
@RequestMapping("/admin")
public class AdminLoginController {

    @Autowired
    private AdminLoginService adminLoginService;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/login")
    public Map<String,Object> login(String adusr, String adpsw, HttpServletResponse response){

        Map<String,Object> map = new HashMap<>();
        if (RegExpUtil.isNull(adpsw+"") || RegExpUtil.isNull(adusr+"")) {
           map.put("status","error");
           map.put("text","参数为空");
        }else {
            Admin admin = adminLoginService.getAdmin(adpsw);
            String adminUsr = admin.getAduser();
            if (adminUsr.equals(adusr)){
                //设置token
                String token= admin.getToken();

                if ( redisTemplate.opsForValue().get(token)==null){
                    redisTemplate.opsForValue().set(token, admin.getId());
                }else {

                    if (!redisTemplate.opsForValue().get(token).equals(admin.getId())) {
                        //存入缓存
                        redisTemplate.opsForValue().set(token, admin.getId());
                    }
                }
                //给前端页面返回
                map.put("status","success");
                map.put("text","登陆成功");
                map.put("token",token);
            }else{
                map.put("status","error");
                map.put("text","密码错误");
            }
        }
        return map;
        }


        @RequestMapping("/check")
    public Map<String,Object>  isLogin(String token){
        Map<String,Object> map = new HashMap<>();
              Admin admin = adminLoginService.getAdminByToken(token);

              if (admin ==null){
                  map.put("status","error");
              }else {
                  map.put("status","success");
              }

                return map;
        }
}
