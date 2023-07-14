package com.example.manager.acount.crypto.service;

import com.example.manager.acount.crypto.model.Currency;
import com.example.manager.acount.crypto.model.NameCrypto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CryptoExchange {
    public final List<Currency> listOfCrypto;

    public CryptoExchange() {
        this.listOfCrypto = new ArrayList<>();
    }

    public void addCryptoToList(Currency currency) {
        listOfCrypto.add(currency);
    }

    public void removeCurrency(Currency currency) {
        listOfCrypto.remove(currency);
    }

    public List<Currency> getListOfCrypto() {
        return listOfCrypto;
    }

    public double getExchangeRate(String currency1, String currency2) {
        Map<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("ETH/BTC", 0.05);
        exchangeRates.put("BTC/ETH", 20.0);

        String currencyPair = currency1 + "/" + currency2;
        if (exchangeRates.containsKey(currencyPair)) {
            return exchangeRates.get(currencyPair);
        } else {
            throw new RuntimeException("Такого курса не найдено");
        }
    }

    public double getCurrencyPairPrice(NameCrypto baseCurrencyId, NameCrypto quoteCurrencyId) {
        Currency baseCurrency = findCurrencyById(baseCurrencyId);
        Currency quoteCurrency = findCurrencyById(quoteCurrencyId);

        if (baseCurrency != null && quoteCurrency != null) {
            return quoteCurrency.getPrice() / baseCurrency.getPrice();
        }
        return 0;
    }


    private Currency findCurrencyById(NameCrypto nameCrypto) {
        for (Currency currency : listOfCrypto) {
            if (currency.getNameCurrency().equals(nameCrypto)) {
                return currency;
            }
        }
        return null;
    }

}
