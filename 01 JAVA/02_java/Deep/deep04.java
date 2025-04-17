package deep;
/**
 * @author JiYoon Yang
 */
/*
장제목: 4장 조건문과 반복문 > 심화문제
[문제] 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서
(x, y)형태로 출력하는 코드를 작성하세요.(단, x와 y는 10이하의 자연수입니다.)
작성일: 2025.04.16
*/
public class deep04 {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) { // (i) 중첩 for문을 이용하기
                if (4 * x + 5 * y == 60) { // (ii) 방정식을 만족하는 x와, y가 있다면,
                    System.out.println("(" + x + ", " + y + ")"); // (ii) 모든 해를 구해서 출력하시오.
                }
            }
        }
    }
}