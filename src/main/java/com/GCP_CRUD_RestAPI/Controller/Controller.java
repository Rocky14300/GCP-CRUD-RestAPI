package com.GCP_CRUD_RestAPI.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("greet/{name}")
    private String greet(@PathVariable String name){
        return "Hello "+name;
    }
}
