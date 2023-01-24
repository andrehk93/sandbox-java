package com.test.sandbox.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/api/test")
    private String Hello() {
        return "Hello world";
    }

    @GetMapping("/api/hello")
    private String HelloWorld() {
        return "Hello Docker World";
    }
}
