package Accounts;


import java.util.ArrayList;
import java.util.List;
import Accounts.Account;

public interface clientAccounts {

    List<Account> userAccounts = new ArrayList<>();

    //CORRECT
    default void addAccount(Account account) {
        userAccounts.add(account);
    }
    default void removeAccount(Account account) {
        userAccounts.remove(account);
    }

}
