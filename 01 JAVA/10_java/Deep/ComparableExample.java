package Deep;
/*
ArrayList에 다음 데이터를 추가하고 , 정렬한 후 , 순서대로 출력하세요
    o 데이터
         홍길동 , 35
         감자바 25
         박지원 , 31
 */
import java.util.TreeSet;

public class ComparableExample{
    public static void main(String[] args) {
        // TreeSet 컬렉션 생성
        TreeSet<Person> treeSet = new TreeSet <Person>();

        // 객체 저장
        treeSet.add(new Person("홍길동", 35);
        treeSet.add(new Person("감자바", 25);
        treeSet.add(new Person("박지원", 31);

        // 객체를 하나씩 가져오기

        for(Person person : treeSet ) {
            System.out.println(person.name + ":" + person.age);
        }
    }
}