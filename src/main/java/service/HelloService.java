package service;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @Title: HelloService
 * @Author Mr.罗
 * @Package service
 * @Date 2023/6/13 11:40
 * @description: 服务接口
 */

public interface HelloService {

    String sayHello(String name);
}
