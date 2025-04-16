package ch05.sec10;
/**
 * @author JiYoon Yang
 */
/*
장제목: 5장 참조타입 > 기본문제
작성일: 2025.04.16
*/
public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = {95, 71, 84, 93, 87};

        int sum = 0;
        for (int score : scores) { // advFor = 5개의 항목이 한 번씩 score 변수에 저장되고 sum에 누적됨 (iter = 5)
            sum = sum + score;
        }
        System.out.println("점수 총합 = " + sum);
        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 = " + avg);
    }
}
