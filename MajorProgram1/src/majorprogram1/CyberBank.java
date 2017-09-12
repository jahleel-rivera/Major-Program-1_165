/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram1;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author exchange
 */

public class CyberBank {//declaration of properties


    private String bankName;
    private String address;
    private String phoneNumber;
    private double bankBalance;
    ArrayList<Customer> customers;


    public CyberBank() {//Setting properties to java defaults and instantiating the arraylist

        bankName = "";
        address = "";
        phoneNumber = "";
        bankBalance = 0.0;
        customers = new ArrayList();

    }

    public void loadBankData(String inputFileName){//method to read in the bank data from a file
        try{
            double amount = 0.0;
            Scanner scan = new Scanner(new File(inputFileName));
            String done = scan.nextLine();
            String [] m = done.split("#");
            setBankName(m[0]);
            setAddress(m[1]);
            setPhoneNumber(m[2]);
            while(scan.hasNext()){
                String done2 = scan.nextLine();
                String [] m2 = done2.split("#");
                Customer customer = new Customer();
                customer.setFirstName(m2[0]);
                customer.setLastName(m2[1]);
                customer.setCustomerId(Integer.parseInt(m2[2]));
                customer.setDob(m2[3]);
                customer.setAddress(m2[4]);
                customer.setPhoneNumber(m2[5]);
                customer.setPin(Integer.parseInt(m2[6]));
                int numAccounts = Integer.parseInt(m2[7]);
                for(int j = 0; j < numAccounts; j++){
                    Account account = new Account();
                    done = scan.nextLine();
                    m2 = done.split("#");
                    account.setAccountType(AccountType.valueOf(m2[0]));
                    account.setAccountNumber(m2[1]);
                    amount += Double.parseDouble(m2[2]);
                    account.setBalance(Double.parseDouble(m2[2]));
                    int numTransactions = Integer.parseInt(m2[3]);
                        for(int r = 0;r < numTransactions; r++){
                            Transaction transaction = new Transaction();
                            done2= scan.nextLine();
                            m2 = done2.split("#");
                            transaction.setTransactionType(TransactionType.valueOf(m2[0]));
                            transaction.setDate(m2[1]);
                            transaction.setAmount(Double.parseDouble(m2[2]));
                            transaction.setDescription(m2[3]);
                            account.addTransactions(transaction);
                            
                        }
                        customer.addAccounts(account);
                    
                    
                }
                addCustomer(customer);
            }
            setBankBalance(amount);
        }
        catch(FileNotFoundException ex){
            System.out.print("The File was not found");
        }
    }
    
    public void saveBankData(String inputFileName){//method to write bank data to a file
        try{
            PrintWriter wp = new PrintWriter(new File(inputFileName));
            wp.print(toString());wp.close();
        }catch(FileNotFoundException ex){
            System.out.print("The File was not saved");
            
        }
    }
    @Override
    public String toString(){//creates a stringwith all the bank data that matches the input of the input file

        String s = "";
        for(int i=0; i <customers.size(); i++){
            s += customers.get(i).toString();
        }
        return bankName + "#" + address + "#" + phoneNumber + System.lineSeparator() + s;
    }

    public void addCustomer(Customer customer1){//method to set called property to new arguement

        customers.add(customer1);
    }

    /**
     * @return the bankName
     */

    public String getBankName() {//method to return bankname value

        return bankName;
    }

    /**
     * @param bankName the bankName to set
     */

    public void setBankName(String bankName) {//method to set called property to the new arguement

        this.bankName = bankName;
    }

    /**
     * @return the address
     */

    public String getAddress() {//method to return address

        return address;
    }

    /**
     * @param address the address to set
     */

    public void setAddress(String address) {//method to set called property to new arguement

        this.address = address;
    }

    /**
     * @return the phoneNumber
     */

    public String getPhoneNumber() {//method to return phonenumber

        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */

    public void setPhoneNumber(String phoneNumber) {//method to set called property to new arguement

        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the bankBalance
     */

    public double getBankBalance() {//method to return bankbalance
        return bankBalance;
    }
    
    public Customer authenticateCustomer(int customerId, int pin){//checks to see if the given customerid has a pin that matches it

        for(int i = 0; i<customers.size(); i++){
            if(pin == customers.get(i).getPin() && customerId == customers.get(i).getCustomerId()){
                return customers.get(i);
            }
        }
        return null;
    }

    /**
     * @param bankBalance the bankBalance to set
     */

    public void setBankBalance(double bankBalance) {//method to set called property to new arguement
        this.bankBalance = bankBalance;
    }

    

}
