package ch06.sec07.exam02;
/**
 * @author JiYoon Yang
 */
/*
장제목: 6장 클래스 > 기본문제
[문제] 다음 Korean 클래스에 생성자의 매개변수로 name, ssn 필드를 초기화하는 생성자를 정의하세요.
작성일: 2025.04.17
*/
public class Korean {
    // 필드 선언
    String nation = "대한민국";
    String name;
    String ssn;

    // 생성자 선언
    public Korean(String n, String s) {
        name = n;
        ssn = s;
    }
}
