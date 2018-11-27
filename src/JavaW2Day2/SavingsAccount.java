package JavaW2Day2;

public class SavingsAccount extends Account {

    double interestRate;

    public String info(){
        return super.info() + " and a Interest rate of " + interestRate + "%";
    }

    public SavingsAccount(String name) {
        this(name, 200 );
    }

    public SavingsAccount(String name, int balance) {
        this(name, balance, 1.2);
    }


    public SavingsAccount(String name,int balance, double interestRate) {
        super(name , balance);
        this.interestRate = interestRate;
    }


}
//TODO Double data type for INTEREST RATE  copy Current account and delete OverDraft