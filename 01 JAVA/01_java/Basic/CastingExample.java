package ch02.sec08;
/**
 * @author JiYoon Yang
 */
/*
장제목: 2장 변수와 타입
작성일: 2025.04.14
*/
public class CastingExample { // 명시적 형변환(Cast) 사용하기
    public static void main(String[] args) {
        int var1 = 10;
        byte var2 = (byte) var1;
        System.out.println(var2);

        long var3 = 300;
        int var4 = (int) var3;
        System.out.println(var4);

        int var5 = 65;
        char var6 = (char) var5;
        System.out.println(var6);

        double var7 = 3.14;
        int var8 = (int) var7;
        System.out.println(var8);
    }
}
