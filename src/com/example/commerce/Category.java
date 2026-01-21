package com.example.commerce;


import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jeongjihun
 * Date: 26. 1. 20.
 * Time: 오후 2:22
 **/

public class Category {

    // name, products 필드 생성
    String name;
    List<Product> products; // !: 누군가(다른 클래스) 객체를 생성해 줄 때는 선언만 함

    Category(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    // name 을 반환하는 메서드
    public String categoryName(String name) {
        return name;
    }

    // 전자제품 카테고리 리스트화
    public List<Product> elecProducts() {
        Product product1 = new Product("Galaxy S25", "1,200,000원", "최신 안드로이드 스마트폰", 200);
        Product product2 = new Product("iPhone 16", "1,350,000원", "Apple의 최신 스마트폰", 150);
        Product product3 = new Product("MacBook Pro", "2,400,000원", "M3 칩셋이 탑재된 노트북", 100);
        Product product4 = new Product("AirPods Pro", "350,000원", "노이즈 캔슬링 무선 이어폰", 250);

        this.products.add(product1);
        this.products.add(product2);
        this.products.add(product3);
        this.products.add(product4);

        return products;
    }

    // 의류 카테고리 리스트화
    public List<Product> clothProducts() {
        Product product1 = new Product("티셔츠", "35,000원", "평범한 반팔 티셔츠", 200);
        Product product2 = new Product("후드", "150,000원", "유행하는 후드", 75);
        Product product3 = new Product("츄리닝", "700,000원", "이탈리아 장인이 만든 츄리닝", 10);
        Product product4 = new Product("청바지", "450,000원", "유명 브랜드 청바지", 25);

        this.products.add(product1);
        this.products.add(product2);
        this.products.add(product3);
        this.products.add(product4);

        return products;
    }

    // 식품 카테고리 리스트화
    public List<Product> foodProducts() {
        Product product1 = new Product("초밥", "15,000원", "모듬 초밥", 50);
        Product product2 = new Product("햄버거", "7,500원", "불고기 버거", 250);
        Product product3 = new Product("치킨", "25,000원", "AI 치킨", 150);
        Product product4 = new Product("피자", "35,000원", "미국식 피자", 100);

        this.products.add(product1);
        this.products.add(product2);
        this.products.add(product3);
        this.products.add(product4);

        return products;
    }

}
