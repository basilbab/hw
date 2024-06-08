package com.helloworld2.hw.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.helloworld2.hw.model.Customer;
@Repository
public interface CustomerInterface extends CrudRepository<Customer,Integer>{

}
