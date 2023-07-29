package com.gfg.L05demospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/Hello")
    public String getHello(){
        String msg="Hello from the spring-boot-demo thread->  "+Thread.currentThread().getName();
        return msg;
    }


}
