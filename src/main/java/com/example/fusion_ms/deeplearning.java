package com.example.fusion_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class deeplearning {
    @GetMapping("/deeplearning")

    public String getData() {
        return  "Welcome...! .we are a devops...to DL class" ;
    }
}
