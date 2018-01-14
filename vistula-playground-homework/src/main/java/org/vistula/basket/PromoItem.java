package org.vistula.basket;

public class PromoItem extends BasketItem {

    private int percentDiscount;

    public PromoItem(double price, boolean ageRestrictedItem, int percentDiscount) {
        super(price, ageRestrictedItem);
        this.percentDiscount = percentDiscount;
    }

    public double getNewPrice()
    {
        double p = price;
        double d = percentDiscount;

        return p - (p * (d / 100));
    }
}
