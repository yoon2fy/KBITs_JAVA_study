package ch02.sec09;
/**
 * @author JiYoon Yang
 */
/*
장제목: Ch02.변수와 타입
작성일: 2025.04.17
*/
public class OperationPromotionExample {
    public static void main(String[] args) {
        byte result1 = 10 + 20;
        System.out.println(result1); // 30; 컴파일 단계에서의 연산

        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2;
        System.out.println(result2); // 30; int 타입으로 변환 후 연산

        byte v3 = 10;
        int v4 = 20;
        long v5 = 1000L;
        long result3 = v3 + v4 + v5;
        System.out.println(result3); // 1030; long 타입으로 변환 후 연산

        char v6 = 'A';
        char v7 = 1;
        int result4 = v6 + v7;
        System.out.println(result4); // 66; int 타입으로 변환 후 연산
        System.out.println((char)result4); // B; 연산된 값을 char 타입으로 변환

        int v8 = 10;
        int result5 = v8/4;
        System.out.println(result5); // 2; 정수 연산의 결과는 정수

        int v9 = 10;
        double result6 = v9/4.0;
        System.out.println(result6); // 2.5; double 타입으로 변환 후 연산

        int v10 = 1;
        int v11 = 2;
        double result7 = (double) v10/v11;
        System.out.println(result7); // 0.5; double 타입으로 변환 후 연산
    }
}
