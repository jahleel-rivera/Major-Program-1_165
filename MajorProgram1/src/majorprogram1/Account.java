/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram1;

import java.util.ArrayList;

/**
 *
 * @author exchange
 */

public class Account {//Declaration of all properties

    private AccountType accountType;
    private String accountNumber;
    private double balance;
    ArrayList<Transaction> transactions;
    

    public Account(){//sets the properties to their default java values and instantiates the arraylist

        accountNumber = "";
        balance = 0.0;
        accountType = null;
        transactions = new ArrayList();
    }

    public int getNumTransactions(){// returns the number oof items in the Arraylist transactions
        return transactions.size();
    }
    public Transaction getTransactions(int index){// gets the transactions at the index in arraylist transaction
        return transactions.get(index);
    }
    public void addTransactions(Transaction trans3){// append the tansactions to the arraylist

        transactions.add(trans3);
        
        switch(trans3.getTransactionType()){
            case credit:
                balance += trans3.getAmount();
                break;
            case debit:
                balance -= trans3.getAmount();
                break;
            case transfer:
                break;
            default:
                break;
                
        }
    }

    public void setTransaction(int index, Transaction one){//stores item at location in index transaction
                
    }
    public Transaction removeTransaction(int index){//return and remove the transactionat location index
        return transactions.remove(index);
    }
    public String toString(){//includes all methods separated by a # character

        String s = "";
        for (int i=0; i < transactions.size(); i++){
            s += transactions.get(i).toString();
        }
        return accountType + "#" + accountNumber + "#" + balance + "#" + transactions.size() + s;
    }
    
    /**
     * @return the accountType
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * @param accountType the accountType to set
     */
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
}
