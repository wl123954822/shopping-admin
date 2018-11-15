package cn.tjmj.commoneurekafeign.feignInterface;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-20 9:41
 */
@FeignClient(value = "service-admin")
public interface SchedualTest {

    @RequestMapping(value = "/test/a")
    Object tes();

    @RequestMapping(value = "/test/c")
    String ad();
}
