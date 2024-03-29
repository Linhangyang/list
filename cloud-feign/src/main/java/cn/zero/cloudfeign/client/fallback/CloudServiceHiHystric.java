package cn.zero.cloudfeign.client.fallback;

import cn.zero.cloudfeign.client.CloudServerHi;
import org.springframework.stereotype.Component;

/**
 * Email miles02@163.com
 *
 * @author fangzhipeng
 * create 2018-07-09
 **/
@Component
public class CloudServiceHiHystric implements CloudServerHi {

    @Override
    public String findCloudServerHi(String name) {
        return "hi, sorry, you are fail," + name;
    }

    @Override
    public String findCloudServerHello(String name) {
        return "hello, sorry, you are fail," + name;
    }
}