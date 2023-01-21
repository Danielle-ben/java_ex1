public class PremiumAccount implements IAccount {
    private int accNum;
    private double accBal;

    public PremiumAccount(int accountNumber){
        accNum = accountNumber;
        accBal = 0;
    }
    public void deposit(double amount) {
        accBal = accBal + amount;
    }
    public double Withdraw(double amount){
        accBal = accBal - amount;
        return amount;
    }
    public double GetCurrentBalance() {
        return accBal;
    }
    public int GetAccountNumber() {
        return accNum;
    }
}
