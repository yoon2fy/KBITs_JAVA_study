package Generic;

public class GenericExample3 {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car2 car2 = carAgency.rent();
        car2.run();
    }
}