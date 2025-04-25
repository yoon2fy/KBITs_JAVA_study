package ch02.sec07;
/**
 * @author JiYoon Yang
 */
/*
장제목: Ch02.변수와 타입
작성일: 2025.04.17
*/
public class PromotionExample {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue: "+intValue); // intValue: 10

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드: " + intValue); // 가의 유니코드: 44032

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue: "+longValue); // longValue: 50

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue: "+floatValue); // floatValue: 100.0 -- 실수라서 100.0으로 반환하는 것임.

        floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println("doubleValue: "+doubleValue); // doubleValue: 100.5
    }
}
