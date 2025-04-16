package ch04.sec04;
/**
 * @author JiYoon Yang
 */
/*
장제목: 4장 조건문과 반복문 > 기본문제
작성일: 2025.04.16
*/
public class PrintFrom1To10ExampleWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
    }
}
/*
while문과 for문의 차이에 대한 내 생각
- 변수선언 + while (조건){결과; 규칙;}
- for (변수선언; 조건; 규칙){결과;}
 */