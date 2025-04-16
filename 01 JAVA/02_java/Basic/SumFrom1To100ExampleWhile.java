package ch04.sec04;
/**
 * @author JiYoon Yang
 */
/*
장제목: 4장 조건문과 반복문 > 기본문제
작성일: 2025.04.16
*/
public class SumFrom1To100ExampleWhile {
    public static void main(String[] args) {
        int sum = 0;
        int i=1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("1~" + (i-1) + " 합: " + sum);
    }
}
/*
*       int sum = 0; // int 변수 sum을 선언함.
        int i; // int 변수 i를 선언함.
        for (i = 0; i <= 100; i++) { // i=0부터 1씩 더해지고, i가 100까지 반복됨.
            sum += i; // sum은 i를 더하는 것임. 따라서 1부터 100까지 더해지는 결과를 얻을 수 있음.
        }
        System.out.println(sum); // 5050
        * */