package ch02.sec02;
/**
 * @author JiYoon Yang
 */
/*
장제목: Ch02.변수와 타입
작성일: 2025.04.17
*/
public class LongExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20l;
//        long var3 = 1000000000000;
        long var4 = 10000000000000l;

        System.out.println(var1); // 10
        System.out.println(var2); // 20
        System.out.println(var4); //1000000000000
    }
}
/*
기본적으로 컴파일러는 정수 리터럴 int 타입 값으로 간주하기 때문에 l/L을 붙여서 long타입임을 컴파일러에게 알려 줘야 한다.
 */