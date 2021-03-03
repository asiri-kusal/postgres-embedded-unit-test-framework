package com.github.asirikusal.dao;

import java.util.Optional;

import com.github.asirikusal.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * main customer repository
 */
@Repository
@Transactional
public interface CustomerRepository extends CrudRepository<Customer, Long> {

	Optional<Customer> findCustomerByName(String name);
}
