package Basic;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        // 부모 클래스를 실행 해 보았을 때
        Calculator calculator = new Calculator();
        System.out.println("원 면적: " + calculator.areaCircle(r));
        System.out.println();

        // 자식 클래스를 실행 해 보았을 때 -- 조금 더 자세하게 계산함.
        Computer computer = new Computer();
        System.out.println("원 면적: " + computer.areaCircle(r));
    }
}
