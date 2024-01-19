package org.app.springboot_reservations.customer.service;


import org.app.springboot_reservations.customer.entity.Customer;
import org.app.springboot_reservations.customer.repository.ICustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements ICustomerService{

    @Autowired
    private ICustomerDao customerDao;
    @Override
    @Transactional(readOnly = true)
    public List<Customer> findAll() {
        return (List<Customer>) customerDao.findAll();
    }

    @Override
    @Transactional
    public void save(Customer customer) {
        customerDao.save(customer);
    }

    @Override
    @Transactional
    public void update(Customer customer) {
        customerDao.save(customer);
    }

    @Override
    @Transactional(readOnly = true)
    public Customer findOne(Long id) {
        Optional<Customer> customerOptional = customerDao.findById(id);
        return customerOptional.orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        customerDao.deleteById(id);
    }
}
