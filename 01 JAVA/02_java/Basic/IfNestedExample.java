package ch04.sec02;
/**
 * @author JiYoon Yang
 */
/*
장제목: 4장 조건문과 반복문 > 기본문제
작성일: 2025.04.15
*/
public class IfNestedExample {
    public static void main(String[] args) {
        int score = (int)(Math.random()*20)+81;
        System.out.println("점수: " + score);

        String grade;

        if (score >= 90) {
            if(score >= 95) {
                grade = "A+";
            } else {
                grade = "A";
            }
        } else {
            if (score >= 85) {
                grade = "B+";
            } else {
                grade = "B";
            }
        }
        System.out.println("학점: " + grade);
    }
}
