package top.b0x0.cloud.netflix.consumer.feignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.b0x0.cloud.netflix.common.vo.R;

/**
 * b0x0-provider1
 *
 * @author TANG
 * @since 2021-07-19
 * @since JDK1.8
 */
@FeignClient(value = "b0x0-cloud-provider1")
@RequestMapping("/p1")
public interface Echo1Service {

    @GetMapping(value = "/sayHello")
    R sayHello(@RequestParam("name") String name);

    @GetMapping(value = "/bonjour")
    R bonjour(@RequestParam("name") String name);
}
