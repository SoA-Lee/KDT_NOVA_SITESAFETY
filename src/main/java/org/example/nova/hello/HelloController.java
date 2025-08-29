package org.example.nova.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hi")
    public String getHelloMessage() {
        return "하이";
    }

    @GetMapping("/hi2")
    public MyMessage getHelloMessage2() {
        return new MyMessage("하이2&넘버", 10000);
    }
}
