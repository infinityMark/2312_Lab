// package Q7;

public class SavingsAccount extends Account{
    private double balance;

    public SavingsAccount(String ac_no, double bal) {
        super(ac_no);
        balance = bal;
    }

    @Override 
    public double getTotal() {return balance;}

    @Override
    public String toString() {
        return "Savings A/C Number: "+ super.getAccountNumber() +
				" Balance: $"+String.format("%.2f",getTotal());
    }
}