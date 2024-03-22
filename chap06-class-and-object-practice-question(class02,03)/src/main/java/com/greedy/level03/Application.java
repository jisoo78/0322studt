package com.greedy.level03;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("회원정보 : ");
        int number = sc.nextInt();
        sc.nextLine();                  //정보 nextint 다음 nextLine으로 끊어야한다
        System.out.println("회원이름 :");
        String name = sc.nextLine();
        System.out.println("부서 : ");
        String dept = sc.next();
        System.out.println("직책 : ");
        String job = sc.next();
        System.out.println("나이 : ");
        int age = sc.nextInt();
        System.out.println("성별 : ");
        char gender = sc.next().charAt(0);  //charAt 가 뭘까
        System.out.println("급여 : ");
        int salary = sc.nextInt();
        System.out.println("보너스 : ");
        double bounsPoint = sc.nextInt();
        sc.nextLine();
        System.out.println("휴대폰 : ");
        String phone = sc.next();
        System.out.println("주소 : ");
        String address = sc.next();

        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setNumber(number);
        employeeDTO.setName(name);
        employeeDTO.setDept(dept);
        employeeDTO.setJob(job);
        employeeDTO.setAge(age);
        employeeDTO.setGender(gender);
        employeeDTO.setSalary(salary);
        employeeDTO.setBounsPoint(bounsPoint);
        employeeDTO.setPhone(phone);
        employeeDTO.setAddress(address);

        System.out.println(employeeDTO.getNumber());
        System.out.println(employeeDTO.getName());
        System.out.println(employeeDTO.getDept());
        System.out.println(employeeDTO.getJob());
        System.out.println(employeeDTO.getAge());
        System.out.println(employeeDTO.getGender());
        System.out.println(employeeDTO.getSalary());
        System.out.println(employeeDTO.getBounsPoint());
        System.out.println(employeeDTO.getPhone());
        System.out.println(employeeDTO.getAddress());







    }
}
