package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass {

    //1.메소드 이름 변경하면 에러 발생
 //   @Override
 //   public void method2(int num) {}

    //2.메소드의 리턴타입 변경하면 에러발생

//    @Override
//    public int method(int num){return 0;}


    //3.매개변수 갯수나 타입이 변경되면 에러 발생
//    @Override
//    public void method(int num, String num){}

    //4.메소드 이름 리턴타입 매개변수의 갯수 타입 순서가 일치하는 경우 오버라이딩 성립
    @Override
    public void method(int num) {}

    //5.private 메소드는 오버라이딩 불가

//    @Override
//    private void privateMethod(){}

    //6.final 메소드 오버라이딩 불가
//    @Override
//    public final void finalMethod(){}


    //부모의 메소드의 접근제한자와 같거나 더 넓은 범위로 오버라이딩 가능
//    @Override
//    void protectMethod(){}


//    @Override
//    protected void protectedMethod(){}  // 같은범위로는가능


//    @Override
//    public void protectMethod(){}   //더 넓은 범위로도 가능


    //클래스에서도 final 키워드를 추가할 수 있는데 이는 상속을 제한하는 키워드로 사용(클래스 확장 불가)



}
