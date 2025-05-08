package Basic;
/*
다음 클래스 내부에 ClickListener 인터페이스를 정의하세요.
○ 인터페이스의 메서드는 void onClick() 하나 추가
 */
public class Button {
    //정적 멤버 인터페이스
    public static interface ClickListener {
        //추상 메소드
        void onClick();
    }
}