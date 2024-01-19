package org.app.springboot_reservations.customer.service;

import org.app.springboot_reservations.customer.entity.Customer;

import java.util.List;

public interface ICustomerService {

    public List<Customer> findAll();
    public void save(Customer customer);
    public void update(Customer customer);
    public Customer findOne(Long id);
    public void delete(Long id);
}
