package Generic;

public class HomeAgency implements Rentable<Home> { // 타입 파라미터 P를 Home으로 대체
    @Override
    public Home rent() { // 리턴 타입이 반드시 Home이여야만 함
        return new Home();
    }
}