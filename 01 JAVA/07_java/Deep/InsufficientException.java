package Deep;
// 계좌 클래스를 정의하고자 한다 . 잔액이 부족할 때 발생할 사용자 정의 예외를 정의하세요
public class InsufficientException extends Exception {
    public InsufficientException (){
    }

    public InsufficientException (String message) {
        super(message);
    }
}
