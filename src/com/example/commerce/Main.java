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
        // getProducts로 전자제품 리스트 호출
        List<Product> products = Product.getProducts();

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
