public class BasicAccount implements IAccount {
    private int accNum;
    private double accBal;
    private double withLim;

    public BasicAccount(int accountNumber, double withdrawalLimit){
        accNum = accountNumber;
        accBal = 0;
        withLim = withdrawalLimit;
    }
    public void deposit(double amount){
        accBal = accBal + amount;
    }
    public double Withdraw(double amount){
        double actualAmount = Math.min(amount, withLim);
        if (actualAmount < accBal) {
            accBal = accBal - actualAmount;
            return actualAmount;
        } else {
            double oldAccBal = accBal;
            accBal = 0;
            return oldAccBal;
        }
    }
    public double GetCurrentBalance(){
        return accBal;
    }
    public int GetAccountNumber(){
        return accNum;
    }
}

