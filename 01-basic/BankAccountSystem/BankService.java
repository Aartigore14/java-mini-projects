package BankAccountSystem;
import java.util.ArrayList;

public class BankService {
    ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account){
        accounts.add(account);

    }
    public void displayAll(){
        for (Account account : accounts){
            System.out.println("Account No: " + account.getAccountNumber() +
                    " | Name: " + account.getAccountHolderName() +
                    " | Balance: ₹" + account.getBalance());

        }
    }

    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}
