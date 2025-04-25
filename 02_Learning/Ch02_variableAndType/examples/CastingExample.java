package ch02.sec08;
/**
 * @author JiYoon Yang
 */
/*
장제목: Ch02.변수와 타입
작성일: 2025.04.17
*/
public class CastingExample {
    public static void main(String[] args) {
        int var1 = 10;
        byte var2 = (byte) var1; 
        System.out.println(var2); // 10; byte 타입으로 Casting을 하면 앞의 3byte는 삭제되고 끝 1byte값만 byte타입 변수에 저장됨.

        long var3 = 300;
        int var4 = (int) var3;
        System.out.println(var4); // 300; int 타입으로 Casting을 하면 앞의 4byte는 버려지고 끝 4byte만 int 타입으로 저장됨.

        int var5 = 65;
        char var6 = (char) var5;
        System.out.println(var6); // A

        double var7 = 3.14;
        int var8 = (int) var7;
        System.out.println(var8); // 3; 실수 타입을 정수 타입으로 Casting한 경우, 소수점 이하 부분은 버려지고 정수 부분만 저장됨.
    }
}