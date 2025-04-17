package deep;
/**
 * @author JiYoon Yang
 */
/*
장제목: 5장 참조타입 > 심화문제
[문제] 주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성하시오 (중첩for 문이용)
작성일: 2025.04.17
*/
public class deep07 {
    public static void main(String[] args) {
        int [][] array = {
                { 95, 86 },
                { 83, 92, 96 },
                { 78, 83, 93, 87, 88 }
        };

        int sum = 0;          // 전체 합을 저장할 변수
        int count = 0;        // 전체 항목 수 (평균 계산을 위해 필요)

        // 중첩 for문으로 배열 순회
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];  // 각 항목을 합계에 누적
                count++;             // 항목 수 증가
            }
        }

        double average = (double) sum / count;

        System.out.println("합계: " + sum);
        System.out.println("평균: " + average);
    }
}