package com.ohgiraffers.section03.overriding;

public class subClass extends SuperClass{

    /*메소드 이름, 리턴 타입, 매개변수의 갯수 & 타입 & 순서 일치해야 성립*/
    @Override
//    public void method(int num) {}
//    public int method(int num){return 0;}
//    public void method(String num){}
    public void method(int num){}

    /*private 메소드 오버리아딩 불가*/
//    @Override
//    private void privateMethod(){}

    /*final 메소드 오버라이딩 불가*/
//    @Override
//    public final void finalMethod(){}

    /*protected -> default 로 변경시 더 좁은 범위로의 변경이라 불가*/
//    @Override
//    default void protectedMethod() {}
//    void protectedMethod() {} //default는 생략 해도 같의 의미

    /*protected -> public 은 더 넓은 범위로의 변경이라 가능*/
    @Override
    protected void protectedMethod(){}

}
