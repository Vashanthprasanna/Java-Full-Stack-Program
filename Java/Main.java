package Java;


class Account {
 private String accountNumber;
 private String accountHolder;
 private double balance;

 public Account(String accountNumber, String accountHolder, double initialBalance) {
     this.accountNumber = accountNumber;
     this.accountHolder = accountHolder;
     this.balance = initialBalance;
 }

 public String getAccountNumber() {
     return accountNumber;
 }

 public String getAccountHolder() {
     return accountHolder;
 }

 public double getBalance() {
     return balance;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited " + amount + " into account " + accountNumber);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrew " + amount + " from account " + accountNumber);
     } else {
         System.out.println("Invalid withdraw amount or insufficient balance.");
     }
 }

 public void displayAccountDetails() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Account Holder: " + accountHolder);
     System.out.println("Balance: " + balance);
 }
}


class Bank {
 private Account[] accounts;
 private int numberOfAccounts;

 public Bank(int capacity) {
     accounts = new Account[capacity];
     numberOfAccounts = 0;
 }

 public void addAccount(String accountNumber, String accountHolder, double initialBalance) {
     if (numberOfAccounts < accounts.length) {
         accounts[numberOfAccounts] = new Account(accountNumber, accountHolder, initialBalance);
         numberOfAccounts++;
         System.out.println("Account added successfully.");
     } else {
         System.out.println("Bank is at full capacity, cannot add more accounts.");
     }
 }

 public void removeAccount(String accountNumber) {
     boolean accountFound = false;
     for (int i = 0; i < numberOfAccounts; i++) {
         if (accounts[i].getAccountNumber().equals(accountNumber)) {
             accounts[i] = accounts[numberOfAccounts - 1]; 
             accounts[numberOfAccounts - 1] = null;
             numberOfAccounts--;
             accountFound = true;
             System.out.println("Account removed successfully.");
             break;
         }
     }
     if (!accountFound) {
         System.out.println("Account not found.");
     }
 }

 public void depositToAccount(String accountNumber, double amount) {
     Account account = findAccount(accountNumber);
     if (account != null) {
         account.deposit(amount);
     } else {
         System.out.println("Account not found.");
     }
 }

 public void withdrawFromAccount(String accountNumber, double amount) {
     Account account = findAccount(accountNumber);
     if (account != null) {
         account.withdraw(amount);
     } else {
         System.out.println("Account not found.");
     }
 }

 public void displayAccountDetails(String accountNumber) {
     Account account = findAccount(accountNumber);
     if (account != null) {
         account.displayAccountDetails();
     } else {
         System.out.println("Account not found.");
     }
 }

 private Account findAccount(String accountNumber) {
     for (int i = 0; i < numberOfAccounts; i++) {
         if (accounts[i].getAccountNumber().equals(accountNumber)) {
             return accounts[i];
         }
     }
     return null;
 }
}


public class Main {
 public static void main(String[] args) {
     Bank bank = new Bank(5); 


     bank.addAccount("12345", "John Doe", 1000.0);
     bank.addAccount("67890", "Jane Smith", 1500.0);


     bank.depositToAccount("12345", 500.0);
     bank.withdrawFromAccount("67890", 300.0);

     bank.displayAccountDetails("12345");
     bank.displayAccountDetails("67890");

     bank.removeAccount("12345");
     bank.displayAccountDetails("12345");
 }
}
