package ch05.sec09;
/**
 * @author JiYoon Yang
 */
/*
장제목: 5장 참조타입 > 기본문제
[문제] oldIntArray를 newIntArray 배열(요소가 5개임)로 복사하세요.
(i) System.arraycopy를 이용해 복사함
(ii) for 문을 이용해서 다음과 같이 각 요소를 출력함
작성일: 2025.04.16
*/
public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArray = {"java", "array", "copy"};

        String[] newStrArray = new String[5]; // 요소가 5개인 배열을 만들었다.
        for(int i = 0; i < oldStrArray.length; i++) {
            newStrArray[i] = oldStrArray[i]; // (i) System.arraycopy를 이용해 복사함
        }
        for(int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", "); // (ii) for 문을 이용해서 다음과 같이 각 요소를 출력함
        }
    }
}
