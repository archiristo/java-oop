import java.util.ArrayList;

public class bankMain {
    public static void main(String[] args) {
        Bank bank = new Bank("dkbank", new ArrayList<>());
        System.out.println("Welcome to " + bank.bankName);
        System.out.println();
        Account acc1 = new Account("12345678901234567890", 1000.50, "Vadesiz");
        Account acc2 = new Account("98765432109876543210", 5000.00, "Birikim");
        Account acc3 = new Account("27011905", 0.37, ":(");
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);
        bank.listAccounts();
        System.out.println();
        acc1.addMoney("500");
        acc2.takeMoney("1000");
        acc3.takeMoney("270");
        System.out.println();
        bank.listAccounts();

    }
}
