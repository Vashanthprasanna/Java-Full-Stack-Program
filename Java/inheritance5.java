package Java;

class BankAccount {
 protected double balance;

 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
     }
 }

 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
     }
 }

 public double getBalance() {
     return balance;
 }
}


class SavingsAccount extends BankAccount {

 public SavingsAccount(double initialBalance) {
     super(initialBalance);
 }

 @Override
 public void withdraw(double amount) {
     if (amount > 0 && (balance - amount) >= 100) {
         balance -= amount;
     } else {
         System.out.println("Withdrawal denied! Balance cannot fall below 100.");
     }
 }
}
public class inheritance5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SavingsAccount savings = new SavingsAccount(200);
        savings.deposit(50); 
        System.out.println("Balance after deposit: " + savings.getBalance());

        savings.withdraw(100);
        System.out.println("Balance after withdrawal: " + savings.getBalance());
        
        savings.withdraw(75); 
        System.out.println("Balance after attempting to withdraw 75: " + savings.getBalance());
	}

}
