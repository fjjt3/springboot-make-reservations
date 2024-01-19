package org.app.springboot_reservations.customer.repository;

import org.app.springboot_reservations.customer.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerDao extends CrudRepository<Customer, Long> {
}
