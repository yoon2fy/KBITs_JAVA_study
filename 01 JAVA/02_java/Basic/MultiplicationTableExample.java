package ch04.sec04;
/**
 * @author JiYoon Yang
 */
/*
장제목: 4장 조건문과 반복문 > 기본문제
작성일: 2025.04.15
*/
public class MultiplicationTableExample {
    public static void main(String[] args) {
        for (int m = 2; m <= 9; m++) {
            System.out.println("*** " + m + "단 ***");

            for (int n = 1; n <= 9; n++) {
                System.out.println(m + "x" + n + "=" + m*n);
            }
        }
    }
}


/*
내가 틀린 이유
: println대신 print로 값들을 출력했음. 따라서 행이 바뀌지 않은 채로 값이 출력을 했기 때문임.

콘솔로 변수값 출력 (p. 69)
println(): 괄호 안의 내용을 출력하고 행을 바꿔라.
print(): 괄호 안의 내용을 출력하고 행은 바꾸지 말아라.
printf("형식문자열", 값1, 값2, ...): 형식 문자열에 맞추어 뒤의 값을 출력해라.
* */