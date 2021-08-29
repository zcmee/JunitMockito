package zcm.com.github.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AccountTest {

    @Test
    void myTest() {
        Account account = new Account();
        assertFalse(account.isActive());
    }
}