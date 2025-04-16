package ch05.sec04;
/**
 * @author JiYoon Yang
 */
/*
장제목: 5장 참조타입 > 기본문제
작성일: 2025.04.16
*/
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
        intArray[0] = 10; // (i)

        String str = null;
        System.out.println("총 문자 수: " + str.length()); // (ii)
    }
}
/*
(i) 배열이 null인데 접근을 시도해서 그렇다. --> Null Pointer Exception.
- intArray는 배열이 아니라 null임. 즉, 주소가 없다.
- 그런데, #12에서 intArray[0]=10;을 하려고 하니, 주소가 없어서 예외가 발생한다.

[해결방법]
- 배열에 메모리를 할당해준다.
#11을 수정한다.
> int[] intArray = new int[5] // 크기 5의 배열을 새로 생성하자.


(ii) 문자열이 null인데 접근을 시도해서 그렇다. --> Null Pointer Exception.
- str은 문자열이 아니라 null 이다. 즉, 주소가 없다.
- 그런데, #15에서 .length()를 호출하려고 하니, 주소가 없어서 예외가 발생한다.

[해결방법]
- 문자열을 초기화 하기
> String str = "양지윤 최고~~~";
*/