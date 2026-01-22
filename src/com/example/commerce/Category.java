package com.example.commerce;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jeongjihun
 * Date: 26. 1. 20.
 * Time: 오후 2:22
 **/

public class Category {

    // name, products 필드 생성, 캡슐화
    private String name;
    private List<Product> products;

    // !: 리스트의 관리 책임은 Category 클래스이기 때문에 CommerceSystem은 리스트를 몰라도 됨
    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    // name 을 반환하는 메서드(게터)
    public String getCategoryName() {
        return name;
    }

    // 전자제품을 추가한 리스트(products)를 불러오는 게터
    public List<Product> getElecList() {
        return products;
    }

    // 의류를 추가한 리스트(products)를 불러오는 게터
    public List<Product> getClothList() {
        return products;
    }

    // 식품을 추가한 리스트(products)를 불러오는 게터
    public List<Product> getFoodList() {
        return products;
    }

    // 전자제품 카테고리 리스트화 // !: 리스트에 추가만 하므로 반환값 없어도 됨
    public void addElecList() {
        Product product1 = new Product("Galaxy S25", 1_200_000, "최신 안드로이드 스마트폰", 200);
        Product product2 = new Product("iPhone 16", 1_350_000, "Apple의 최신 스마트폰", 150);
        Product product3 = new Product("MacBook Pro", 2_400_000, "M3 칩셋이 탑재된 노트북", 100);
        Product product4 = new Product("AirPods Pro", 350_000, "노이즈 캔슬링 무선 이어폰", 250);

        this.products.add(product1);
        this.products.add(product2);
        this.products.add(product3);
        this.products.add(product4);
    }

    // 의류 카테고리 리스트화
    public void addClothList() {
        Product product1 = new Product("티셔츠", 35_000, "평범한 반팔 티셔츠", 200);
        Product product2 = new Product("후드", 150_000, "유행하는 후드", 75);
        Product product3 = new Product("츄리닝", 700_000, "이탈리아 장인이 만든 츄리닝", 10);
        Product product4 = new Product("청바지", 450_000, "유명 브랜드 청바지", 25);

        this.products.add(product1);
        this.products.add(product2);
        this.products.add(product3);
        this.products.add(product4);
    }

    // 식품 카테고리 리스트화
    public void addFoodList() {
        Product product1 = new Product("초밥", 15_000, "모듬 초밥", 50);
        Product product2 = new Product("햄버거", 7_500, "불고기 버거", 250);
        Product product3 = new Product("치킨", 25_000, "AI 치킨", 150);
        Product product4 = new Product("피자", 35_000, "미국식 피자", 100);

        this.products.add(product1);
        this.products.add(product2);
        this.products.add(product3);
        this.products.add(product4);
    }

}
