package Basic;
/*
SmartPhoneExample클래스로 SmartPhone 의 인스턴스를 생성하여 초기화가 올바른지 확인하세요
 */

public class SmartPhoneExample {

    public static void main(String[] args) {
        // SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
        
        // Phone으로부터 상속받은 필드 읽기
        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);
    }
}
