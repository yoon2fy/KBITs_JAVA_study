package ch03.sec11;
/**
 * @author JiYoon Yang
 */
/*
장제목: 3장 연산자
작성일: 2025.04.15
*/
public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85;

        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
        // grade는 score가 90점 초과이면 'A'를 주고, 80점 초과이면 'B'를 주고, 그것이 아니라면 'C'를 준다.
        System.out.println(score + "점은 " + grade + "등급입니다.");
        // 여기서 score의 값은 85의 int이므로, grade는 'B'이다.
    }
}