package com.Shibo.demo.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Transaction")
public class Transaction implements Serializable{

    @Size(max = 10)
    @Column(name = "date")
    private String date;

    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_id")
    private Integer transactionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "pan")
    private String pan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "balance")
    private double balance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "action_code")
    private int actionCode;
      
        
	
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

    public Transaction() {
    }

    public Transaction(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Transaction(Integer transactionId, String pan, double balance, int actionCode) {
        this.transactionId = transactionId;
        this.pan = pan;
        this.balance = balance;
        this.actionCode = actionCode;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

   
    public int getActionCode() {
        return actionCode;
    }

    public void setActionCode(int actionCode) {
        this.actionCode = actionCode;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transactionId != null ? transactionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaction)) {
            return false;
        }
        Transaction other = (Transaction) object;
        if ((this.transactionId == null && other.transactionId != null) || (this.transactionId != null && !this.transactionId.equals(other.transactionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Shibo.demo.entities.Transaction[ transactionId=" + transactionId + " ]";
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }




}
