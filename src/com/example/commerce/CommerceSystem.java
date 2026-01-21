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

    // 객체 생성
    List<Product> elecProducts = new ArrayList<>();
    List<Product> clothProducts = new ArrayList<>();
    List<Product> foodProducts = new ArrayList<>();
    Category category1 = new Category("전자제품", elecProducts);
    Category category2 = new Category("의류", clothProducts);
    Category category3 = new Category("식품", foodProducts);

    // 입출력 비즈니스 로직 구현
    public void start() {
        this.elecProducts = category1.makeElecList();
        this.clothProducts = category2.makeClothList();
        this.foodProducts = category3.makeFoodList();

        while (true) {
            System.out.println("[ 실시간 커머스 플랫폼 메인 ]");
            System.out.println("1. " + category1.getCategoryName());
            System.out.println("2. " + category2.getCategoryName());
            System.out.println("3. " + category3.getCategoryName());
            System.out.println("0. 종료 | 프로그램 종료");

            Scanner sc = new Scanner(System.in);
            int inputNumber = sc.nextInt();

            // 1번 전자제품 목록의 물품 내역 출력 후 그 중 하나 선택하면 재고까지 출력하는 기능 구현
            if (inputNumber == 1) {
                for (int i = 0; i < elecProducts.size(); i++) {
                    System.out.println((i + 1) + ". " + elecProducts.get(i).getName() + " | " + elecProducts.get(i).getPrice() + "원 | " + elecProducts.get(i).getDescription());
                }
                while (true) {
                    int inputElecNumber = sc.nextInt();
                    if(inputElecNumber > 0 && inputElecNumber <= elecProducts.size()) {
                        System.out.println("선택한 상품: " + elecProducts.get(inputElecNumber - 1).getName() + " | " + elecProducts.get(inputElecNumber - 1).getPrice() + "원 | " + elecProducts.get(inputElecNumber - 1).getDescription() + " | 재고: " + elecProducts.get(inputElecNumber - 1).getQuantity() + "개");
                        break;
                    } else {
                        System.out.println("잘못된 입력입니다. 상품의 숫자를 다시 입력해주세요.");
                    }
                }

              // 2번 의류 목록의 물품 내역 출력 후 그 중 하나 선택하면 재고까지 출력하는 기능 구현
            } else if (inputNumber == 2) {
                for (int i = 0; i < clothProducts.size(); i++) {
                    System.out.println((i + 1) + ". " + clothProducts.get(i).getName() + " | " + clothProducts.get(i).getPrice() + "원 | " + clothProducts.get(i).getDescription());
                }
                while (true) {
                    int inputElecNumber = sc.nextInt();
                    if(inputElecNumber > 0 && inputElecNumber <= clothProducts.size()) {
                        System.out.println("선택한 상품: " + clothProducts.get(inputElecNumber - 1).getName() + " | " + clothProducts.get(inputElecNumber - 1).getPrice() + "원 | " + clothProducts.get(inputElecNumber - 1).getDescription() + " | 재고: " + clothProducts.get(inputElecNumber - 1).getQuantity() + "개");
                        break;
                    } else {
                        System.out.println("잘못된 입력입니다. 상품의 숫자를 다시 입력해주세요.");
                    }
                }

              // 3번 식품 목록의 물품 내역 출력 후 그 중 하나 선택하면 재고까지 출력하는 기능 구현
            } else if (inputNumber == 3) {
                for (int i = 0; i < foodProducts.size(); i++) {
                    System.out.println((i + 1) + ". " + foodProducts.get(i).getName() + " | " + foodProducts.get(i).getPrice() + "원 | " + foodProducts.get(i).getDescription());
                }
                while (true) {
                    int inputElecNumber = sc.nextInt();
                    if(inputElecNumber > 0 && inputElecNumber <= foodProducts.size()) {
                        System.out.println("선택한 상품: " + foodProducts.get(inputElecNumber - 1).getName() + " | " + foodProducts.get(inputElecNumber - 1).getPrice() + "원 | " + foodProducts.get(inputElecNumber - 1).getDescription() + " | 재고: " + foodProducts.get(inputElecNumber - 1).getQuantity() + "개");
                        break;
                    } else {
                        System.out.println("잘못된 입력입니다. 상품의 숫자를 다시 입력해주세요.");
                    }
                }

              // 0을 입력 받으면 종료 안내문을 출력하고 종료하는 기능 구현
            } else if (inputNumber == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                break;
              // 범위 외의 숫자를 입력하면 재입력을 안내하는 기능 구현
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
            }
            System.out.println();
        }
    }
}
