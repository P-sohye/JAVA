package com.ohgiraffers.section01.conditional;

public class Application {
    public static void main(String[] args) {

        A_if a = new A_if();
//        a.simpleIfStatment();
//        a.netedIfStatment();

        B_ifElseIf b = new B_ifElseIf();
//        b.simpleIfElseIfStatment();
//        b.nestedIfElseIfStatement();

        C_switch c = new C_switch();
//        c.simpleSwitchStatement();
        c.switchVendingMachine();
    }
}
