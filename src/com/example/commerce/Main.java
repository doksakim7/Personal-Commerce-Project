package com.example.commerce;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: jeongjihun
 * Date: 26. 1. 19.
 * Time: 오후 2:04
 **/

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Galaxy S25", "1,200,000원", "최신 안드로이드 스마트폰", 200);
        Product product2 = new Product("iPhone 16", "1,350,000원", "Apple의 최신 스마트폰", 150);
        Product product3 = new Product("MacBook Pro", "2,400,000원", "M3 칩셋이 탑재된 노트북", 100);
        Product product4 = new Product("AirPods Pro", "350,000원", "노이즈 캔슬링 무선 이어폰", 250);

        List<Product> products = new ArrayList<>();

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");

        // 번호와 함께 전자제품의 이름, 가격, 설명 출력
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i).name + " | " + products.get(i).price + " | " + products.get(i).description);
        }

        System.out.println("0. 종료 | 프로그램 종료");

        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();

        // 0을 입력 받으면 종료 안내문을 출력하고 종료
        if (inputNumber == 0) {
            System.out.println("커머스 플랫폼을 종료합니다.");
        }

    }


}
