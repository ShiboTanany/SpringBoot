/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Shibo.demo.controllers;

import com.Shibo.demo.daos.CardDao;
import com.Shibo.demo.repo.CardRepo;
import com.Shibo.demo.entities.Card;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author s.ibrahim
 */
@RestController
@RequestMapping(path = "/Cards", produces = "application/json")
public class CardControllers {
    @Autowired
    CardRepo cardDao;
   
    @RequestMapping("/getAllCards")
    public List<Card> getAllCards(){
        return (List<Card>) cardDao.findAll();
    }
}
