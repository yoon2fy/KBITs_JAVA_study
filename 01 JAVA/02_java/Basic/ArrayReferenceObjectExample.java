package ch05.sec08;
/**
 * @author JiYoon Yang
 */
/*
장제목: 5장 참조타입 > 기본문제
작성일: 2025.04.16
*/
public class ArrayReferenceObjectExample {
    public static void main(String[] args) {
        String[] strArray = new String[3]; // strArray는 문자열 요소 3개를 가지는 문자열 배열이다.
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");
        System.out.println( strArray[0] == strArray[1] ); // true -- 참조가 같으므로,
        System.out.println( strArray[0] == strArray[2] ); // false -- 참조가 다르므로,
        System.out.println( strArray[0].equals(strArray[2]) ); // true -- 순수하게 값이 같으므로,
    }
}