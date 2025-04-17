package ch06.sec07.exam02;
/**
 * @author JiYoon Yang
 */
/*
장제목: 6장 클래스 > 기본문제
[문제] 다음과 같이 출력되도록 앞에서 만든 Korean의 인스턴스를 2개 만들어 운영하세요.
작성일: 2025.04.17
*/
public class KoreanExample {
    public static void main(String[] args) {
        // Korean 객체를 생성함.
        Korean k1 = new Korean("박자바 ", "011225-1234567");

        // Korean 객체를 읽기
        System.out.println("k1.nation : " + k1.nation);
        System.out.println("k1.name : " + k1.name);
        System.out.println("k1.ssn : " + k1.ssn);
        System.out.println();

        // 또 다른 Korean 객체를 생성함.
        Korean k2 = new Korean("김자바", "930525-0654321");
        System.out.println("k2.nation : " + k2.nation);
        System.out.println("k2.name : " + k2.name);
        System.out.println("k2.ssn : " + k2.ssn);
    }

}
/*
k1.nation : 대한민국
k1.name : 박자바
k1.ssn : 011225-1234567

k2.nation : 대한민국
k2.name : 김자바
k2.ssn : 930525-0654321
 */
