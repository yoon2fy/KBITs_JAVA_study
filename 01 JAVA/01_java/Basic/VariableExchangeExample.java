package ch02.sec01;
/**
 * @author JiYoon Yang
 */
/*
장제목: 2장 변수와 타입
작성일: 2025.04.14
*/
public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3; // 변수 x에 3을 지정함.
        int y = 5; // 변수 y에 5를 지정함.
        // 변수 x, y 값을 출력
        System.out.println("x:" + x + ", y:" + y);
        
        // x와 y의 값을 교환
        int a = x; 
        x = y;
        y = a;
        // 교환 후 x와 y값을 출력
        System.out.println("x:" + x + ", y:" + y);
    }
}