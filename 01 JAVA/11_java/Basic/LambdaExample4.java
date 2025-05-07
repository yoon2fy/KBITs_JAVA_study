package basic;

public class LambdaExample4 {
    public static void main(String[] args) {
        Person3 person = new Person3();

        // 실행문이 두 개 이상일 경우
        person.action((x, y) -> {
            double result = x + y;
            return result;
        });

        // sum() 메서드를 호출
        person.action((x, y) -> (x + y));
    }

    public static double sum(double x, double y) {
        return (x + y);
    }
}
