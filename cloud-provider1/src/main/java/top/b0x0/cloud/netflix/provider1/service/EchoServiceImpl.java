package top.b0x0.cloud.netflix.provider1.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import top.b0x0.cloud.netflix.api.EchoService;
import top.b0x0.cloud.netflix.common.exception.BusinessErrorException;

/**
 * @author ManJiis
 * @since 2021-07-16
 * @since 1.8
 */
@Service
public class EchoServiceImpl implements EchoService {
    private static final Logger log = LoggerFactory.getLogger(EchoServiceImpl.class);

    @Override
    public String sayHello(String param) {
        log.info("provider1 say : {}", param);
        if ("error".equals(param)) {
            throw new BusinessErrorException("error oops...");
        }
        return "provider1 say : " + param;
    }

    @Override
    public String bonjour(String name) {
        return "provider1 bonjour : " + name;
    }

    // Fallback 函数，函数签名与原函数一致或加一个 Throwable 类型的参数.
    public String helloFallback(String s) {
        return String.format("provide1 --> EchoServiceImpl sayHello %s", s);
    }

    // Block 异常处理函数，参数最后多一个 BlockException，其余与原函数一致.
    public String exceptionHandler(String s, BusinessErrorException ex) {
        // Do some log here.
        ex.printStackTrace();
        return "Oops, error occurred at " + s;
    }

    public String helloFallback(String s, Throwable ex) {
        // Do some log here.
        ex.printStackTrace();
        return "Oops, error occurred at " + s;
    }

    public String defaultFallback() {
        log.info("Go to default fallback");
        return "default_fallback";
    }

}
