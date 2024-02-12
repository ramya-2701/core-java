package exceptions;

import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {
    @Test
    public void testWithPositiveAmount(){
        BankAccount account = new BankAccount(1000);
        double res=1000;
        try {
            res=account.withdraw(500);
        } catch (InsufficientFundsException | InvalidWithdrawalException e) {
            System.out.println(e.getMessage());
        }finally {
            assertEquals(500,res,2);
        }
    }
    @Test
    public void testWithInsufficientBalance(){
        BankAccount account = new BankAccount(1000);
        double res=1000;
        try {
            res=account.withdraw(1500);
        } catch (InsufficientFundsException | InvalidWithdrawalException e) {
            System.out.println(e.getMessage());
        }finally {
            assertEquals(1000,res,2);
        }
    }
    @Test
    public void testWithNegativeAmount(){
        BankAccount account = new BankAccount(1000);
        double res=1000;
        try {
            res=account.withdraw(-500);
        } catch (InsufficientFundsException | InvalidWithdrawalException e) {
            System.out.println(e.getMessage());
        }finally {
            assertEquals(1000,res,2);
        }

    }
}
