package ch06.sec07.exam01;
/**
 * @author JiYoon Yang
 */
/*
장제목: 6장 클래스 > 기본문제
[문제] 다음과 같이 클래스가 주어졌을 때, Car 클래스의 멤버 변수와 생성자를 정의하세요.
작성일: 2025.04.17
*/
public class Car {
    // [1] 변수 선언
    String model;
    String color;
    int maxSpeed;

    // [2] 생성자 선언
    Car(String m, String c, int s){
        model = m;
        color = c;
        maxSpeed = s;
    }
}
