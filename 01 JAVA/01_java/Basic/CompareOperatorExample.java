package ch03.sec06;
/**
 * @author JiYoon Yang
 */
/*
장제목: 3장 연산자
작성일: 2025.04.15
*/
public class CompareOperatorExample {
    public static void main(String[] args) {
        // ============== 첫 번째 문제 ================================ //
        int num1 = 10;
        int num2 = 20;

        boolean result1 = (num1 == num2);
        System.out.println("result1: " + result1); // result1: false

        boolean result2 = (num1 != num2);
        System.out.println("result2: " + result2); // result2: true

        boolean result3 = (num1 <= num2);
        System.out.println("result3: " + result3); // result3: true

        // ============== 두 번째 문제 ================================ //
        char char1 = 'A'; // 65의 값
        char char2 = 'B'; // 66의 값

        boolean result4 = (char1 < char2);
        System.out.println("result4: " + result4); // result4: true

        // ============== 세 번째 문제 ================================ //
        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4);
        System.out.println("result5: " + result5); // result5: true

        // ============== 네 번째 문제 ================================ //
        float num5 = 0.1f;
        double num6 = 0.1;
        boolean result6 = (num5 == num6);
        boolean result7 = (num5 == (float)num6);
        System.out.println("result6: " + result6); // result6: false
        System.out.println("result7: " + result7); // result7: true

        // ============== 다섯 번째 문제 ================================ //
        String str1 = "자바";
        String str2 = "Java";
        boolean result8 = (str1.equals(str2));
        boolean result9 = (! str1.equals(str2));
        System.out.println("result8: " + result8); // result8: false
        System.out.println("result9: " + result9); // result9: true
    }
}
