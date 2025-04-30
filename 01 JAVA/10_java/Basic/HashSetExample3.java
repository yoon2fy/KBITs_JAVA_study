package Collection;
import java.util.*;
public class HashSetExample3 {
    public static void main(String[] args) {

        //HashSet 컬렉션 생성
        Set<String> set = new HashSet<String>();

        //객체 추가
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        // Iterator 패턴으로 순회하며 각 요소를 출력하세요.
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("element1: " + element);
            if(element.equals("JSP")) {
                iterator.remove();
            }
        }
        System.out.println();

        set.remove("JDBC");

        // 향상된 for 문으로 순회하며 각 요소를 출력하세요.
        for (String element : set) {
            System.out.println("element2: " +element);
        }
    }
}
/*
element1: Java
element1: JSP
element1: JDBC
element1: Spring

element2: Java
element2: Spring
 */