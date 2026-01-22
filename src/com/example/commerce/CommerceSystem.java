package com.example.commerce;


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

    ShoppingBag shoppingBag;

    // !: 문제 요구 사항에서 리스트 관리는 Category가 맡는다고 나와 있어서 코드를 수정해야 할 필요성을 알게됨
    Category category1 = new Category("전자제품");
    Category category2 = new Category("의류");
    Category category3 = new Category("식품");

    // 입출력 비즈니스 로직 구현
    public void start() {

        Scanner sc = new Scanner(System.in);

        // 리스트 생성
        category1.addElecList();
        category2.addClothList();
        category3.addFoodList();

        while (true) {
            System.out.println("[ 실시간 커머스 플랫폼 메인 ]");
            System.out.println("1. " + category1.getCategoryName());
            System.out.println("2. " + category2.getCategoryName());
            System.out.println("3. " + category3.getCategoryName());
            System.out.println("0. 종료 | 프로그램 종료");

            int inputNumber = sc.nextInt();

            // 1번 전자제품 목록의 물품 내역 출력 후 그 중 하나 선택하면 재고까지 출력하는 기능 구현
            if (inputNumber == 1) {
                for (int i = 0; i < category1.getElecList().size(); i++) {
                    System.out.println((i + 1) + ". " + category1.getElecList().get(i).getName() + " | " + category1.getElecList().get(i).getPrice() + "원 | " + category1.getElecList().get(i).getDescription());
                }
                System.out.println("0. 뒤로가기");

                while (true) {
                    int inputElecNumber = sc.nextInt();
                    if(inputElecNumber > 0 && inputElecNumber <= category1.getElecList().size()) {
                        System.out.println("선택한 상품: " + category1.getElecList().get(inputElecNumber - 1).getName() + " | " + category1.getElecList().get(inputElecNumber - 1).getPrice() + "원 | " + category1.getElecList().get(inputElecNumber - 1).getDescription() + " | 재고: " + category1.getElecList().get(inputElecNumber - 1).getQuantity() + "개");

                        // 장바구니 기능 구현(ing...) -> 나중에 ShoppingBag 클래스에 분리할 예정
                        System.out.println("위 상품을 장바구니에 추가하시겠습니까?");
                        System.out.println("1. 확인           2. 취소");
                        int inputPurchase = sc.nextInt();


                        if(inputPurchase == 1) {
                            System.out.println("담을 수량을 입력해주세요.");
                            int inputQuantity = sc.nextInt();
                            sc.nextLine();

                            if(inputQuantity < 0) {
                                System.out.println("0보다 큰 수를 입력하세오.");
                            } else if(inputQuantity > category1.getElecList().get(inputElecNumber - 1).getQuantity()) {
                                System.out.println("재고가 부족합니다. 현재 재고: " + category1.getElecList().get(inputElecNumber - 1).getQuantity());
                            } else if(inputQuantity <= category1.getElecList().get(inputElecNumber - 1).getQuantity()) {
                                shoppingBag = new ShoppingBag(category1.getElecList().get(inputElecNumber - 1).getName(), category1.getElecList().get(inputElecNumber - 1).getPrice(), inputQuantity);
                                shoppingBag.addBag(category1.getElecList().get(inputElecNumber - 1));
                                System.out.println(category1.getElecList().get(inputElecNumber - 1).getName() + "가 " + inputQuantity + "개 장바구니에 추가되었습니다.");

                                int newQuantity = category1.getElecList().get(inputElecNumber - 1).getQuantity() - inputQuantity;
                                category1.setQuantityOFElecList(inputElecNumber - 1, newQuantity);
                                System.out.println("재고 확인: " + category1.getElecList().get(inputElecNumber - 1).getName() + " | " + category1.getElecList().get(inputElecNumber - 1).getPrice() + "원 | " + category1.getElecList().get(inputElecNumber - 1).getDescription() + " | 남은 재고: " + category1.getElecList().get(inputElecNumber - 1).getQuantity() + "개");
                                break;
                            }
                        } else if (inputPurchase == 2) {
                            System.out.println("취소되었습니다.");
                            break;
                        } else {
                            System.out.println("잘못된 입력입니다. 숫자를 다시 입력해주세요.");
                            break;
                        }

                    } else if(inputElecNumber == 0) {
                        break;
                    } else {
                        System.out.println("잘못된 입력입니다. 상품의 숫자를 다시 입력해주세요.");
                    }
                }

              // 2번 의류 목록의 물품 내역 출력 후 그 중 하나 선택하면 재고까지 출력하는 기능 구현
            } else if (inputNumber == 2) {
                for (int i = 0; i < category2.getClothList().size(); i++) {
                    System.out.println((i + 1) + ". " + category2.getClothList().get(i).getName() + " | " + category2.getClothList().get(i).getPrice() + "원 | " + category2.getClothList().get(i).getDescription());
                }
                System.out.println("0. 뒤로가기");

                while (true) {
                    int inputElecNumber = sc.nextInt();
                    if(inputElecNumber > 0 && inputElecNumber <= category2.getClothList().size()) {
                        System.out.println("선택한 상품: " + category2.getClothList().get(inputElecNumber - 1).getName() + " | " + category2.getClothList().get(inputElecNumber - 1).getPrice() + "원 | " + category2.getClothList().get(inputElecNumber - 1).getDescription() + " | 재고: " + category2.getClothList().get(inputElecNumber - 1).getQuantity() + "개");
                        break;
                    } else if(inputElecNumber == 0) {
                        break;
                    } else {
                        System.out.println("잘못된 입력입니다. 상품의 숫자를 다시 입력해주세요.");
                    }
                }

              // 3번 식품 목록의 물품 내역 출력 후 그 중 하나 선택하면 재고까지 출력하는 기능 구현
            } else if (inputNumber == 3) {
                for (int i = 0; i < category3.getFoodList().size(); i++) {
                    System.out.println((i + 1) + ". " + category3.getFoodList().get(i).getName() + " | " + category3.getFoodList().get(i).getPrice() + "원 | " + category3.getFoodList().get(i).getDescription());
                }
                System.out.println("0. 뒤로가기");

                while (true) {
                    int inputElecNumber = sc.nextInt();
                    if(inputElecNumber > 0 && inputElecNumber <= category3.getFoodList().size()) {
                        System.out.println("선택한 상품: " + category3.getFoodList().get(inputElecNumber - 1).getName() + " | " + category3.getFoodList().get(inputElecNumber - 1).getPrice() + "원 | " + category3.getFoodList().get(inputElecNumber - 1).getDescription() + " | 재고: " + category3.getFoodList().get(inputElecNumber - 1).getQuantity() + "개");
                        break;
                    } else if(inputElecNumber == 0) {
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
