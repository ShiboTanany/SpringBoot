/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Shibo.demo.controllers;

import com.Shibo.demo.daos.TransactionDao;
import com.Shibo.demo.entities.Transaction;
import com.Shibo.demo.repo.TransactionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author s.ibrahim
 */
@RestController
@RequestMapping(path = "/Transactions", produces = "application/json")
public class TransactionController {
    
    @Autowired
    TransactionRepo transactionDao;
    
    @RequestMapping("/getAllTransactions")
    public List<Transaction> getAllTransactions(){
    
    return (List<Transaction>) transactionDao.findAll();}
}
