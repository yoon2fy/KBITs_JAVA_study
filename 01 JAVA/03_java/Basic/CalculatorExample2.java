package Basic;

public class CalculatorExample2 {
    public static void main(String[] args) {
        //객체 생성
        Calculator2 myCalcu = new Calculator2();

        //정사각형의 넓이 구하기
        double result1 = myCalcu.areaRectangle(10);

        //직사각형의 넓이 구하기
        double result2 = myCalcu.areaRectangle(10, 20);
        System.out.println("정사각형 넓이= " +result1);
        System.out.println("직사각형 넓이= " +result2);
    }
}
