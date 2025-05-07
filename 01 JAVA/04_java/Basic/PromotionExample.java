package Basic;

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        // 자동 타입 변환(상속 관계 O)
        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

        /* 컴파일 에러(상속 관계 X)
        B b3 = e;
        C c2 = d;
         */
    }
}
