/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram1;


import javax.swing.JOptionPane;

/**
 *
 * @author exchange
 */
public class MajorProgram1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Account account1 = new Account();
        Customer customer1 = new Customer();
        CyberBank bank1 = new CyberBank();
        TransactionType tr = TransactionType.valueOf("credit");
        TransactionType tr1 = TransactionType.valueOf("debit");
        Transaction trans4 = new Transaction (tr, "01/18/1998", 100, "word");
        Transaction trans5 = new Transaction (tr1, "10/31/1998", 200, "yes" );
        account1.setBalance(800);
        account1.addTransactions(trans4);
        account1.addTransactions(trans5);
        account1.setAccountType(AccountType.savings);
        account1.setAccountNumber("2546");
        customer1.setFirstName("Kevin");
        customer1.setLastName("McGee");
        customer1.setCustomerId(3450);
        customer1.setDob("09/18/1989");
        customer1.setAddress("2595 Nuggets Court");
        customer1.setPhoneNumber("656-778-9012");
        customer1.setPin(9813);
        customer1.addAccounts(account1);
        bank1.addCustomer(customer1);
        bank1.setBankName("Navy Federal Credit Union");
        bank1.setPhoneNumber("656-789-4231");
        bank1.setAddress("3035 Warriors Lane");
        
        

        CyberBank cb = new CyberBank();
        cb.loadBankData(args[0]);
        cb.saveBankData(args[1]);
        

        
        
        
        
        account1.toString();

        JOptionPane.showMessageDialog(null, cb.toString());

        
        

        // TODO code application logic here
    }
    
}
