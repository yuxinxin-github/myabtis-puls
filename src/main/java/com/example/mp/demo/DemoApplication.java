package com.example.mp.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

/*
interfaces:用户接口层，面向前端提供服务适配，面向资源层提供资源适配。这一层聚集了接口适配相关的功能。
application：应用层：实现服务组合和编排，适应业务流程快速变化的需求。这一层聚集了应用服务和事件相关的功能
domain：领域层：实现领域层的核心业务逻辑。这一层聚集了领域模型的聚合、聚合根、实体、值对象、
                领域服务和事件等领域对象，以及他们组合锁形成的业务能力
infrastructure：基础层：贯穿所有曾，为各层提供基础资源服务。这一层聚集了各种底层资源相关的服务和能力。


用户接口层 可以调用下面的三层
应用层可以调用下面的两层
领域层可以调用基础层


config：
dict：常量、字典
exception：各微服务自定义异常
util：主要存放平台、开发框架、消息、数据库、缓存、文件、总线、网关、第三方类库、通用方法


 */
