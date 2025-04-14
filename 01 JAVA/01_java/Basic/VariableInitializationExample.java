package ch02.sec10;
/**
 * @author JiYoon Yang
 */
/*
장제목: 2장 변수와 타입
작성일: 2025.04.14
*/
/** 문제) 다음 코드의 문제점을 찾아 설명해보시오
 * 답변)
 * java: variable value might not have been initialized
 * 이는 변수가 초기화 되지 않았다는 오류다. 변수를 선언하면, 메모리상의 어떠한 공간을 차지하게 되고 사용하게 된다. 그런데, 그 공간에 기존에 어떠한 값이 있었는지는 아무도 모른다. 그러므로 변수를 초기화 하지 않으면 이상한 값이 출력될 수 있다.
 * 따라서, Java는 이러한 문제를 예방하기 위해 강제로 변수를 초기화 한다.
 * 결론적으로 위 오류는 변수가 초기화 되지 않았다는 오류이다.
 *
 *
 */
public class VariableInitializationExample {
    public static void main(String[] args) {
        //        int value; // 기존의 코드
        int value = 0; // 문제점을 고친 코드
        int result = value + 10;
        System.out.println(result);
    }
}
