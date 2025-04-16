package ch05.sec06;
/**
 * @author JiYoon Yang
 */
/*
장제목: 5장 참조타입 > 기본문제
작성일: 2025.04.16
*/
public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] scores = {84, 90, 96};

        int sum = 0; // 총합 구하기
        for(int i=0; i<scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("sum = " + sum);

        int avg = 0; // 평균 구하기
        for(int i=0; i<scores.length; i++) {
            avg = sum/scores.length;
        }
        System.out.println("avg = " + avg);
    }

}
