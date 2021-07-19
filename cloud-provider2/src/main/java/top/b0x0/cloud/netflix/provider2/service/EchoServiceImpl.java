package top.b0x0.cloud.netflix.provider2.service;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import top.b0x0.cloud.netflix.api.EchoService;

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
        log.info("provider2 = {}", param);
        if ("error".equals(param)) {
            throw new RuntimeException("error oops...");
        }
        return param;
    }

    // Fallback 函数，函数签名与原函数一致或加一个 Throwable 类型的参数.
    public String helloFallback(String s) {
        return String.format("provide2 --> EchoServiceImpl sayHello %s", s);
    }

    // Block 异常处理函数，参数最后多一个 BlockException，其余与原函数一致.
    public String exceptionHandler(String s, BlockException ex) {
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

    @Override
    public String bonjour(String name) {
        return "Bonjour, " + name;
    }

    public String bonjourFallback(Throwable t) {
        if (BlockException.isBlockException(t)) {
            return "Blocked by Sentinel: " + t.getClass().getSimpleName();
        }
        return "Oops, failed: " + t.getClass().getCanonicalName();
    }

}
