public interface IAccount {
    void deposit(double amount);
    double Withdraw(double amount);
    double GetCurrentBalance();
    int GetAccountNumber();
}