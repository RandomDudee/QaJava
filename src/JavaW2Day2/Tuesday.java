package JavaW2Day2;

public class Tuesday {

    public static void main(String[] args) {

        Account a1 = new Account("Alice");
        System.out.println(a1.info());

        CurrentAccount b1 = new CurrentAccount("Bob");
        b1.printInfo();

        CurrentAccount b2 = new CurrentAccount("Chris", 500);
        b2.printInfo();

        CurrentAccount b3 = new CurrentAccount("Don", 600, 700);
        b3.printInfo();

        SavingsAccount c1 = new SavingsAccount("James" , 200);
        c1.printInfo();

        SavingsAccount c2 = new SavingsAccount("Conor", 300, 3.0);
        c2.printInfo();
    }
}
