package com.project.springbootdeployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/request")
public class CustomerController {
    @GetMapping
    public String getCustomer() {
        return "sucess";
    }
}
