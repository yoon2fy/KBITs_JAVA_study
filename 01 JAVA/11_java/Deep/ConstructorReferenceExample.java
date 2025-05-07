package deep;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Person2 person = new Person2();

        Member m1 = person.getMember1(Member :: new);
        System.out.println(m1);
        System.out.println();

        Member m2 = person.getMember2(Member :: new);
        System.out.println(m2);
    }
}
