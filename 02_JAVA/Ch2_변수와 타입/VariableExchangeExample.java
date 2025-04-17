package ch02.sec01;
/**
 * @author JiYoon Yang
 */
/*
장제목: Ch02.변수와 타입
작성일: 2025.04.17
*/
public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x:"+x+", y:"+y); // x:3, y:5

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x:"+x+", y:"+y); // x:5, y:3
    }
}
/*
두 변수의 값을 교환하기 위해 temp 변수를 매개변수로 둔다. temp에 x값을 주고, x는 y값을 받는다. 그리고 y에 temp를 두어, 최초의 x의 값을 y에 준다. 이를 통해 x와 y의 값이 교환된 것이다.
 */