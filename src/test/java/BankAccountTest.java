import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(100, 0.05);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount(100, 0.05);
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(50, 0.05);
        assertThrows(IllegalStateException.class, () -> account.withdraw(100));
    }

    @Test
    void testTransfer() {
        BankAccount account1 = new BankAccount(100, 0.05);
        BankAccount account2 = new BankAccount(50, 0.05);
        account1.transfer(30, account2);
        assertEquals(70, account1.getBalance());
        assertEquals(80, account2.getBalance());
    }

    @Test
    void testAddInterest() {
        BankAccount account = new BankAccount(100, 0.05);
        account.addInterest();
        assertEquals(105, account.getBalance(), 0.01);
    }

    @Test
    void testNegativeDeposit() {
        BankAccount account = new BankAccount(100, 0.05);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-10));
    }

    @Test
    void testNegativeWithdraw() {
        BankAccount account = new BankAccount(100, 0.05);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-10));
    }

    @Test
    void testNullTransfer() {
        BankAccount account1 = new BankAccount(100, 0.05);
        assertThrows(NullPointerException.class, () -> account1.transfer(50, null));
    }
}
