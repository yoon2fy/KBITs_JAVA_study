package ch05.sec05;
/**
 * @author JiYoon Yang
 */
/*
장제목: 5장 참조타입 > 기본문제
작성일: 2025.04.16
*/
public class SubStringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0,6);
        System.out.println(firstNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }
}
