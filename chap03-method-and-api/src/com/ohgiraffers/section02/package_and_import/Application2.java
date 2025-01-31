package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;
/* static import의 경우 사용하려는 static method 까지 기술해야 한다. */
import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;

public class Application2 {
    public static void main(String[] args) {

        /* non-static 메서드 */
        Calculator calc = new Calculator();
        int min = calc.minNumberOf(1, 21);

        System.out.println("작은 값 : " + min);

        /* static 메서드 (클래스명 생략 가능) */
        int max = maxNumberOf(1, 21);
        System.out.println("큰 값 : " + max);


    }
}
