package ch02.sec11;
/**
 * @author JiYoon Yang
 */
/*
장제목: Ch02.변수와 타입
작성일: 2025.04.17
*/
public class VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        if (v1 > 10) {
            int v2 = v1 - 10;
        }
//        int v3 = v1 + v2 + 5; // v2 변수를 사용할 수 없기 때문에 컴파일 에러가 발생함. -- 왜냐하면 v2 변수의 사용 범위는 if (){}이기 때문임.
    }
}
