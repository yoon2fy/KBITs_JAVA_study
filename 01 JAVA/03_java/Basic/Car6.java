package Basic;
/*
다음 조건을 만족하는 Car 클래스를 완성하세요
    ○ model 필드는 생성자로 초기화
    ○ speed 필드의 getter/setter 메서드 정의
    ○ run() 메서드 호출 시 다음과 같이 출력
         xxx(model 값 가 달립니다 시속 : yyy(speed 값 )km/
 */
public class Car6 {
    //필드 선언
    String model;
    int speed;

    //생성자 선언
    Car6(String model) {
        this.model = model;
    }

    //메소드 선언
    void setSpeed (int speed) {
        this.speed = speed;
    }

    void run() {
        this.setSpeed(100);
        System.out.println(this.model + "가 달립니다.(시속: " + this.speed + "km/h)");
    }
}
