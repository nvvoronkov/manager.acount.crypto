package com.example.manager.acount.crypto.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Currency {
    NameCrypto nameCurrency;
    double price;

    @Override
    public String toString() {
        return "{Название валюты: " + String.valueOf(nameCurrency) + "; Цена: " + getPrice() + "}";
    }
}
