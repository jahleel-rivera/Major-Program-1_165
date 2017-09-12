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

public class Customer {//declaration of all class properties

    private String firstName;
    private String lastName;
    private int customerId;
    private String dob;
    private String address;
    private String phoneNumber;
    private int pin;
    ArrayList<Account> accounts;

public Customer(){//set properties to java defaults and instantiate the arraylist

    firstName = "";
    lastName = "";
    customerId = 0;
    dob = "";
    address = "";
    phoneNumber = "";
    pin = 0;
    accounts = new ArrayList();
}

    public int getNumAccounts(){//return the number of items in the arraylist accounts
        return accounts.size();
    }
    public Account getAccounts(int index){// method to get the accounts at location index in arraylist accounts
        return accounts.get(index);
    }
    public void setAccount(int index, Account person){//stores itwm at loocation index in arraylist accounts
        
    }
    public void addAccounts(Account acc4){//append the accounts to arraylist
        accounts.add(acc4);
    }
    public Account removeAccount(int index){//remove and return the accounts at location index
        return accounts.remove(index);
    }
    public String toString(){//all properties separated by a # character

        String s = "";
        for(int i = 0;i < accounts.size(); i++){
            s += accounts.get(i).toString();
        }
        return firstName + "#" + lastName + "#" + customerId + "#" + dob + "#" + address + "#" + phoneNumber + "#" + pin + "#" + accounts.size() + System.lineSeparator() + s;
    }
    /**
     * @return the firstName
     */
    public String getFirstName() {//method to return firstname

        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */

    public void setFirstName(String firstName) {//method to set called property to new arguement

        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */

    public String getLastName() {//method to return lastname

        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */

    public void setLastName(String lastName) {//method to set called property to new arguement

        this.lastName = lastName;
    }

    /**
     * @return the customerId
     */

    public int getCustomerId() {//method to return customerId

        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */

    public void setCustomerId(int customerId) {//method to set  called property to new arguement

        this.customerId = customerId;
    }

    /**
     * @return the dob
     */

    public String getDob() {// method to return dob

        return dob;
    }

    /**
     * @param dob the dob to set
     */

    public void setDob(String dob) {//method to set called property to new arguement

        this.dob = dob;
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
    public String getPhoneNumber() {//method to return called phonenumber 

        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */

    public void setPhoneNumber(String phoneNumber) {//method to set caalled property to new arguement

        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the pin
     */

    public int getPin() {// method to return value of pin

        return pin;
    }

    /**
     * @param pin the pin to set
     */

    public void setPin(int pin) {//method to set called property to new arguement

        this.pin = pin;
    }
    
}
