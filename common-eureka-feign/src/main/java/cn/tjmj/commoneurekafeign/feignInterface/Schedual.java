package cn.tjmj.commoneurekafeign.feignInterface;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-28 11:24
 */
@FeignClient("service-admin")
public interface Schedual {

    @RequestMapping("/admin/**")
    Object admin();
}
