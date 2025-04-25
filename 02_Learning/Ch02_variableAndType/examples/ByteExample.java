package ch02.sec02;
/**
 * @author JiYoon Yang
 */
/*
장제목: Ch02.변수와 타입
작성일: 2025.04.17
*/
public class ByteExample {
    public static void main(String[] args) {
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
//        byte var6 = 128;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
    }
}
/*
byte 타입 변수에 허용 범위를 초과한 값을 대입했을 경우 컴파일 오류가 발생(#16)하는 것을 보여주는 예제이다.
 */