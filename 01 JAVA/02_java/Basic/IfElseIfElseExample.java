package ch04.sec02;
/**
 * @author JiYoon Yang
 */
/*
장제목: 4장 조건문과 반복문 > 기본문제
작성일: 2025.04.15
*/
public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75;
        if (score > 89){
            System.out.println("점수가 90 ~ 100 입니다.");
            System.out.println("등급은 A입니다.");
        } else if (score > 79) {
            System.out.println("점수가 80 ~ 89 입니다.");
            System.out.println("등급은 B입니다.");
        } else if (score > 69) {
            System.out.println("점수가 70 ~ 79 입니다.");
            System.out.println("등급은 C입니다.");
        } else {
            System.out.println("점수가 00 ~ 69 입니다.");
            System.out.println("등급은 D입니다.");
        }
    }
}
