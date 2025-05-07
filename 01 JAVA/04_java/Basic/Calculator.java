package Basic;
/*
Calculator를 상속한 Computer 클래스를 정의하고 , areaCircle () 메서드를 재정의하세요
○ Computer 클래스의 areaCircle 은 Math.PI 상수를 이용해 계산함
 */

public class Calculator {
    //메소드 선언
    public double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return 3.14159 * r * r;
    }
}
