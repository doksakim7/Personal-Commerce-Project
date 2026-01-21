package com.example.commerce;



/**
 * Created by IntelliJ IDEA.
 * User: jeongjihun
 * Date: 26. 1. 19.
 * Time: 오후 2:31
 **/
// ?: 궁금했던 내용
// !: 공부하면서 알게 된 내용
public class Product {

    String name, description, price;
    int quantity;

    public Product(String name, String price, String description, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }
}
