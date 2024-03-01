public class App {
    public static void main(String[] args) throws Exception {
        BankAccount userAccount = new BankAccount(1000);
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}
