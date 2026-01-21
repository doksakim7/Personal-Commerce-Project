package com.example.commerce;


/**
 * Created by IntelliJ IDEA.
 * User: jeongjihun
 * Date: 26. 1. 20.
 * Time: 오후 2:26
 **/

public class Customer {
    // 필드 캡슐화
    private String customerName, customerEmail, customerGrade;
    private long customerTotalPrice;

    Customer(String customerName, String customerEmail) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
    }

    public String makeGrade (long customerTotalPrice) {
        this.customerTotalPrice = customerTotalPrice;

        if (this.customerTotalPrice < 500000) {
            return this.customerGrade = "브론즈";
        } else if (this.customerTotalPrice < 1000000) {
            return this.customerGrade = "실버";
        } else if (this.customerTotalPrice < 2000000) {
            return this.customerGrade = "골드";
        } else {
            return this.customerGrade = "플레티넘";
        }
    }
}
