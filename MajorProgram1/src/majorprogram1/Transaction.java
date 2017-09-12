/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram1;

/**
 *
 * @author exchange
 */

public class Transaction {//Declaration of all properties

    private String date;
    private double amount;
    private String description;
    private TransactionType transactionType;
    

    public Transaction(){// This method is meant to intialize all properties to their java defaults

        date = "";
        description = "";
        amount = 0.0;
        transactionType = null;
  
    }

    public String toString(){//used to separate each property in order using line separator method
        return System.lineSeparator()+ transactionType + "#" + date + "#" + amount + "#" + description;
        
    }
    public Transaction(TransactionType transactionType, String date, double amount, String description){//method used to set called properties to new arguements

        this.transactionType = transactionType;
        this.date = date;
        this.amount = amount;
        this.description = description;
    
    }
    /**
     * @return the date
     */

    public String getDate() {//method to return the value passed to date

        return date;
    }

    /**
     * @param date the date to set
     */

    public void setDate(String date) {//method to set property date to called parameter

        this.date = date;
    }

    /**
     * @return the amount
     */

    public double getAmount() {//method to return the amount value

        return amount;
    }

    /**
     * @param amount the amount to set
     */

    public void setAmount(double amount) {//method to set called property to new arguement being passed

        this.amount = amount;
    }

    /**
     * @return the description
     */

    public String getDescription() {//method to return description

        return description;
    }

    /**
     * @param description the description to set
     */

    public void setDescription(String description) {//method to set called property to new arguement being called

        this.description = description;
    }

    /**
     * @return the transactionType
     */

    public TransactionType getTransactionType() {//method to return transactionType

        return transactionType;
    }

    /**
     * @param transactionType the transactionType to set
     */

    public void setTransactionType(TransactionType transactionType) {//method to set called property to new arguement to new arguement being called

        this.transactionType = transactionType;
    }

}
