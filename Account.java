import java.math.BigInteger;

public class Account {
    private BigInteger accountNumber;
    private Double balance;
    private String accountType;

    public Account(String accountNumberStr, Double initialBalance, String accountType) {
        this.accountNumber = new BigInteger(accountNumberStr);
        this.balance = initialBalance;
        this.accountType = accountType;
    }

    public BigInteger getAccountNumber() {
        return accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void addMoney(String amountStr){
        this.balance += Double.parseDouble(amountStr);
        System.out.println("Amount added to account " + accountNumber + ": " + amountStr + " Success");
    }

    public void takeMoney(String amountStr){
        if(Double.parseDouble(amountStr) > this.balance) {
            System.out.println("Not enough money in account " + accountNumber + ": " + amountStr + " Fail");
        }
        else{
            this.balance -= Double.parseDouble(amountStr);
            System.out.println("Amount taken from account " + accountNumber + ": " + amountStr + " Success");
        }
    }

    public void displayBalance(){
        System.out.println("Balance of " + this.accountNumber + " = " + this.balance);
    }

    public void displayAccountNumber(){
        System.out.println(this.accountNumber);
    }
}
