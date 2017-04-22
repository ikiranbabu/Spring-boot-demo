package com.luv2code.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.luv2code.config.entity.Customer;


@Repository("CustomerDAO")
@Transactional
public interface CustomerDAO extends CrudRepository<Customer, Integer> {

    public List<Customer> findAll();
}
