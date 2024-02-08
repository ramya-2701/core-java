package exceptions;
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
class InvalidWithdrawalException extends Exception {
    public InvalidWithdrawalException(String message) {
        super(message);
    }
}
public class BankAccount extends Exception{
    public double balance;
    public BankAccount(double balance){
        this.balance=balance;
    }
    public void withdraw(double amount) throws InsufficientFundsException, InvalidWithdrawalException {
        if (amount < 0) {
            throw new InvalidWithdrawalException("Attempting to withdraw a negative amount: " + amount);
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Current balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        try {
            account.withdraw(500);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidWithdrawalException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            account.withdraw(-200);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidWithdrawalException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            account.withdraw(700);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidWithdrawalException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

