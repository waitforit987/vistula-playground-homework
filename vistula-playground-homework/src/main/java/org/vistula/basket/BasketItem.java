package org.vistula.basket;

public class BasketItem {

    protected double price;
    boolean ageRestrictedItem;

    public BasketItem(double price, boolean ageRestrictedItem) {
        this.price = price;
        this.ageRestrictedItem = ageRestrictedItem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAgeRestrictedItem() {
        return ageRestrictedItem;
    }

    public void setAgeRestrictedItem(boolean ageRestrictedItem) {
        this.ageRestrictedItem = ageRestrictedItem;
    }
}
