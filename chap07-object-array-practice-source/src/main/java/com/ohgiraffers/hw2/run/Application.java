package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    // 객체 배열만 생성했을 때 안에 객체 값이 null이 되서
    // 접근할 수가 없다. 그래서 각각 객체를 생성해줘서 주소값으로 초기화해준다.?
    // 출력할 때 null이 아닌 객체들만 출력되도록 예외 처리를 해줘야한다.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;
        char add = 'y';
        StudentDTO[] studentDTOs = new StudentDTO[10];

        while(add == 'y') {

//            studentDTOs[count] = new StudentDTO(); // 각각 객체를 생성해서 주소값으로 초기화 필요

            System.out.print("학년을 입력하세요 : ");
            int grade = sc.nextInt();
//            studentDTOs[count].setGrade(sc.nextInt());

            System.out.print("반을 입력하세요 : ");
            int classroom = sc.nextInt();

            System.out.print("이름을 입력하세요 : ");
            String name = sc.next();

            System.out.print("국어 점수를 입력하세요 : ");
            int kor = sc.nextInt();

            System.out.print("영어 점수를 입력하세요 : ");
            int eng = sc.nextInt();

            System.out.print("수학 점수를 입력하세요 : ");
            int math = sc.nextInt();

            studentDTOs[count] = new StudentDTO(grade, classroom, name, kor, eng, math);
            count++;
            System.out.print("학생 정보를 게속 추가하시겠습니까? : ");
            add = sc.next().toLowerCase().charAt(0);
        }


        for(StudentDTO s : studentDTOs){

            if(s != null){
                int avg = (s.getKor() + s.getEng() + s.getMath()) / 3;
                System.out.print(s.information());
                System.out.println(", 평균 : " + avg);
            }
        }




    }
}
