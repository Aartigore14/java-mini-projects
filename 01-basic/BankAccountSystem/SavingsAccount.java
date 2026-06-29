package BankAccountSystem;
public class SavingsAccount extends Account {
    private  double interestRate;

    public SavingsAccount(String accountHolderName, String accountNumber,
                          double balance, double interestRate) {
        super(accountHolderName, accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void  addInterest(){
        double interest = getBalance() * interestRate / 100;
        depositeAmount(interest);
        System.out.println("Interest of ₹ " +interest+ " added");
    }

}
