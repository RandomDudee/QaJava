package JavaWeekTwo;

public class Monday {

    public static void main(String[] args) {

        Account a1 = new Account("Alice" , 700, 100);
        a1.deposit(100);
        a1.withdraw(800);
        a1.withdraw(100);
        a1.deposit(100);
        System.out.println("Expected Result: " + 0 + ", Actual: " + a1.info());

//        Account a1 = new Account("Alice", 100 , 200);
//        a1.printInfo();
//        a1.withdraw(100);
//        a1.deposit(0);
//        a1.printInfo();
//
//
//        Account a2 = new Account("Chris", 500);
//        a2.setName("Joe Bloggs");
//        a2.setBalance(600);
//        a2.printInfo();
//        a2.withdraw(200);
//        a2.printInfo();
//        a2.deposit(100);
//        a2.printInfo();
//
//
//        Account a3 = new Account("Dave", 2000);
//        a3.printInfo();
//
//        Account a4 = new Account("Bob");
//        a4.printInfo();
//

    }


}
