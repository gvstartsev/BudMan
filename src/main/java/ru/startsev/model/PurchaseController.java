package ru.startsev.model;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class PurchaseController {
    private final List<Purchase> purchases = new ArrayList<>();

    public PurchaseController() {
    }
    @PostMapping(path = "/purchases", consumes = "application/json")
    public Purchase createPurchase(@RequestBody Purchase purchase) {
        purchases.add(purchase);
        return purchases.get(purchases.size() - 1);
    }

    @GetMapping(path = "/purchases/{id}")
    @ResponseBody
    public Purchase getPurchase(@PathVariable int id) throws NoSuchElementException {
        if (id < 1 || id > purchases.size()) {
            throw new NoSuchElementException();
        }
        return purchases.get(id - 1);
    }

    @GetMapping(path = "/api/quizzes")
    public Purchase[] getPurchases() {
        if (purchases.isEmpty()) {
            return new Purchase[0];
        }
        Purchase[] purchaseArray = new Purchase[purchases.size()];
        for (int i = 0; i < purchases.size(); i++) {
            purchaseArray[i] = purchases.get(i);
        }
        return purchaseArray;
    }
}
