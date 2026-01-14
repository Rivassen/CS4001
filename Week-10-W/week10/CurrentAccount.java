package week10;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class CurrentAccount extends Account {

    public CurrentAccount(String accountNo, String holderName, double balance) {
        super(accountNo, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return super.calculateInterest(); 
    }

    public double calculateInterest(double rate) {
        if (balance < 0) {
            return balance * rate; 
        }
        return 0.0;
    }
}