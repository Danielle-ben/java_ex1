import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank {
    private List<IAccount> accList;
    public Bank() {
        accList = new ArrayList<>();
    }
    public void OpenAccount(IAccount account) {
        accList.add(account);
    }
    public void CloseAccount(int accountNumber) {
        IAccount desiredAccount = null;
        for (IAccount account : accList) {
            if(account.GetAccountNumber() == accountNumber){
                desiredAccount = account;
            }
        }
        if(desiredAccount!=null){
            if(desiredAccount.GetCurrentBalance()>0) {
                accList.remove(desiredAccount);
            } else {
                System.out.println("Account is not closed due to debt");
            }
        }

    }

    public List<IAccount> GetAllAccounts(){
        return accList;
    }
    public List<IAccount> GetAllAccountsInDebt(){
        List<IAccount> negAcc = new ArrayList<>();
        for (IAccount account : accList) {
            if (account.GetCurrentBalance() < 0) {
                negAcc.add(account);
            }
        }
        return negAcc;
    }
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove){
        List<IAccount> balAcc = new ArrayList<>();
        for (IAccount account : accList) {
            if (account.GetCurrentBalance() > balanceAbove) {
                balAcc.add(account);
            }
        }
        return balAcc;
    }
}
