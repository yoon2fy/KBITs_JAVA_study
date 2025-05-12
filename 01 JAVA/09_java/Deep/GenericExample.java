package Deep;
// 앞에서 정의한 Box 클래스를 이용하여 , 제너릭 메서드 boxing() 을 추가하세요
public class GenericExample {
    // 제네릭 메소드
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        // 제네릭 메소드 호출
        Box<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);

        // 제네릭 메소드 호출
        Box<String> box2 = boxing("홍길동");
        String stringValue = box2.get();
        System.out.println(stringValue);
    }
}
