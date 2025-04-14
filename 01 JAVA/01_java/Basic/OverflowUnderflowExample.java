package ch03.sec03;
/**
 * @author JiYoon Yang
 */
/*
장제목: 3장 연산자
작성일: 2025.04.14
*/
public class OverflowUnderflowExample {
    public static void main(String[] args) {
        byte var1 = 125;
        for (int i = 0; i < 5; i++) {
            var1++;
            System.out.println("var1: " + var1);
            // byte는 1바이트 정수이고, 표현할 수 있는 값의 범위는 -128 =< byte =< 127이다.
            // i=0; 126          -- 정상 범위임
            // i=1; 126+1 =  127 -- byte의 최대값임
            // i=2; 127+1 = -128 -- 오버플로우 발생!
            // i=3;-128+1 = -127 -- 정상 범위임.
            // i=4;-127+1 = -126
        }
        System.out.println("-----------------------");
        byte var2 = -125;
        for (int i = 0; i < 5; i++) {
            var2--;
            System.out.println("var2: " + var2);
            // i=0; -125
            // i=1; -125-1 = -126
            // i=2; -126-1 = -127 -- 정상 범위임.
            // i=3; -127-1 = -128 -- byte의 최소값임
            // i=4; -128-1 =  127 -- 오버플로우 발생!
            // i=5;  127-1 =  126 -- 정상 범위임.
        }
    }
}
