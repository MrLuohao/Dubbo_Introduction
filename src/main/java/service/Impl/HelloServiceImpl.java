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
        return "Hello" + " " + name;
    }
}
