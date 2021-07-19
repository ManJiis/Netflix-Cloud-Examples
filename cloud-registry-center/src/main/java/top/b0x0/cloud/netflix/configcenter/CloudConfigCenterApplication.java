package top.b0x0.cloud.netflix.configcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author ManJiis
 */
@SpringBootApplication
@EnableScheduling
public class CloudConfigCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigCenterApplication.class, args);
    }

}
