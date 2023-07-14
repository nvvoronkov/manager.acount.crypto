package com.example.manager.acount.crypto.storage;

import com.example.manager.acount.crypto.model.Currency;

import java.util.List;

public interface CurrencyImpl {
    void addCurrency(Currency currency);

    void removeCurrency(Currency currency);

    List<Currency> getCurrencies();
}
