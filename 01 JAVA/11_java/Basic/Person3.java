package basic;

public class Person3 {
    public void action(Calculable3 calculable) {
        double result = calculable.calc(10, 4);
        System.out.println("결과: " + result);
    }
}
