package org.vistula.customer;

import org.junit.Assert;
import org.junit.Test;
import org.vistula.basket.BasketItem;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {

    @Test
    public void testCustomerAge()
    {
        Customer customer1 = new Customer("First", "Last", 17, null);
        Assert.assertFalse(customer1.isAgeGreaterOrEqualToEighteen());

        Customer customer2 = new Customer("First", "Last", 18, null);
        Assert.assertTrue(customer2.isAgeGreaterOrEqualToEighteen());

        Customer customer3 = new Customer("First", "Last", 19, null);
        Assert.assertTrue(customer3.isAgeGreaterOrEqualToEighteen());
    }

    @Test
    public void testBasketPrice()
    {
       List items = new ArrayList<BasketItem>() {{
            add(new BasketItem(9.99, false));
            add(new BasketItem(0.99, false));
            add(new BasketItem(10, false));
        }};

        Customer customer = new Customer("First", "Last", 17, items);

        double expectedBasketPrice = 20.98;
        double basketPrice = customer.getBasketTotalPrice();
        Assert.assertEquals(expectedBasketPrice, basketPrice, 0);
    }

    @Test
    public void testAddAgeRestrictedItemToBasket()
    {
        BasketItem item = new BasketItem(1, true);
        Customer customer = new Customer("First", "Last", 17, new ArrayList<>());

        customer.addProduct(item);
        Assert.assertTrue(customer.getBasket().isEmpty());
    }

    @Test
    public void testDeleteItemFromBasket()
    {
        List<BasketItem> items = new ArrayList();
        BasketItem item = new BasketItem(9.99, false);
        items.add(item);

        Customer customer = new Customer("First", "Last", 18, items);
        Assert.assertFalse(customer.getBasket().isEmpty());

        customer.getBasket().remove(item);
        Assert.assertTrue(customer.getBasket().isEmpty());
    }
}
