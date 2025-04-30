package Basic;

public class Car3 {
    //필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //생성자 선언
    Car3() {}

    Car3(String model) {
        this.model
                = model;
    }
    Car3(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car3(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
