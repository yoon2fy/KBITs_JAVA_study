package Basic;

public class ChildExample2 {
    public static void main(String[] args) {
        // 객체 생성 및 자동 타입 변환
        Parent2 parent = new Child2();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        /*
        parent.field2 = "data2"; // 불가능
        parent.method3();        // 불가능
         */

        // 강제 타입 변환
        Child2 child = new Child2();

        child.field2 = "data2";
        child.method3();
    }
}
