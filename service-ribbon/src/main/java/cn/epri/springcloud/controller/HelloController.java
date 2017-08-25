package cn.epri.springcloud.controller;

import cn.epri.springcloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ author 王猛  E-mail: epriwangmeng@163.com
 * @ date 创建时间：2017/8/24 10:49
 * @ version 1.0
 * @ parameter
 * @ since
 * @ return
 * @ 说明：
 */

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
