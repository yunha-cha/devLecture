package com.hw1.run;

import com.hw1.model.dto.Employee;
import com.hw1.model.dto.Student;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        // 1
        Student[] students = {
            new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과"),
            new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과"),
            new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과")
        };

        for(Student s : students){
            System.out.println(s.information());
        }


        // 2
        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[10];
        int count = 0;

        while (true){
            System.out.println("사원 정보를 입력하세요");
            System.out.print("이름 : ");
            String name = sc.next();

            System.out.print("나이 : ");
            int age = sc.nextInt();

            System.out.print("신장 : ");
            double height = sc.nextDouble();

            System.out.print("몸무게 : ");
            double weight = sc.nextDouble();

            System.out.print("급여 : ");
            int salary = sc.nextInt();

            System.out.print("부서 : ");
            String dept = sc.next();

            employees[count] = new Employee(name, age, height, weight, salary, dept);
            count++;

            System.out.print("사원 정보를 추가하시겠습니까? : ");
            char q = sc.next().toLowerCase().charAt(0);

            if( q != 'y'){
                break;
            }
        }

        for(Employee e : employees){
            if( e != null ){
                System.out.println(e.information());
            }
        }



    }
}
