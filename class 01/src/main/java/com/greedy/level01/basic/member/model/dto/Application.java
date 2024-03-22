package com.greedy.level01.basic.member.model.dto;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        //getter를 이용해 필드의 초기값 확인
        //setter를 이용해서 필드 값 변경
        //getter를 이용해 변경된 필드값 확인



        MemberDTO memberDTO = new MemberDTO();

        System.out.println("id : " + memberDTO.getId());
        System.out.println("pwd : " + memberDTO.getPwd());
        System.out.println("name : " + memberDTO.getName());
        System.out.println("age : " + memberDTO.getAge());
        System.out.println("gender : " + memberDTO.getGender());
        System.out.println("phone : " + memberDTO.getPhone());
        System.out.println("email : " + memberDTO.getEmail());
        Scanner sc = new Scanner(System.in);


         memberDTO = new MemberDTO("user01","pass01","홍길동",20,'M',"010-1234-5678","hong123@greedy.com");

        System.out.println();



        System.out.println("변경 후 id : " + memberDTO.getId());
        System.out.println("변경 후 pwd : " + memberDTO.getPwd());
        System.out.println("변경 후 name : " + memberDTO.getName());
        System.out.println("변경 후 age : " + memberDTO.getAge());
        System.out.println("변경 후 gender : " + memberDTO.getGender());
        System.out.println("변경 후 phone : " + memberDTO.getPhone());
        System.out.println("변경 후 email : " + memberDTO.getEmail());
    }
}
