package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application9 {

    public static void main(String[] args) {

        /*
            사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
            만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

            ex.
            첫 번째 숫자 : 8	첫 번째 숫자 : 4	첫 번째 숫자 : 9
            두 번째 숫자 : 4 	두 번째 숫자 : 8 	두 번째 숫자 : 0
            4 5 6 7 8 		4 5 6 7 8 		1 이상의 숫자를 입력해주세요.
       */

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 숫자 : ");
        int second = sc.nextInt();

        if(first < 1 || second < 1){
            System.out.println("1 이상의 숫자를 입력해주세요.");
        }else{
            int min = Math.min(first, second);
            int max = Math.max(first, second);

            for (int i = min; i <= max; i++){
                System.out.print(i + " ");
            }
        }

    }
}
