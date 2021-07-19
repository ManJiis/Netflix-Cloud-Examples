package top.b0x0.cloud.netflix.provider2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.b0x0.cloud.netflix.api.EchoService;
import top.b0x0.cloud.netflix.common.vo.R;

/**
 * @author TANG
 * @since 2021-07-19
 * @since JDK1.8
 */
@RestController
@RequestMapping("/p2")
public class EchoController {

    @Autowired
    EchoService echoService;

    @GetMapping("/sayHello")
    public R sayHello(@RequestParam("name") String name) {
        String sayHello = echoService.sayHello(name);
        return R.ok(sayHello);
    }

    @GetMapping("/bonjour")
    public R bonjour(@RequestParam("name") String name) {
        String bonjour = echoService.bonjour(name);
        return R.ok(bonjour);
    }
}
