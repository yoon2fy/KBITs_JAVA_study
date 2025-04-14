package ch02.sec06;
/**
 * @author JiYoon Yang
 */
/*
장제목: 2장 변수와 타입
작성일: 2025.04.14
*/
public class StringExample {
    public static void main(String[] args) {
        String name = "홍길동";
        String job = "프로그래머";
        String text_1 = "나는";
        String text_2 = "자바를";
        String text_3 = "배웁니다.";
        String text_4 = "번호";
        String text_5 = "이름";
        String text_6 = "직업";

        System.out.println(name);
        System.out.println(job);
        System.out.println(text_1 + " '" + text_2 + "' " + text_3);
        System.out.println(text_4 +"    "+ text_5+"    "+ text_6);
        System.out.println(text_1);
        System.out.println(text_2);
        System.out.println(text_3);

    }
}
