package deep;
/**
 * @author JiYoon Yang
 */
/*
장제목: 5장 참조타입 > 심화문제
[문제] 주어진 배열 항목에서 최대값을 출력하는 코드를 작성하세요(for문이용)
작성일: 2025.04.17
*/
public class deep06 {
    public static void main(String[] args) {
        int[] array = {1,5,3,8,2};

        int max = array[0]; // 첫 번째 요소를 초기 최대값으로 설정

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // 현재 요소가 max보다 크면 갱신
            }
        }
        System.out.println("최대값: " + max);
    }
}