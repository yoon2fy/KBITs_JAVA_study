package ch05.sec05;
/**
 * @author JiYoon Yang
 */
/*
장제목: 5장 참조타입 > 기본문제
작성일: 2025.04.16
*/
public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if (strVar1 == strVar2) { // == 으로 두 변수 비교
            System.out.println("strVar1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }
        if (strVar1.equals(strVar2)) { // 내용으로 두 변수 비교
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        } 

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");
        
        if (strVar3 == strVar4) { // == 으로 두 변수 비교
            System.out.println("strVar3 strVar4 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar4는 참조가 다름");
        }
        if (strVar3.equals(strVar4)) { // 내용으로 두 변수 비교
            System.out.println("strVar3과 strVar4는 문자열이 같음");
        }
    }
}
