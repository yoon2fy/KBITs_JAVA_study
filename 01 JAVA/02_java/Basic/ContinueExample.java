package ch04.sec08;
/**
 * @author JiYoon Yang
 */
/*
장제목: 4장 조건문과 반복문 > 기본문제
작성일: 2025.04.16
*/
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i%2 != 0){ // 2로 나눈 나머지가 0이 아닐 경우(홀수인 경우)
                continue;
            }
            System.out.print(i + " ");
        }
    }
}

/*
i=0에서, 0/2 = 0...0이므로, false이다. 그리고  i=0이 저장되며 다음 반복으로 넘어간다.
i=1에서, 1/2 = 0...1이므로, true이다. 따라서 continue문을 실행해서 그 이후의 문장을 실행하지 않고 다음 반복으로 넘어간다.
i=2에서, 2/2 = 1...0이므로, false이다. 그리고  i=2이 저장되며 다음 반복으로 넘어간다.
i=3에서, 1/2 = 1...1이므로, true이다. 따라서 continue문을 실행해서 그 이후의 문장을 실행하지 않고 다음 반복으로 넘어간다.

*/