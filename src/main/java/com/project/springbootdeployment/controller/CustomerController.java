package com.project.springbootdeployment.controller;

import com.project.springbootdeployment.entity.Customer;
import com.project.springbootdeployment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/request")
@RequiredArgsConstructor
public class CustomerController {

    private CustomerService customerService;
    @GetMapping
    public String getCustomer() {
        return "sucess";
    }

    @PostMapping("/savecus")
    public ResponseEntity<Customer> postCustomer(@RequestBody Customer customer) {
      Customer customer1 = customerService.createCustomer(customer);
      return ResponseEntity.ok(customer1);
    }
}
