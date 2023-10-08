package com.ohgiraffers.section01.level02.normal;

import java.util.Random;

public class Application7 {

    public static void main(String[] args) {

        /*
         * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
         * 1 ~ 10사이의 난수를 발생시켜 배열에 초기화 후
         * 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요
         *
         * ex.
         * 5 3 2 7 4 8 6 10 9 10
         * 최댓값 : 10
         * 최솟값 : 2
         * */

        Random random = new Random();

        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(10) + 1;
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // 최댓값
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){ // 최댓값
                max = arr[i];
            }
            if(min > arr[i]){ // 최솟값
                min = arr[i];
            }
        }
        System.out.println("최댓값 : " + max );
        System.out.println("최솟값 : " + min );


    }
}
