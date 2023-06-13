package service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import service.HelloService;

/**
 * @Title: HelloServiceImpl
 * @Author Mr.罗
 * @Package service.Impl
 * @Date 2023/6/13 11:41
 * @description: 服务实现类
 */

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        try {
            /*模拟网络延迟（测试超时机制）
            spring配置文件中配置为超时不能超过两秒，超过两秒就报错，这里使用线程等待3秒模拟超时机制报错结果
            所以我们在配置spring配置文件时，网络延迟下有些场景我们避免报错的话就可以将
            <dubbo:provider timeout=""/>中timeout设置久一点，在网络延迟范围内就不会报错
            */
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Hello" + " " + name;
    }

    @Override
    public String sayNo() {
        System.out.println("No方法被调用了");
        return "no";
    }
}
