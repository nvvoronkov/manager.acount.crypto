package com.example.manager.acount.crypto.model;

import com.example.manager.acount.crypto.storage.Portfolio;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CryptoAccount {
    int idAccount = 0;
    String nameAccount;
    Portfolio portfolio;

    public CryptoAccount(Portfolio portfolio) {
        this.nameAccount = generateAndSetId();
        this.portfolio = portfolio;
    }

    private synchronized String generateAndSetId() {
        ++idAccount;
        return "user" + idAccount;
    }

    public Portfolio getPortfolio(Integer id) {
        return portfolio;
    }
}
