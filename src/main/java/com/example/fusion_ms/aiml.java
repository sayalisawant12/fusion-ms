package com.example.fusion_ms;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aiml {
    @GetMapping("/aiml")

    public String getData() {
        return  "Welcome...! to AIMl  class" ;
    }
}


