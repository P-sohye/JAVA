package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Application {
    public static void main(String[] args) {

        /* Product 기본 생성자 */
        Product product1 = new Product();
        System.out.println(product1.getInfomation());

        /* Product 매개변수 생성자 */
        Product product2 = new Product("S-01234", "삼성", "갤럭시", 2380000, new Date());
        System.out.println(product2.getInfomation());

        Computer computer = new Computer();
        System.out.println(computer.getInfomation());

        Computer computer1 = new Computer("퀄컴 스냅드래곤", 512, 12, "안드로이드");
        System.out.println(computer1.getInfomation());

        /* Product, Computer 모든 필드 초기화 생성자 */
        Computer computer2 = new Computer("S-01234", "삼성", "갤럭시", 2380000, new Date(),
                "퀄컴 스냅드래곤", 512, 12, "안드로이드");
        System.out.println(computer2.getInfomation());
    }
}
