package ch03.sec10;
/**
 * @author JiYoon Yang
 */
/*
장제목: 3장 연산자
작성일: 2025.04.15
*/
public class AssignmentOperatorExample {
    public static void main(String[] args) {
        int result = 0;
        result += 10; // result = 0+10 = 10
        System.out.println("result=" + result); // result=10

        result -= 5; // result = 10-5 = 5
        System.out.println("result=" + result); // result=5

        result *= 3; // result = 5*3 = 15
        System.out.println("result=" + result); // result=15

        result /= 5; // result = 15/5 = 3
        System.out.println("result=" + result); // result=3

        result %= 3; // result = 3/3 = 1 ... 0
        System.out.println("result=" + result); // result=0
    }
}


