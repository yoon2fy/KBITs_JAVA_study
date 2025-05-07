package Basic;

public class SupersonicAirplane extends Airplane {
    // 상수 선언
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    // 상태 필드 선언
    public int flyMode = NORMAL;

    // 메소드 재정의
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속 비행합니다.");
        } else {
            super.fly();
        }
    }
}
