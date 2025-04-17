package ch02.sec02;
/**
 * @author JiYoon Yang
 */
/*
장제목: Ch02.변수와 타입
작성일: 2025.04.17
*/
public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A';  // 문자 저장
        char c2 = 65;   // 유니코드 직접 저장
        char c3 = '가';     // 문자 저장
        char c4 = 44032;    // 유니코드 직접 저장

        System.out.println(c1); // A
        System.out.println(c2); // A
        System.out.println(c3); // 가
        System.out.println(c4); // 가
    }
}
