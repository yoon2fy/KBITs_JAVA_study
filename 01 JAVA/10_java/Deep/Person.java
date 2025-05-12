package Deep;
/*
Person 클래스를 Comparable 인터페이스 구현 객체로 정의하ㅔ쇼.
    o 전체 매개변수 생성자 추가
    o age 순으로 크기를 비교함
 */
public class Person implements Comparable<Person> {
    public String name;
    public int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo (Person o) {
        if(age<o.age ) return -1;
        else if(age == o.age ) return 0;
        else return 1;
    }
}
