package cn.tjmj.commoneurekaclient.controller;

import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-18 15:52
 */

@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc(){
        String services = "Services: " + discoveryClient.getServices();

        System.out.println(services);

        return services;
    }
}
