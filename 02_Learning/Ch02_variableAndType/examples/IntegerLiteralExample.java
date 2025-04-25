package ch02.sec02;
/**
 * @author JiYoon Yang
 */
/*
장제목: Ch02.변수와 타입
작성일: 2025.04.17
*/
public class IntegerLiteralExample {
    public static void main(String[] args) {
        int var1 = 0b1011;  // 2진수
        int var2 = 0206;    // 8진수
        int var3 = 365;     // 10진수
        int var4 = 0xB3;    // 16진수

        System.out.println("var1 = " + var1); // var1 = 11
        System.out.println("var2 = " + var2); // var2 = 134
        System.out.println("var3 = " + var3); // var3 = 365
        System.out.println("var4 = " + var4); // var4 = 179
    }
}
/*
본 예제는 다양한 정수 리터럴을 int 타입 변수에 대입하고, 10진수로 출력한 것이다.
 */