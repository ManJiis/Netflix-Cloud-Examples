package top.b0x0.cloud.netflix.provider2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import top.b0x0.cloud.netflix.api.EchoService;
import top.b0x0.cloud.netflix.common.exception.BusinessErrorException;

/**
 * @author ManJiis
 * @since 2021-07-16
 * @since JDK1.8
 */
@Service
public class EchoServiceImpl implements EchoService {
    private static final Logger log = LoggerFactory.getLogger(EchoServiceImpl.class);

    @Override
    public String sayHello(String param) {
        log.info("provider2 = {}", param);
        if ("error".equals(param)) {
            throw new BusinessErrorException("error oops...");
        }
        return "b0x0-provider2 -->  say ： " + param;
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
        return "b0x0-provider2 -->  Bonjour, " + name;
    }

    public String bonjourFallback(Throwable t) {
        return "Oops, failed: " + t.getClass().getCanonicalName();
    }

}
