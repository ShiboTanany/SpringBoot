/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Shibo.demo.daos;

import com.Shibo.demo.entities.Transaction;
import com.Shibo.demo.repo.TransactionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author s.ibrahim
 */
@Service
public class TransactionDao {
    
    @Autowired
    TransactionRepo transactionRepo;

    public void save(Transaction c) {
        transactionRepo.save(c);
    }

    public List<Transaction> getAllTransactions() {
        return (List<Transaction>) transactionRepo.findAll();
    }
}
