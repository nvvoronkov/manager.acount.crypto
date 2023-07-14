package com.example.manager.acount.crypto;

import com.example.manager.acount.crypto.model.CryptoAccount;
import com.example.manager.acount.crypto.model.Currency;
import com.example.manager.acount.crypto.model.NameCrypto;
import com.example.manager.acount.crypto.storage.Portfolio;
import com.example.manager.acount.crypto.service.CryptoExchange;

public class Main {

    public static void main(String[] args) {
        CryptoExchange exchange = new CryptoExchange();

        Currency bitcoin = new Currency(NameCrypto.BTC, 50000.0);
        Currency ethereum = new Currency(NameCrypto.ETH, 30000.);
        Currency litecoin = new Currency(NameCrypto.LTC, 150.0);

        exchange.addCryptoToList(bitcoin);
        exchange.addCryptoToList(ethereum);
        exchange.addCryptoToList(litecoin);

        System.out.println("Доступные валюты на бирже: " + exchange.getListOfCrypto());

        Portfolio portfolio = new Portfolio();
        portfolio.setId();
        portfolio.addCurrency(bitcoin);
        portfolio.addCurrency(ethereum);
        CryptoAccount account = new CryptoAccount(portfolio);

        System.out.println("Портфолио пользователя " + account.getNameAccount() + ": " +
                            account.getPortfolio().getCurrencies());

        double ethBtcPrice = exchange.getCurrencyPairPrice(NameCrypto.ETH, NameCrypto.BTC);
        System.out.println("ETH/BTC цена на обмен: " + ethBtcPrice);

    }
}
