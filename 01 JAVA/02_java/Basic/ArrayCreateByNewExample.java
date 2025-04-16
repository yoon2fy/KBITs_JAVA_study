package ch05.sec06;
/**
 * @author JiYoon Yang
 */
/*
장제목: 5장 참조타입 > 기본문제
[문제] 다음 조건을 처리하는 프로그램을 작성하세요.
o 정수 요소 3개를 가지는 정수 배열 arr1을 선언 및 생성하고 (초기화하지 않음),
  그 arr1 배열의 내용을 출력
o 문자열 요소 3개를 가지는 문자열 배열 arr2를 선언 및 생성하고 (초기화하지 않음),
  그 arr2 배열의 내용을 출력

작성일: 2025.04.16
*/
public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        double[] arr1 = new double[3]; // 정수 요소 3개를 가지는 정수배열 arr1을 선언 및 생성하고, 초기화하지 않음.
        for(int i=0; i<arr1.length; i++) {
            System.out.print("arr1[" + i + "] = " + arr1[i] + ", "); // 그 arr1 배열의 내용을 출력
        }
        System.out.println();

        // arr1 배열 항목의 값을 변경함.
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        for(int i=0; i<arr1.length; i++) {
            System.out.print("arr1[" + i + "] = " + arr1[i] + ", "); // 그 arr1 배열의 내용을 출력
        }
        System.out.println("\n");

        String[] arr2 = new String[3]; // 문자열 요소 3개를 가지는 문자열 배열 arr2을 선언 및 생성하고, 초기화하지 않음.
        for(int i=0; i<arr2.length; i++) {
            System.out.print("arr2[" + i + "] = " + arr2[i] + ", ");
        }
        System.out.println();

        // arr2 문자열 항목의 값을 변경함.
        arr2[0] = "1월";
        arr2[1] = "2월";
        arr2[2] = "3월";

        for(int i=0; i<arr2.length; i++) {
            System.out.print("arr2[" + i + "] = " + arr2[i] + ", "); // 그 arr2 배열의 내용을 출력
        }
    }
}
