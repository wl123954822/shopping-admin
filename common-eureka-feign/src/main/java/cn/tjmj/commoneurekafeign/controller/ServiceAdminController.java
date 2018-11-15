package cn.tjmj.commoneurekafeign.controller;

import cn.tjmj.commoneurekafeign.feignInterface.Schedual;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-28 11:25
 */
@RestController
@RequestMapping("/fad")
public class ServiceAdminController {

    @Autowired
    Schedual schedual;

    @RequestMapping("/ad")
    public Object objad(){
        return schedual.admin();
    }

}
