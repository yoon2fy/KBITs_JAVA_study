package ch04.sec07;
/**
 * @author JiYoon Yang
 */
/*
장제목: 4장 조건문과 반복문 > 기본문제
작성일: 2025.04.16
*/
public class BreakExample {
    public static void main(String[] args) {
     while (true) {
         int num = (int)(Math.random()*6 + 1);
         System.out.println(num); // 무한 루프에서 1~6 사이의 값을 랜덤하게 출력한다.

         if(num == 6) {
             break; // 그 값이 6인 경우 루프를 끝낸다.
         }
     }
     System.out.println();
    }
}
