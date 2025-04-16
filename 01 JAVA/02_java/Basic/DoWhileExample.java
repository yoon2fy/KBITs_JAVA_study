package ch04.sec06;

import java.util.Scanner;
/**
 * @author JiYoon Yang
 */
/*
장제목: 4장 조건문과 반복문 > 기본문제
작성일: 2025.04.16
*/
public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        Scanner sc = new Scanner(System.in);
        String inputSting;

        do {
            System.out.print(">");
            inputSting = sc.nextLine();     // 키보드로 부터 읽음
            System.out.println(inputSting); // 읽은 것을 반환함.
        } while (! inputSting.equals("q")); // {'q'값이 아니라면 반복을 함} = {'q'라면 반복을 멈춤}
        System.out.println("");
        System.out.println("프로그램 종료");
    }
}