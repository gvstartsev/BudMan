package ru.startsev.model;

public enum Feedback {
    EMPTY("Purchase list is empty!"),
    SAVED("Purchases were saved!"),
    DELETED("Purchases were deleted!"),
    UPDATED("Purchases were updated!"),
    NAME("Enter purchase name"),
    PRICE("Enter purchase price"),
    QUANTITY("Enter purchase quantity"),
    LOADED("Purchases were loaded!"),
    BALANCE("Balance updated!");

    private final String text;

    Feedback(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
