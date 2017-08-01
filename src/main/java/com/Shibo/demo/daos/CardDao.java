/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Shibo.demo.daos;

import com.Shibo.demo.repo.CardRepo;
import com.Shibo.demo.entities.Card;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author s.ibrahim
 */
@Service
public class CardDao {

    @Autowired
    CardRepo cardRepo;

    public void save(Card c) {
        cardRepo.save(c);
    }

    public List<Card> getAllCards() {
        return (List<Card>) cardRepo.findAll();
    }
}
