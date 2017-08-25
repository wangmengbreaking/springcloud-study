package cn.epri.springcloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ author 王猛  E-mail: epriwangmeng@163.com
 * @ date 创建时间：2017/8/24 11:14
 * @ version 1.0
 * @ parameter
 * @ since
 * @ return
 * @ 说明：
 */

@FeignClient(value="service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
