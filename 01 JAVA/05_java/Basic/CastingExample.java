package Basic;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();

        Bus bus = (Bus) vehicle; // 강제 타입 변환 후 호출
        bus.run();
        bus.checkFare();
    }
}
