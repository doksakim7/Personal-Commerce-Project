package com.example.commerce;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: jeongjihun
 * Date: 26. 1. 19.
 * Time: 오후 4:21
 **/
// ?: 궁금했던 내용
// !: 공부하면서 알게 된 내용
public class CommerceSystem {

    // Product 관리 리스트 필드 생성
    List<Product> products; // !: 누군가(다른 클래스) 객체를 생성해 줄 때는 선언만 함

    // 객체를 생성할 때 리스트화 구현
    CommerceSystem(List<Product> products) {
        this.products = products;
    }

    // 입출력 메서드 구현
    public void start() {
        System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");

        // 번호와 함께 전자제품의 이름, 가격, 설명 출력
        // ?: 향상된 for 문으로 할 수 있는지 궁금함
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
