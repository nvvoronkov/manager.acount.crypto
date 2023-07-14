package com.example.manager.acount.crypto;

import com.example.manager.acount.crypto.model.Currency;
import com.example.manager.acount.crypto.model.NameCrypto;
import com.example.manager.acount.crypto.storage.Portfolio;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PortfolioTest {
    @Test
    public void testAddCurrency() {
        Portfolio portfolio = new Portfolio();
        portfolio.setId();

        Currency bitcoin = new Currency(NameCrypto.BTC, 50000);
        Currency ethereum = new Currency(NameCrypto.ETH, 3000);

        portfolio.addCurrency(bitcoin);
        portfolio.addCurrency(ethereum);

        List<Currency> currencies = portfolio.getCurrencies();

        assertTrue(currencies.contains(bitcoin));
        assertTrue(currencies.contains(ethereum));
    }

    @Test
    public void testRemoveCurrency() {
        Portfolio portfolio = new Portfolio();

        Currency bitcoin = new Currency(NameCrypto.BTC, 50000);
        Currency ethereum = new Currency(NameCrypto.ETH, 3000);

        portfolio.addCurrency(bitcoin);
        portfolio.addCurrency(ethereum);

        portfolio.removeCurrency(bitcoin);

        List<Currency> currencies = portfolio.getCurrencies();

        assertFalse(currencies.contains(bitcoin));
        assertTrue(currencies.contains(ethereum));
    }

}
