/*
Add the class called CreditCardAccount 
It should extend the superclass: Account 

Given code for strings:
 return "Credit Card A/C Number: "+____________+
				" Balance: $"+String.format("%.2f",____________)+
				" Credit limit: $"+String.format("%.2f",____________);

*/
// package Q7;

public class CreditCardAccount extends Account {
    private double balance;
    private double creditLimit;

    public CreditCardAccount(String ac_no, double bal, double limit){
        super(ac_no);
        balance = bal;
        creditLimit = limit;
    }

    @Override
    public double getTotal() {return balance;}

    @Override 
    public String toString() {
        return String.format("Credit Card A/C Number: %s Balance: $%.2f Credit limit: $%.2f",
            super.getAccountNumber(), getTotal(), creditLimit
        );
    }
}