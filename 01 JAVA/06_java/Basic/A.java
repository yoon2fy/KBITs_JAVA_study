package Basic;

public class A {
    static class B {} // static 멤버 클래스
    B field1 = new B(); // 인스턴스 필드 값으로 B 객체 대입
    static B field2 = new B(); // 정적 필드 값으로 B 객체 대입

    // 생성자
    A (){
        B b = new B();
    }
    // 인스턴스 메소드
    void method1(){
        B b = new B();
    }
    // 정적 메소드
    static void method2(){
        B b = new B();
    }
}
