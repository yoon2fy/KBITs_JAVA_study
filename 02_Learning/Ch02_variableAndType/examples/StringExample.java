package ch02.sec06;
/**
 * @author JiYoon Yang
 */
/*
장제목: Ch02.변수와 타입
작성일: 2025.04.17
*/
public class StringExample {
    public static void main(String[] args) {
        String name = "홍길동";
        String job = "프로그래머";
        System.out.println(name); // 홍길동
        System.out.println(job); // 프로그래머
        System.out.println();

        String str = "나는 \"자바\"를 배웁니다.";
        System.out.println(str); // 나는 "자바"를 배웁니다.
        System.out.println();

        str = "번호\t이름\t직업";
        System.out.println(str); // 번호	이름	직업
        System.out.println();
        System.out.print("나는\n"); // 나는
        System.out.print("자바를\n"); // 자바를
        System.out.print("배웁니다."); // 배웁니다.
    }
}
