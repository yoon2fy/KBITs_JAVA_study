package ch05.sec09;
/**
 * @author JiYoon Yang
 */
/*
장제목: 5장 참조타입 > 기본문제
[문제] oldIntArray를 newIntArray 배열(요소가 5개임)로 복사하세요.
(i) for 문을 이용해서 복사함
(ii) for 문을 이용해서 다음과 같이 각 요소를 출력함
작성일: 2025.04.16
*/
public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int [] oldIntArray = {1,2,3};

        int [] newIntArray = new int[5]; // 요소가 5개인 배열을 만들었다.
        for(int i = 0; i < oldIntArray.length; i++) { // (i) for 문을 이용해서 복사함
            newIntArray[i] = oldIntArray[i];
        }
        for(int i = 0; i < newIntArray.length; i++) { // (ii) for 문을 이용해서 다음과 같이 각 요소를 출력함
            System.out.print(newIntArray[i] + ", ");
        }
    }
}