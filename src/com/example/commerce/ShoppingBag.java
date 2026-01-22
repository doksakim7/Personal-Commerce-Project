package com.example.commerce;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jeongjihun
 * Date: 26. 1. 21.
 * Time: 오후 8:18
 **/
// ?: 궁금했던 내용
// !: 공부하면서 알게 된 내용
public class ShoppingBag {
    String name;
    int quantity;
    long price;
    List<Product> shoppingBag;

    public ShoppingBag(String name, long price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.shoppingBag = new ArrayList<>();
    }

    public void showMeTheShoppingBag() {

    }

    public void addBag(Product product) {
        this.shoppingBag.add(product);
    }

    public List<Product> getShoppingBag() {
        return shoppingBag;
    }


}