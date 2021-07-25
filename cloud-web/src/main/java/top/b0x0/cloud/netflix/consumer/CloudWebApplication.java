package top.b0x0.cloud.netflix.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * http://localhost:9999/doc.html
 * EnableDiscoveryClient 服务注册与发现
 * EnableFeignClients 服务调用
 *
 * @author ManJiis
 */
@SpringBootApplication
@EnableScheduling
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "top.b0x0.cloud.netflix.consumer.feignservice")
public class CloudWebApplication {
    private static final Logger log = LoggerFactory.getLogger(CloudWebApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(CloudWebApplication.class, args);
        ConfigurableEnvironment env = applicationContext.getEnvironment();
        log.info("\n----------------------------------------------------------\n\t" +
                "Doc: http://localhost:{}/doc.html", env.getProperty("server.port"));
    }

}
