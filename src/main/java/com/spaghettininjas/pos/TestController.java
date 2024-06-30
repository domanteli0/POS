package com.spaghettininjas.pos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

    @GetMapping("/")
    String get() {
        return "Hello, World!";
    }
}
