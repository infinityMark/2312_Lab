// package Q7;

public abstract class Account{
    private String account_no;

    public Account(String num){
        this.account_no = num;
    }

    public String getAccountNumber() {return account_no;}

    public abstract double getTotal();

    public String toString() { return "Bank A/C Number: "+getAccountNumber(); }
}