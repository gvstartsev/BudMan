package ru.startsev.model;

public class Purchase {
    private static int idCur = 1;
    private int id;
    private PurchaseType type;
    private String name;
    private Double price;
    private Double quantity;

    public Purchase(PurchaseType type, String name, Double price, Double quantity) {
        this.id = idCur++;
        this.type = type;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Purchase() {
        this.id = idCur++;
    }

    public PurchaseType getType() {
        return type;
    }

    public void setType(PurchaseType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
}
