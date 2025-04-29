package Generic;

public interface Rentable<P> { // 타입 파라미터 P를 정의
    P rent(); // 타입 파라미터 P를 리턴 타입으로 사용
}
