package Generic;

public class GenericExample4 {
    public static void main(String[] args) {
        Box2<String> box1 = new Box2<>();
        box1.content = "100";

        Box2<String> box2 = new Box2<>();
        box2.content = "100";

        boolean result1 = box1.compare(box2);
        System.out.println("result1: " + result1);
    }
}