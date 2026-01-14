package week10;


/**
 * Write a description of class SavingAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class SavingsAccount extends Account {
    private static final double Default_Savings_Rate = 0.02; 

    public SavingsAccount(String accountNo, String holderName, double balance) {
        super(accountNo, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return super.calculateInterest() + (balance * Default_Savings_Rate);
    }

    public double calculateInterest(double rate) {
        return balance * rate;
    }
}