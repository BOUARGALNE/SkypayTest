
import ma.bouargalne.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
    private Account account;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        account = new Account();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testDeposit() {
        account.desposit(1000);
        assertEquals(1000, getBalance());
    }

    @Test
    void testWithdraw() {
        account.desposit(1000);
        account.withdraw(500);
        assertEquals(500, getBalance());
    }

    @Test
    void testWithdrawMoreThanBalance() {
        account.desposit(500);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(1000));
        assertEquals("Insufficient funds", exception.getMessage());
    }

    @Test
    void testPrintStatement() {
        account.desposit(1000);
        account.withdraw(500);
        account.printStatement();
        String output = outContent.toString().trim();
        Assertions.assertTrue(output.contains("DEPOSIT | 1000 | 1000"));
        Assertions.assertTrue(output.contains("WITHDRAW | 500 | 500"));
    }

    private int getBalance() {
        return account.getBalance();
    }

}
