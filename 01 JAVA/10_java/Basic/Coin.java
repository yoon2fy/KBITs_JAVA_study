package Collection;
/*
롬복을 이용하여 다음 클래스를 완성하세요.
    ○ 전체 매개변수 생성자
    ○ value에 대한 Getter
 */
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Coin {
    private int value;
}