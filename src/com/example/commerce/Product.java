package com.example.commerce;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jeongjihun
 * Date: 26. 1. 19.
 * Time: 오후 2:31
 **/

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

    // 전자제품 인스턴스화 후 List에 추가하고 리스트를 반환
    public static List<Product> getProducts() {
        Product product1 = new Product("Galaxy S25", "1,200,000원", "최신 안드로이드 스마트폰", 200);
        Product product2 = new Product("iPhone 16", "1,350,000원", "Apple의 최신 스마트폰", 150);
        Product product3 = new Product("MacBook Pro", "2,400,000원", "M3 칩셋이 탑재된 노트북", 100);
        Product product4 = new Product("AirPods Pro", "350,000원", "노이즈 캔슬링 무선 이어폰", 250);

        List<Product> products = new ArrayList<>();

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        return products;
    }
}
