package basic;
/*
다음 인터페이스를 함수형 인터페이스로 명시하세요.
 */

@FunctionalInterface
public interface Calculable {
    // 추상 메소드
    void calculate(int x, int y);
}
