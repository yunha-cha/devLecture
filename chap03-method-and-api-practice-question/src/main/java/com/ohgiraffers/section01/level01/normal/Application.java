package com.ohgiraffers.section01.level01.normal;

public class Application {

    /* 실행용 메소드 */
    public static void main(String[] args) {

        /* RamdomMaker 클래스의 메소드를 호출해서 실행 */

        String rps = RandomMaker.rockPaperScissors();
        System.out.println(rps);
        String tc = RandomMaker.tossCoin();
        System.out.println(tc);

    }

}
