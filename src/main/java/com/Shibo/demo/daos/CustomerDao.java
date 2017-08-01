/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Shibo.demo.daos;

import com.Shibo.demo.repo.CardRepo;
import com.Shibo.demo.repo.CustomerRepo;
import com.Shibo.demo.entities.Card;
import com.Shibo.demo.entities.Customer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author s.ibrahim
 */
@Service
public class CustomerDao {

    @Autowired
    CustomerRepo customerRepo;

    public void save(Customer c) {
        customerRepo.save(c);
    }

    @JsonIgnore
    public List<Customer> getAllCustomers() {
        return (List<Customer>) customerRepo.findAll();
    }
}
