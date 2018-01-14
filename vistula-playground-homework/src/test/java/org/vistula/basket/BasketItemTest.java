package org.vistula.basket;

import org.junit.Assert;
import org.junit.Test;

public class BasketItemTest {

    @Test
    public void testBasketItemDiscount()
    {
        PromoItem promoItem = new PromoItem(10, false, 5);
        double expectedPromoItemPrice = 9.5;
        double promoItemPrice = promoItem.getNewPrice();
        Assert.assertEquals(expectedPromoItemPrice, promoItemPrice, 0);
    }
}
