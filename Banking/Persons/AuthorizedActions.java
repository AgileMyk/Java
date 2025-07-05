package Persons;

public interface AuthorizedActions {

    default void depositFunds(double amount) {

    }
    default void withdrawFunds(double amount) {

    }
}
