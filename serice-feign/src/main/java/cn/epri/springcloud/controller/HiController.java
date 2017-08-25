package cn.epri.springcloud.controller;

import cn.epri.springcloud.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ author 王猛  E-mail: epriwangmeng@163.com
 * @ date 创建时间：2017/8/24 11:16
 * @ version 1.0
 * @ parameter
 * @ since
 * @ return
 * @ 说明：
 */

@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value="/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }

}
