package Generic;

public class GenericExample5 {
    // 제네릭 메소드
    public static <T> Box3<T> boxing(T t){
        Box3<T> box = new Box3<>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        // 제네릭 메소드 호출
        Box3<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);
        
        // 제네릭 메소드 호출
        Box3<String> box2 = boxing("홍길동");
        String strValue = box2.get();
        System.out.println(strValue);
    }
}