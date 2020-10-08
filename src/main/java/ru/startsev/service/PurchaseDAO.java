package ru.startsev.service;

import ru.startsev.model.Purchase;
import ru.startsev.model.PurchaseType;

import java.util.List;

public interface PurchaseDAO<Purchase> {
    Purchase get(double id);

    List<Purchase> getAll();

    List<Purchase> getByType(PurchaseType type);

    void save(Purchase purchase);

    void delete(Purchase purchase);

    void update(Purchase purchase);

}
