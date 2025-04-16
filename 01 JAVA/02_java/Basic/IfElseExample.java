package ch04.sec02;
/**
 * @author JiYoon Yang
 */
/*
장제목: 4장 조건문과 반복문 > 기본문제
작성일: 2025.04.15
*/
public class IfElseExample {
    public static void main(String[] args) {
        int score = 93;
        if(score < 90) {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        }
        else {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }
    }
}
