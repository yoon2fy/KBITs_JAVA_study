package Basic;
/*
스트림을 이용하여 다음과 같이 출력하는 코드를 완성하세요
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("홍길동");
        set.add("신용권");
        set.add("감자바");

        Stream<String> stream = set.stream(); // 스트림 얻기
        stream.forEach(name -> System.out.println(name)); // 람다식: 요소 처리 방법
    }
}
