/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Shibo.demo.repo;

import com.Shibo.demo.entities.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author s.ibrahim
 */

public interface CardRepo extends CrudRepository<Card, Long>{
    
}
