package ch05.sec06;
/**
 * @author JiYoon Yang
 */
/*
장제목: 5장 참조타입 > 기본문제
작성일: 2025.04.16
*/
public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[] scores; // 배열 변수 선언
        scores = new int[]{83,90,87}; // 배열 변수에 배열을 대입

        int sum1 = 0; // 초깃값 설정
        for (int i=0; i<3; i++){
            sum1 += scores[i];
        }
        System.out.println("총합 : " + sum1);

        // 배열을 매개값으로 주고, printItem() 메소드를 호출한다.
        printItem(new int[] {83, 90, 87});
    }
    // printItem() 메소드 선언
    public static void printItem(int[] scores) {
        for (int i=0; i<3; i++){
            System.out.println("scores[" + i + "] = " + scores[i]);
        }
    }
}