package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {

    public static void main(String[] args) {

        EmployeeDTO[] employeeDTOs = new EmployeeDTO[3];
        employeeDTOs[0] = new EmployeeDTO();
        employeeDTOs[1] = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        employeeDTOs[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

        for(int i = 0; i < employeeDTOs.length; i++){
            System.out.println("emp[" + i + "] : " + employeeDTOs[i].information());
        }
        System.out.println("================================================================");

        employeeDTOs[0] = new EmployeeDTO( 0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");
        employeeDTOs[1].setDept("기획부");
        employeeDTOs[1].setJob("부장");
        employeeDTOs[1].setSalary(4000000);
        employeeDTOs[1].setBonusPoint(0.3);

        for(int i = 0; i < employeeDTOs.length - 1; i++){
            System.out.println("emp[" + i + "] : " + employeeDTOs[i].information());
        }
        System.out.println("================================================================");

        int sum = 0;

//        for(int i = 0; i < employeeDTOs.length; i++){
//            int annualSalary = (int)(employeeDTOs[i].getSalary() + (employeeDTOs[i].getSalary() * employeeDTOs[i].getBonusPoint())) * 12;
//
//            System.out.println(employeeDTOs[i].getEmpName() + "의 연봉 : " + annualSalary + "원");
//            sum += annualSalary;
//        }

        for(EmployeeDTO employee : employeeDTOs){
            int annualSalary = (int)(employee.getSalary() + (employee.getSalary() * employee.getBonusPoint())) * 12;

            System.out.println(employee.getEmpName() + "의 연봉 : " + annualSalary + "원");
            sum += annualSalary;
        }

        System.out.println("================================================================");
        System.out.println("직원들의 연봉의 평균 : " + (sum / 3) + "원");


    }
}
