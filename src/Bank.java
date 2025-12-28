public class Bank {
    static int currentBalance = 1000;

    public static void greetCustomer() {
        System.out.println("Hello,Welcome to the banking application");

    }

    public void deposit(int amount) {
        currentBalance = currentBalance + amount;
        System.out.println("Amount is deposited successfully");
    }

    public static void withdrawal(int amount) {
        currentBalance = currentBalance - amount;
        System.out.println("Amount is withdrawal successfully");
    }

    public int getcurrentBalance() {
        return currentBalance;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        greetCustomer();
        System.out.println("current balance is:" + bank.getcurrentBalance());
        bank.deposit(500);
        System.out.println("current balance is:" + bank.getcurrentBalance());
        withdrawal(300);
        System.out.println("current balance is:" + bank.getcurrentBalance());
        bank.deposit(1200);
        System.out.println("current balance is:" + bank.getcurrentBalance());

    }

}
