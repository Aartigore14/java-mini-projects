package BankAccountSystem;
public class Account {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void depositeAmount(double amount){
        balance = balance + amount;
        System.out.println("Deposited ₹"+amount+" successfully ");
        }
    public void withdrawAmount(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal " + amount + " successful!!");
        }
    }

        public void checkBalance(){
            System.out.println("AccHolder Name: "+accountHolderName+" | Current Balance: "+getBalance());
        }
    }

