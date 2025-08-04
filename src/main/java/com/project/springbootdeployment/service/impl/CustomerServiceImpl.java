package com.project.springbootdeployment.service.impl;

import com.project.springbootdeployment.entity.Customer;
import com.project.springbootdeployment.repo.CustomerRepo;
import com.project.springbootdeployment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
   private final CustomerRepo customerRepo;
    @Override
    public Customer createCustomer(Customer customer) {
       return customerRepo.save(customer);
    }
}
