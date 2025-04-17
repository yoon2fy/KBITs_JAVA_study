package ch02.sec05;
/**
 * @author JiYoon Yang
 */
/*
장제목: Ch02.변수와 타입
작성일: 2025.04.17
*/
public class BooleanExample {
    public static void main(String[] args) {
        boolean stop = true;
        if (stop) {
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");
        } // 중지합니다.
        System.out.println();

        int x = 10;
        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        System.out.println("result1 = " + result1); // result1 = false
        System.out.println("result2 = " + result2); // result2 = true
    }
}