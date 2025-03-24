import java.util.*;

public class Bank {
    String bankName;
    ArrayList<Account> accounts;

    public Bank(String bankName, ArrayList<Account> accounts) {
        this.bankName = bankName;
        this.accounts = accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
        account.getAccountNumber();
        account.getBalance();
        account.getAccountType();

    }

    public void listAccounts() {
        if(accounts.isEmpty()){
            System.out.println("No accounts found");
         }else{
            for (Account account : accounts) {
                System.out.println();
                System.out.println("Account number: ");
                account.displayAccountNumber();
                account.displayBalance();
            }
        }
    }

}
