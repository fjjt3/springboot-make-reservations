package org.app.springboot_reservations.customer.controller;

import org.app.springboot_reservations.customer.entity.Customer;
import org.app.springboot_reservations.customer.service.ICustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class customerController {

    private ICustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return customerService.findAll();
    }

    @PostMapping("/customers")
    public ResponseEntity<String> addCustomer(Customer customer) {
        customerService.save(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body("customer added successfully");
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id){
        Customer customer = customerService.findOne(id);
        if (customer != null){
            return ResponseEntity.ok(customer);
        }else {
            return ResponseEntity.notFound().build();
        }
    }

}
