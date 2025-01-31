package com.ohgiraffers.section08.initblock;

public class Application {
    public static void main(String[] args) {

        /* 기본 생성자로 인스턴스(객체) 생성 */
        Product product = new Product();
        System.out.println(product.getInfomation());

        /* 매개변수 생성자로 인스턴스(객체) 생성 */
        Product product2 = new Product("대륙폰", 300000, "샤우미");
        System.out.println(product2.getInfomation());

    }
}
