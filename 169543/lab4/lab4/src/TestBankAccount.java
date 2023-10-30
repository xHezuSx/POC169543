public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.deposit(1230.50);
        bank.withdraw(50.99);
    }
}


class BankAccount{
    double balance;

    void deposit(double amount){
        this.balance += amount;
        System.out.println("balance has been updated by "+amount+"$\n your actual balance: "+balance+"$");
    }

    void withdraw(double amount){
        this.balance -= amount;
        System.out.println("balance has been updated by "+amount+"$\n your actual balance: "+balance+"$");
    }
}