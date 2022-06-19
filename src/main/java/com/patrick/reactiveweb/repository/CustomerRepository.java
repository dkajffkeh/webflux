package com.patrick.reactiveweb.repository;

import com.patrick.reactiveweb.domain.Customer;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface CustomerRepository extends ReactiveCrudRepository<Customer, Long> {

    @Query("SELECT * FROM CUSTOMER WHERE last_name = :lastname")
    Flux<Customer> findByLastName(String lastname);
}
