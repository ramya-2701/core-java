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
public class BankAccount extends Exception {
    public double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double withdraw(double amount) throws InsufficientFundsException, InvalidWithdrawalException {
        if (amount < 0) {
            throw new InvalidWithdrawalException("Attempting to withdraw a negative amount.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Attempting to withdraw more money than the account balance.");
        }
        balance -= amount;
        System.out.println("Successful withdrawal.");
        return balance;
    }
}


