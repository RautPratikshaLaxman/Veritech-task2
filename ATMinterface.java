import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Money Deposited: " + amount);
        } else {
            System.out.println("Invalid amount for deposit");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Money withdraw: " + amount);
        } else {
            System.out.println("Invalid amount for withdraws");
        }
    }
}

class ATM {
    private BankAccount account;
    private Scanner Scanner;

    public ATM(BankAccount account) {
        this.account = account;
        Scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("****** Welcome to ATM *******");
        System.out.println("ATM Menu");
        System.out.println("1.check balance");
        System.out.println("2.deposit Cash");
        System.out.println("3.Withdraw cash");
        System.out.println("4.Exit");

    }

    public void start() {
        int choice;
        do {
            showMenu();
            System.out.println("Enter your choice:");
            choice = Scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Exiting ATM Thank You !");
                    break;
                default:
                    System.out.println("Invalid choice Please select a valid option !");

            }
        } while (choice != 4);
    }

    private void checkBalance() {
        System.out.println("Current Balance:" + account.getBalance());

    }

    private void deposit() {
        System.out.println("Enter deposite amount:");
        double amount = Scanner.nextDouble();
        account.deposit(amount);
    }

    private void withdraw() {
        System.out.println("Enter withdraw amount");
        double amount = Scanner.nextDouble();
        account.withdraw(amount);
    }
}