package com.example.manager.acount.crypto.storage;

import com.example.manager.acount.crypto.model.Currency;

import java.util.ArrayList;
import java.util.List;

public class Portfolio implements CurrencyImpl {
    private final List<Currency> cryptoCase;
    private int id;

    public Portfolio() {
        this.cryptoCase = new ArrayList<>();
        this.id = setId();
    }
    public int setId() {
        ++id;
        return id;
    }

    @Override
    public void addCurrency(Currency currency) {
        cryptoCase.add(currency);
    }

    @Override
    public void removeCurrency(Currency currency) {
        cryptoCase.remove(currency);
    }

    @Override
    public List<Currency> getCurrencies() {
        return cryptoCase;
    }
}
