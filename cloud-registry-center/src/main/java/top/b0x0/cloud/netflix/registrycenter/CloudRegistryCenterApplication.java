package top.b0x0.cloud.netflix.registrycenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author ManJiis
 */
@SpringBootApplication
@EnableScheduling
@EnableEurekaServer
public class CloudRegistryCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudRegistryCenterApplication.class, args);
    }

}
