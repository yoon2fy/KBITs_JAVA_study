package Basic;

import java.util.Arrays;
import java.util.List;

/*
스트림을 이용하여 다음과 같이 출력되도록 코드를 완성하세요
○ 스트림 처리시 메서드 체인닝을 사용함
 */
public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
                );
        double avg = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();
        System.out.println("평균 점수: " + avg);
    }
}
