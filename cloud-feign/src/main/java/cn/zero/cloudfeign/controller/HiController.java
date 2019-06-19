package cn.zero.cloudfeign.controller;

import cn.zero.cloudfeign.client.CloudServerHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private CloudServerHi cloudServerHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return cloudServerHi.findCloudServerHi(name);
    }
}
