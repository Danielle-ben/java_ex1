public class StandardAccount implements IAccount {
    private int accNum;
    private double accBal;
    private double credLim;
    public StandardAccount(int AccountNumber, double CreditLimit) {
        accNum = AccountNumber;
        accBal = 0;
        if (CreditLimit>0){
            credLim = 0;
        } else {
            credLim = CreditLimit;
        }
    }
    public void deposit(double amount) {
        accBal = accBal + amount;
    }
    public double Withdraw(double amount) {
        if (accBal-amount>=credLim){
            accBal = accBal - amount;
            return amount;
        } else {
            double withdrawn = accBal - credLim;
            accBal = credLim;
            return withdrawn;
        }
    }
    public double GetCurrentBalance() {
        return accBal;
    }
    public int GetAccountNumber() {
        return accNum;
    }
}