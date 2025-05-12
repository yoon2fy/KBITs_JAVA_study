package Basic;
/*
다음 조건을 만족하는 Member 클래스를 정의하세요
    ○ Lombok 을 이용하여 정의함
    ○ 기본 생성자 , 전체 필드를 초기화하는 생성자 ,
    ○ Getter/Setter 메서드
    ○ equals(), hashCode(), toString() 메서드
    ○ 위의 메서드들이 제대로 생성되었는지 IntelliJ 의 Structure 기능으로 확인하세요
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    private String id;
    private String name;
    private int age;
}
