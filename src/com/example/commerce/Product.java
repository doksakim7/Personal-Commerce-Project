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

    // 필드 캡슐화
    private String name, description;
    private long price;
    private int quantity;

    public Product(String name, long price, String description, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    // 게터
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public long getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // 세터
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
