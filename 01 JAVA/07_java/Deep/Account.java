package Deep;
/*
계좌 클래스의 기본 코드이다. withdraw() 메서드를 완성하세요.
    o 인출 금액(money)가 잔액보다 크면 InsufficientException 예외 발생
    o 인출 금액(money)가 잔액보다 작으면 잔액에서 차감
 */
public class Account {
    private long balance;

    public Account() { }
    public long getBalance() {
        return balance;
    }
    public void deposit(int money) {
        balance += money;
    }
    public void withdraw(int money) throws InsufficientException {
        if(balance < money) {
            throw new InsufficientException("잔고 부족: " + (money - balance) + " 모자람");
        }
        balance -= money;
    }
}
