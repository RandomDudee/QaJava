package JavaW2Day2;

public class CurrentAccount extends Account {

    int overdraft;

    public String info(){
        return super.info() + " and overdraft of £" + overdraft;
    }


    public CurrentAccount(String name) {
        this(name, 200 );
    }

    public CurrentAccount(String name, int balance) {
        this(name, balance, 300);
    }

    public CurrentAccount(String name,int balance, int overdraft) {
        super(name , balance);
        this.overdraft = overdraft;
    }


}
