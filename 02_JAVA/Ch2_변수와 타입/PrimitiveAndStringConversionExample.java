package ch02.sec10;
/**
 * @author JiYoon Yang
 */
/*
장제목: Ch02.변수와 타입
작성일: 2025.04.17
*/
public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println(value1); // 10; value 값임
        System.out.println(value2); // 3.14; value 값임
        System.out.println(value3); // true; value 값임
        System.out.println();

        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println(str1); // 10; String 값임
        System.out.println(str2); // 3.14; String 값임
        System.out.println(str3); // true; String 값임
    }
}