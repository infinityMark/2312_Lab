// package Q7;

public class PowerAdvantageAccount extends Account {
    private SavingsAccount savingsAC;
    private CreditCardAccount creditCardAC;

    public PowerAdvantageAccount(String ac_no, SavingsAccount sa, CreditCardAccount cr) {
        super(ac_no);
        savingsAC = sa;
        creditCardAC = cr;
    }

    @Override
    public double getTotal() {return savingsAC.getTotal()-creditCardAC.getTotal();}

    @Override
    public String toString(){
        return String.format(
            "Power Advantage A/C Number: %s Balance: $%.2f\r\n" + 
                                "1.%s\r\n" + 
                                "2.%s",
            super.getAccountNumber(), getTotal(), 
            savingsAC, creditCardAC // will call toString auto
        );
    }
}