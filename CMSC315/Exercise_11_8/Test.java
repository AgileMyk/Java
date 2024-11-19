/*
(New Account class) An Account class was specified in Programming
Exercise 9.7. Design a new Account class as follows:
 ■ Add a new data field name of the String type to store the name of the
customer.
 ■ Add a new constructor that constructs an account with the specified name, id,
and balance.
 ■ Add a new data field named transactions whose type is ArrayList
that stores the transaction for the accounts. Each transaction is an instance
of the Transaction class. The Transaction class is defined as shown in
Figure 11.6.
New Account class
VideoNote
FIGURE 11.6 The Transaction class describes a transaction for a bank account.
Transaction
The getter and setter methods for these data
fields are provided in the class, but omitted in the UML
diagram for brevity.
The date of this transaction.
The type of the transaction, such as 'W' for withdrawal, 'D'
 for deposit.
The amount of the transaction.
The new balance after this transaction.
Construct a Transaction with the specified date, type,
 balance, and description.
The description of this transaction.
+Transaction(type: char,
amount: double, balance:
double, description: String)
-date: java.util.Date
-type: char
-amount: double
-balance: double
-description: String
 ■ Modify the withdraw and deposit methods to add a transaction to the
transactions array list.
 ■ All other properties and methods are the same as in Programming Exercise 9.7.
Write a test program that creates an Account with annual interest rate 1.5%,
balance 1000, id 1122, and name George. Deposit $30, $40, and $50 to the
account and withdraw $5, $4, and $2 from the account. Print an account summary that shows
account holder name, interest rate, balance, and all transactions.
 */
package Exercise_11_8;

public class Test {
}
