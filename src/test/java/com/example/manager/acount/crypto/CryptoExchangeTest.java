package com.example.manager.acount.crypto;

import com.example.manager.acount.crypto.model.Currency;
import com.example.manager.acount.crypto.model.NameCrypto;
import com.example.manager.acount.crypto.service.CryptoExchange;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CryptoExchangeTest {
    @Test
    public void testAddCurrency() {
        CryptoExchange exchange = new CryptoExchange();

        Currency bitcoin = new Currency(NameCrypto.BTC, 50000);
        Currency ethereum = new Currency(NameCrypto.ETH, 3000);

        exchange.addCryptoToList(bitcoin);
        exchange.addCryptoToList(ethereum);

        List<Currency> availableCurrencies = exchange.getListOfCrypto();

        assertTrue(availableCurrencies.contains(bitcoin));
        assertTrue(availableCurrencies.contains(ethereum));
    }

    @Test
    public void testRemoveCurrency() {
        CryptoExchange exchange = new CryptoExchange();

        Currency bitcoin = new Currency(NameCrypto.BTC, 50000);
        Currency ethereum = new Currency(NameCrypto.ETH, 3000);

        exchange.addCryptoToList(bitcoin);
        exchange.addCryptoToList(ethereum);

        exchange.removeCurrency(bitcoin);

        List<Currency> availableCurrencies = exchange.getListOfCrypto();

        assertFalse(availableCurrencies.contains(bitcoin));
        assertTrue(availableCurrencies.contains(ethereum));
    }

    @Test
    public void testGetCurrencyPairPrice() {
        CryptoExchange exchange = new CryptoExchange();

        Currency bitcoin = new Currency(NameCrypto.BTC, 50000);
        Currency ethereum = new Currency(NameCrypto.ETH, 3000);

        exchange.addCryptoToList(bitcoin);
        exchange.addCryptoToList(ethereum);

        double ethBtcPrice = exchange.getCurrencyPairPrice(NameCrypto.ETH, NameCrypto.BTC);

        assertEquals(ethBtcPrice, 16.666, 0.001);
    }
}
