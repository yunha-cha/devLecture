package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.vo.ProductDTO;

import java.util.Scanner;

public class ProductController {

    ProductDTO[] pro = new ProductDTO[10];

    public static int count = 0;
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){

        do{
            System.out.println("===== 제품 관리 메뉴 =====");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("9. 프로그램 종료");

            int menu = sc.nextInt();

            switch (menu){
                case 1:
                    productInput(); break;
                case 2:
                    productPrint(); break;
                case 9:
                    return;
            }

        }while(true);
    }

    // 등록
    public void productInput(){

//        pro[count] = new ProductDTO();
        System.out.print("제품 id를 입력하세요 : ");
        int id = sc.nextInt();
        System.out.print("제품 제목을 입력하세요 : ");
        String name = sc.next();
        System.out.print("제품 가격을 입력하세요 : ");
        int price = sc.nextInt();
        System.out.print("제품 세금을 입력하세요 : ");
        double tax = sc.nextDouble();

        pro[count] = new ProductDTO(id, name, price, tax);

    }


    // 조회
    public void productPrint(){
        for(int i = 0; i < pro.length; i++){
            if(pro[i] != null){
                System.out.println(pro[i].information());
            }

        }
    }

}
