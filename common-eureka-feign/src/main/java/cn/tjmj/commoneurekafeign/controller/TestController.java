package cn.tjmj.commoneurekafeign.controller;


import cn.tjmj.commoneurekafeign.feignInterface.SchedualTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-20 9:53
 */
@RestController
@RequestMapping("/ts")
public class TestController {

    @Autowired
    SchedualTest schedualTest;

    @RequestMapping(value = "/b")
    public Map<String,Object> saa() {
        Map<String,Object> map =new HashMap<String, Object>();
        Object o =schedualTest.tes();
        map.put("list",o.toString());
        return map;
    }

    @RequestMapping(value = "/d")
    public String d(){
        return schedualTest.ad();
    }
}
