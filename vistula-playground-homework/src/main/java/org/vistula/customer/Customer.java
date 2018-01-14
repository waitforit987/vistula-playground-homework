package org.vistula.customer;

import org.vistula.basket.BasketItem;

import java.util.List;

public class Customer {

    private String firstName;
    private String lastName;
    private int age;
    private List<BasketItem> basket;

    public Customer(String firstName, String lastName, int age, List<BasketItem> basket) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.basket = basket;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<BasketItem> getBasket() {
        return basket;
    }

    public void setBasket(List<BasketItem> basket) {
        this.basket = basket;
    }

    public boolean isAgeGreaterOrEqualToEighteen()
    {
        return age >= 18;
    }

    public double getBasketTotalPrice()
    {
        return basket.stream()
                     .mapToDouble(BasketItem::getPrice)
                     .sum();
    }

    public void addProduct(BasketItem item)
    {
        if (!item.isAgeRestrictedItem()) {
            basket.add(item);
        }
    }

    public void displayItems()
    {
        basket.forEach(i -> System.out.println("Item's price: " + i.getPrice()));
    }

    public void deleteItemFromBasket(BasketItem item)
    {
        basket.remove(item);
    }
}
