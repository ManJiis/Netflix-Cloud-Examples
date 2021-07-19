# Spring Cloud Netflix Examples

Spring Cloud Netflix 组件学习。

1. 服务注册与发现
服务端：启动类加上`@EnableEurekaServer`注解
```
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
        </dependency>
```
客户端：启动类加上`@EnableDiscoveryClient`注解
```
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
        </dependency>
```

2. 配置中心 
```

```
3. 流量控制、熔断降级、系统负载保护
```

```


