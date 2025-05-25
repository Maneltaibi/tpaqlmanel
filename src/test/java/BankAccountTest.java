import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test void depositTest() {
        BankAccount acc = new BankAccount(100, 0.05);
        acc.deposit(50);
        assertEquals(150, acc.getBalance());
    }

    @Test void depositNegativeThrows() {
        BankAccount acc = new BankAccount(100, 0.05);
        assertThrows(IllegalArgumentException.class, () -> acc.deposit(-10));
    }

    @Test void withdrawTest() {
        BankAccount acc = new BankAccount(100, 0.05);
        acc.withdraw(40);
        assertEquals(60, acc.getBalance());
    }

    @Test void withdrawTooMuchThrows() {
        BankAccount acc = new BankAccount(50, 0.05);
        assertThrows(IllegalStateException.class, () -> acc.withdraw(100));
    }

    @Test void withdrawNegativeThrows() {
        BankAccount acc = new BankAccount(100, 0.05);
        assertThrows(IllegalArgumentException.class, () -> acc.withdraw(-1));
    }

    @Test void transferValid() {
        BankAccount acc1 = new BankAccount(200, 0.05);
        BankAccount acc2 = new BankAccount(100, 0.03);
        acc1.transfer(50, acc2);
        assertEquals(150, acc1.getBalance());
        assertEquals(150, acc2.getBalance());
    }

    @Test void transferNegativeThrows() {
        BankAccount acc1 = new BankAccount(100, 0.05);
        BankAccount acc2 = new BankAccount(100, 0.05);
        assertThrows(IllegalArgumentException.class, () -> acc1.transfer(-10, acc2));
    }

    @Test void transferNullThrows() {
        BankAccount acc1 = new BankAccount(100, 0.05);
        assertThrows(NullPointerException.class, () -> acc1.transfer(10, null));
    }

    @Test void addInterestTest() {
        BankAccount acc = new BankAccount(100, 0.1);
        acc.addInterest();
        assertEquals(110.0, acc.getBalance(), 0.0001);
    }
}
