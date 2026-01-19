package com.example.commerce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jeongjihun
 * Date: 26. 1. 19.
 * Time: 오후 2:04
 **/
// ?: 궁금했던 내용
// !: 공부하면서 알게 된 내용
public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(); // !: 내가 객체를 직접 생성할 때, new 키워드 사용

        Product product1 = new Product("Galaxy S25", "1,200,000원", "최신 안드로이드 스마트폰", 200);
        Product product2 = new Product("iPhone 16", "1,350,000원", "Apple의 최신 스마트폰", 150);
        Product product3 = new Product("MacBook Pro", "2,400,000원", "M3 칩셋이 탑재된 노트북", 100);
        Product product4 = new Product("AirPods Pro", "350,000원", "노이즈 캔슬링 무선 이어폰", 250);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        // 리스트 객체 생성 후 출력
        CommerceSystem commerceSystem = new CommerceSystem(products);
        commerceSystem.start();
    }
}
