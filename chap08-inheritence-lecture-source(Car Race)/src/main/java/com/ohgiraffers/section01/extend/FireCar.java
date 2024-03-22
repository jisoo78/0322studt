package com.ohgiraffers.section01.extend;

public class FireCar extends Car {

    public FireCar(){

        /*
        * 모든 생성자에는 맨 첫 줄에 super()를 컴파일러가 자동 추가한다
        * 부모의 기본 생성자를 호출하는 구문히다
        * 명시적 묵시적 전부 사용 가능하다
        * */
        super();
        System.out.println("FireCar 클래스의 기본 생성자 호출됨....");

    }

    /*soundHorn()오버라이딩 */

    /*
    * @overrid 어노테이션
    * JDK1.5부터 추가된 문법 오버라이딩 성립요건을 체크하여 성립되지 않는 경우 컴파일 에러 발생
    * (오버라이딩이 정상적으로 작성된 것이지를 체크해주는 기능)
    * 오버라이딩 하는 메소드를 기본적으로 부모 메소드 선언 내용을 그대로 작성해야한다
    * */

    @Override
    public void soundHorn() {
        if (isRunning()){
            System.out.println("빵빵");
        }else {
            System.out.println("자동차 부수기");
        }
    }



    public void sprayWater(){

        System.out.println("꼬부기등장");
    }
}
