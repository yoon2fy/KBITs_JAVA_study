package Deep;

public class InputTest {
    public static void main(String[] args) {
        String name = Input.read("이름: ");
        System.out.println("입력값: " + name);

        String name2 = Input.read("이름", "홍길동");
        System.out.println("입력값: " + name2);

        int age = Input.readInt("나이: ");
        System.out.println("입력값: " + age);

        boolean answer = Input.confirm("종료할까요?");
        System.out.println("입력값: " + answer);

        boolean answer2 = Input.confirm("종료할까요?", true);
        System.out.println("입력값: " + answer2);
    }
}
