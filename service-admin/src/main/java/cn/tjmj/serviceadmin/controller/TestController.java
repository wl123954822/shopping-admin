package cn.tjmj.serviceadmin.controller;

import cn.tjmj.serviceadmin.entity.User;
import cn.tjmj.serviceadmin.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-19 15:43
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/a")
    public Map<String,Object> asd(){
            Map<String,Object> map = new HashMap<String, Object>();
        List<User> list =testService.getAll();

        map.put("list",list);
        return  map;
    }

    @RequestMapping("/c")
    public String sad(){
        return "成功啦";
    }
}
