package Deep;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi1 taxi = new Taxi1();
        Bus1 bus = new Bus1();

        ride(taxi);
        System.out.println();
        ride(bus);
    }
    // 인터페이스 매개변수를 갖는 메소드
    public static void ride(Vehicle1 vehicle) {
        if(vehicle instanceof Bus1 bus) {
            bus.checkFare();
        }
        vehicle.run();
    }
}
