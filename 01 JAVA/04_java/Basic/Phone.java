package Basic;
/*
다음의 Phone 클래스를 상속한 SmartPhone 클래스를 정의하세요.
○ model, color는 SmartPhone 클래스의 생성자 매개변수로 초기화 함
 */
public class Phone {
    // 필드 선언
    public String model;
    public String color;

    // 매개변수를 갖는 생성자 선언
    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone(String model, String color) 생성자 실행");
    }
}
