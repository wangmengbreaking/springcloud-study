package cn.epri.springcloud;

import org.springframework.stereotype.Component;

/**
 * @ author 王猛  E-mail: epriwangmeng@163.com
 * @ date 创建时间：2017/8/24 12:09
 * @ version 1.0
 * @ parameter
 * @ since
 * @ return
 * @ 说明：
 */

@Component
public class SchedualServiceHiHystric implements  SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name){
        return "sorry "+ name;
    }

}
