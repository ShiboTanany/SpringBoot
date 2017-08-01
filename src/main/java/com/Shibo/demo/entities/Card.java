/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Shibo.demo.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/**
 *
 * @author s.ibrahim
 */
@Entity
@Table(name = "card")
public class Card implements Serializable {

    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "card_id")
    private Long cardId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "balance")
    private BigDecimal balance;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "pin")
    private String pin;
    @JoinColumn(name = "cust_id", referencedColumnName = "customer_id")
    @ManyToOne(optional = false)
    private Customer custId;

    private static final long serialVersionUID = 1L;
    
    public Card() {
    }

    public Card(Long cardId) {
        this.cardId = cardId;
    }

    public Card(Long cardId, String pin, BigDecimal balance, Customer custId) {
        this.cardId = cardId;
        this.pin = pin;
        this.balance = balance;
        this.custId = custId;
    }

    public Card(Long cardId, String pin) {
        this.cardId = cardId;
        this.pin = pin;
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Customer getCustId() {
        return custId;
    }

    public void setCustId(Customer custId) {
        this.custId = custId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cardId != null ? cardId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Card)) {
            return false;
        }
        Card other = (Card) object;
        if ((this.cardId == null && other.cardId != null) || (this.cardId != null && !this.cardId.equals(other.cardId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entities.Card[ cardId=" + cardId + " ]";
    }

   
}
