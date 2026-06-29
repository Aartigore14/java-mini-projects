package BankAccountSystem;
public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountHolderName,String accountNumber, double balance, double overdraftLimit) {
        super(accountHolderName, accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdrawAmount(double amount) {
        if (amount > getBalance() + overdraftLimit){
            System.out.println("Exceeds overdraft limit!");
        }else{
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of ₹" + amount + " successful!");
        }
    }
}
