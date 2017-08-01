/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Shibo.demo.controllers;

import com.Shibo.demo.daos.CustomerDao;
import com.Shibo.demo.repo.CustomerRepo;
import com.Shibo.demo.entities.Customer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author s.ibrahim
 */
@RestController
@RequestMapping(path = "/Customers", produces = "application/json")
public class CustomerControllers {
    @Autowired
    CustomerRepo customerDao;
    
    @RequestMapping("/getAllCustomers")
    public List<Customer> getAllCustomers(){
    
    return (List<Customer>) customerDao.findAll();}
            
    
}
