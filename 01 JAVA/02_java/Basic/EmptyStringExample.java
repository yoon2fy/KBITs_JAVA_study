package ch05.sec05;
/**
 * @author JiYoon Yang
 */
/*
장제목: 5장 참조타입 > 기본문제
작성일: 2025.04.16
*/
public class EmptyStringExample {
    public static void main(String[] args) {
        String hobby = "";
        if(hobby.equals("")) {
            System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
        }
        
    }
}
