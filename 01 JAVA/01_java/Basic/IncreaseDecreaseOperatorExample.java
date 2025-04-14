package ch03.sec01;
/**
 * @author JiYoon Yang
 */
/*
장제목: 3장 연산자
작성일: 2025.04.14
*/
public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10; // x = 10
        int y = 10; // y = 10
        int z;  // z의 변수만 등록한다.
        x++;
        ++x;
        System.out.println("x=" + x); // x = 12
        System.out.println("-----------------------");

        y--;
        --y;
        System.out.println("y=" + y); // y = 8
        System.out.println("-----------------------");

        z = x++;
        System.out.println("z=" + z); // z = 12
        System.out.println("x=" + x); // x = 13
        System.out.println("-----------------------");

        z = ++x;
        System.out.println("z=" + z); // z = 14
        System.out.println("x=" + x); // x = 14
        System.out.println("-----------------------");

        z = ++x + y++;
        System.out.println("z=" + z); // z = 23
        System.out.println("x=" + x); // x = 15
        System.out.println("y=" + y); // y = 9
    }
}