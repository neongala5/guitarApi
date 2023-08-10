package com.example.guitarApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/jazz")
    public String whatIAmNot() {
        return "Jazz Guitar";
    }
}
