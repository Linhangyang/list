package cn.zero.cloudfeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cloud-service-hi")
public interface CloudServerHi {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String findCloudServerHi(@RequestParam(value = "name") String name);
}
