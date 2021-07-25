package top.b0x0.cloud.netflix.consumer.feignclient;

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
@FeignClient(value = "b0x0-cloud-provider1", fallback = Echo1Client.HystrixClientFallback.class)
@RequestMapping("/p1")
public interface Echo1Client {

    @GetMapping(value = "/sayHello")
    R sayHello(@RequestParam("name") String name);

    @GetMapping(value = "/bonjour")
    R bonjour(@RequestParam("name") String name);

     class HystrixClientFallback implements Echo1Client {
        @Override
        public R sayHello(String name) {
            return null;
        }

        @Override
        public R bonjour(String name) {
            return null;
        }
    }
}
