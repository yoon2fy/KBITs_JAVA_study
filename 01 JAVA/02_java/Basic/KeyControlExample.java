package ch04.sec05;

import java.util.Scanner;
/**
 * @author JiYoon Yang
 */
/*
장제목: 4장 조건문과 반복문 > 기본문제
작성일: 2025.04.16
*/
public class KeyControlExample {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Scanner 객체를 생성함.
    boolean run = true;
    int speed = 0;

    while (run) { // while 조건식에 true를 사용하였다. 따라서 무한 반복을 하게 된다. (i)
        // 메뉴를 생성함.
        System.out.println("-------------------------");
        System.out.println("1. 증속 | 2. 감속 | 3. 중지");
        System.out.println("-------------------------");
        System.out.println("선택: ");

        String strNum = sc.nextLine(); // 키보드에서 입력한 내용을 읽음

        if (strNum.equals("1")) {
            speed++;
            System.out.println("현재 속도 = " + speed);
        } else if (strNum.equals("2")) {
            speed--;
            System.out.println("현재 속도 = " + speed);
        } else if (strNum.equals("3")) {
            run = false; // while(false)가 되면 (i)의 무한 반복을 멈추게 된다.
        }
    }
    }
}
