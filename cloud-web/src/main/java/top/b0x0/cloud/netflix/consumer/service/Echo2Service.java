package top.b0x0.cloud.netflix.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import top.b0x0.cloud.netflix.common.vo.R;

/**
 * b0x0-provider2
 *
 * @author TANG
 * @since 2021-07-19
 * @since JDK1.8
 */
@FeignClient(value = "b0x0-cloud-provider2")
@RequestMapping("/p2")
public interface Echo2Service {

    @GetMapping("/sayHello")
    R sayHello(@RequestParam("name") String name);

    @GetMapping("/bonjour")
    R bonjour(@RequestParam("name") String name);
}
