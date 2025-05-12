package Deep;
/*
다음 순서로 Account 클래스를 운영하세요.
    o 10,000원 인출
    o 5,000원 인출
    o 7,000원 인출
*/
public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        // 예금하기
        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance());

        // 출금하기
        try {
            account.withdraw(5000);
            account.withdraw(7000);
        } catch (InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
