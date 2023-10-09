package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

public class Application {

    public static void main(String[] args) {
        EmployeeDTO employee = new EmployeeDTO();
        employee.setNumber(200);
        employee.setName("홍길동");
        employee.setDept("영업부");
        employee.setJob("과장");
        employee.setAge(20);
        employee.setGender('남');
        employee.setSalary(2000000);
        employee.setBonusPoint(0.5);
        employee.setPhone("010-1234-5678");
        employee.setAddress("서울서 서초구 서초동");

        System.out.println(employee.getNumber());
        System.out.println(employee.getName());
        System.out.println(employee.getJob());
        System.out.println(employee.getAge());
        System.out.println(employee.getGender());
        System.out.println(employee.getSalary());
        System.out.println(employee.getBonusPoint());
        System.out.println(employee.getPhone());
        System.out.println(employee.getAddress());

    }
}
