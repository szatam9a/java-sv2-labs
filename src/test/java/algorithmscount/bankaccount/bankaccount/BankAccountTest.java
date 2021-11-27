package algorithmscount.bankaccount.bankaccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    @Test
    void onCreate(){
        BankAccount bA= new BankAccount("a","a",10);
        assertEquals("a",bA.getNameOfOwner());
        assertEquals("a", bA.getAccountNumber());
        assertEquals(10,bA.getBalance());
    }
}