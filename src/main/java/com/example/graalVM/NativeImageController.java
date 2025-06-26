package com.example.graalVM;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NativeImageController {


    @GetMapping("")
    public String nativeImage() {
        return "Hello, Native!";
    }
}
