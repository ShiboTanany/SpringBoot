/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Shibo.demo.repo;
import com.Shibo.demo.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author s.ibrahim
 */

public interface CustomerRepo extends CrudRepository<Customer, Long> {
   // Customer findByName(String name);
}
