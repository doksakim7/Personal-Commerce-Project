package com.example.commerce;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jeongjihun
 * Date: 26. 1. 19.
 * Time: 오후 2:31
 **/
// ?: 궁금했던 내용
// !: 공부하면서 알게 된 내용
public class Product {

    // 이름, 설명, 가격, 수량 필드 생성
    String name, description, price;
    int quantity;

    // 생성자
    public Product(String name, String price, String description, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }
}
