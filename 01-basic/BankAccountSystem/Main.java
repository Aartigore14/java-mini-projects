package BankAccountSystem;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            BankService bank = new BankService();

            while (true) {
                System.out.println("===== BANK ACCOUNT SYSTEM =====");
                System.out.println("1. Create Savings Account");
                System.out.println("2. Create Current Account");
                System.out.println("3. Deposit Money");
                System.out.println("4. Withdraw Money");
                System.out.println("5. Check Balance");
                System.out.println("6. Add Interest (Savings only)");
                System.out.println("7. Display All Accounts");
                System.out.println("8. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter holder name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter account number: ");
                        String accNo = sc.nextLine();
                        System.out.print("Enter initial balance: ");
                        double balance = sc.nextDouble();
                        System.out.print("Enter interest rate: ");
                        double rate = sc.nextDouble();
                        sc.nextLine();
                        SavingsAccount sAcc = new SavingsAccount(name,accNo,balance,rate);
                        bank.addAccount(sAcc);
                        System.out.println("Savings Account created successfully!");
                        break;
                    case 2:
                        System.out.print("Enter holder name: ");
                        String cName = sc.nextLine();
                        System.out.print("Enter account number: ");
                        String cAccNo = sc.nextLine();
                        System.out.print("Enter initial balance: ");
                        double cBalance = sc.nextDouble();
                        System.out.print("Enter overdraft Limit: ");
                        double overdraftLimit = sc.nextDouble();
                        sc.nextLine();
                        CurrentAccount cAcc = new CurrentAccount(cName,cAccNo,cBalance,overdraftLimit);
                        bank.addAccount(cAcc);
                        System.out.println("Current Account created successfully!");
                        break;
                    case 3:
                        System.out.print("Enter account number: ");
                        String depAccNo = sc.nextLine();
                        Account depAcc = bank.findAccount(depAccNo);
                        if (depAcc != null) {
                            System.out.print("Enter deposit amount: ");
                            double depAmount = sc.nextDouble();
                            sc.nextLine();
                            depAcc.depositeAmount(depAmount);
                        }
                        break;
                    case 4:
                        System.out.print("Enter account number: ");
                        String withAccNo = sc.nextLine();
                        Account withAcc = bank.findAccount(withAccNo);
                        if (withAcc != null) {
                            System.out.print("Enter withdraw amount: ");
                            double withAmount = sc.nextDouble();
                            sc.nextLine();
                            withAcc.withdrawAmount(withAmount);
                        }
                        break;

                    case 5:
                        System.out.print("Enter account number: ");
                        String checkAccNo = sc.nextLine();
                        Account findAcc  = bank.findAccount(checkAccNo);
                        if (findAcc != null) {
                            findAcc.checkBalance();
                        }
                        break;
                    case 6:
                        System.out.print("Enter account number: ");
                        String intAccNo = sc.nextLine();
                        Account intAcc = bank.findAccount(intAccNo);
                        if (intAcc != null) {
                            if (intAcc instanceof SavingsAccount) {
                                SavingsAccount savAcc = (SavingsAccount) intAcc;
                                savAcc.addInterest();
                            } else {
                                System.out.println("Interest only applies to Savings Accounts!");
                            }
                        }
                        break;
                    case 7:
                        bank.displayAll();
                        break;
                    case 8:
                        System.out.println("Thank you for using Bank System!");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        }
    }
