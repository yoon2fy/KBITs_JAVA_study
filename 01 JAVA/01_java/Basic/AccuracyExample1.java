package ch03.sec04;
/**
 * @author JiYoon Yang
 */
/*
장제목: 3장 연산자
작성일: 2025.04.15
*/
public class AccuracyExample1 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;
        double result = apple - number*pieceUnit;
        System.out.println("사과 1개에서 남은 양: " + result);
    }
}
/* result = 1-7*0.1=1-0.7=0.3 으로 예상
하지만, 출력 결과는 0.29999999999999993임.

이유) 부동소수점은 2진수로 표현된다.
- 컴퓨터는 모든 수를 이진수(2진법)로 저장한다.
- 그러므로, 0.1, 0.7 같은 십진수는 이진수로 정확하게 표현되지 않는다.
- 따라서, 정확히 0.1로 저장이 되지 않기 때문에 아주 근소한 오차가 발생한다.
- double이나 float로 소수를 계산할 때는 항상 오차 가능성을 염두해야한다.

금융, 과학 계산 등 정밀도가 중요한 경우는 정밀 수학 라이브러리 사용을 권장한다.
- 정밀도가 중요한 계산 (예: 금융, 물리학 계산 등)은 double 또는 BigDecimal을 사용한다.
- double은 메모리는 더 쓰지만 정밀도와 안정성이 높아 자주 사용됨
- 메모리 사용이 민감하고 정밀도보다는 속도가 더 중요할 경우에 한해 float을 고려할 수 있음.
*/