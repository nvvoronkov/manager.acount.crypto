package com.example.manager.acount.crypto;

import com.example.manager.acount.crypto.model.CryptoAccount;
import com.example.manager.acount.crypto.storage.Portfolio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CryptoAccountTest {
    @Test
    public void testCryptoAccountCreation() {
        Portfolio portfolio = new Portfolio();
        CryptoAccount cryptoAccount = new CryptoAccount(portfolio);

        assertNotNull(cryptoAccount);

        assertEquals(1, cryptoAccount.getIdAccount());

        assertEquals(portfolio, cryptoAccount.getPortfolio());
    }
}
