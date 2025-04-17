package ch06.sec06.exam01;
/**
 * @author JiYoon Yang
 */
/*
장제목: 6장 클래스 > 기본문제
작성일: 2025.04.17
*/
public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println("모델명 : " + myCar.model);
        System.out.println("시동여부 : " + myCar.start);
        System.out.println("현재속도 : " + myCar.speed);
    }
}
/*
모델명 : null
시동여부 : false
현재속도 : 0
 */
