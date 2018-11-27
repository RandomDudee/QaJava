package JavaW2Day2;


public abstract class Account {

    private int balance; //Variable
    private String name;

    //Getter
    public String getName() { //Method
        return name;
    }

    // Setter
    public void setName(String a) {
        name = a;
    }

    public int getBalance() {
        return balance;
    }


    public String info() {
        return getName() + " has a balance of £" + getBalance();

    }

    public void printInfo() {
        System.out.println(info());
    }

    public void withdraw(int a) {
        balance = balance - a;
    }


    public void deposit(int a) {
        balance = balance + a;
    }

    public Account(String name) { //Constructor

        this(name, 0);
    }

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }


}