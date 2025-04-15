package ch02.sec13;
/**
 * @author JiYoon Yang
 */
/*
장제목: 2장 변수와 타입 > 심화2문제
작성일: 2025.04.15
*/

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("x 값 입력: ");
        String strX = sc.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y 값 입력: ");
        String strY = sc.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x+y: " + result);
        System.out.println();

        while (true){
            System.out.print("입력 문자열: ");
            String data = sc.nextLine();
            if(data.equals("q")){
                break;
            }
            System.out.println("출력 문자열: " + data);
            System.out.println();
        }

        System.out.println("종료");
    }
}
