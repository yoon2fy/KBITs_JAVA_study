package ch05.sec03;
/**
 * @author JiYoon Yang
 */
/*
장제목: 5장 참조타입 > 기본문제
작성일: 2025.04.16
*/
public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3; // 배열 변수를 선언함.

        arr1 = new int[]{1,2,3};
        arr2 = new int[]{1,2,3};
        arr3 = arr2;

        System.out.println(arr1 == arr2); // false; arr1과 arr2가 같은 배열을 참조하지 않기 때문임.
        System.out.println(arr2 == arr3); // true; arr2와 arr3이 같은 배열을 참조하기 때문.
    }
}