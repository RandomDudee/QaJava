package JavaWeekTwo;

public class Account {

    private int balance; //Variable
    private String name;
    private int overdraft;

    public String getName() { //Method
        return name;
    }

    public void setName(String a) {
        name = a;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int a) {
        balance = a;
    }

    public void withdraw(int a) {
        if (balance + overdraft >= a) {
            balance = getBalance() - a;
        } else {
            System.out.println("Insufficient funds to withdraw ");
        }
    }


    public void deposit(int a) {
        balance = getBalance() + a;
    }

    public String info() {
        return getName() + " has a balance of £" + getBalance();

    }

    public void printInfo() {
        System.out.println(info());
    }

    public Account(String name) { //Constructor

        this(name, 0);
    }

    public Account(String name, int balance) {
        this(name, balance, 0);
    }

    public Account(String name, int balance, int overdraft) {
        this.name = name;
        this.balance = balance;
        this.overdraft = overdraft;
    }


}
