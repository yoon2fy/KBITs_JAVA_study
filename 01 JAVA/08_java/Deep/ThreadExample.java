package Deep;
// 앞에서 정의한 두 클래스를 스레드로 동시에 운영하는 코드를 작성하세요.
public class ThreadExample {
    public static void main(String[] args) {

        Thread thread1 = new MovieThread();
        thread1.start();

        Thread thread2 = new Thread(new MusicRunnable());
        thread2.start();
    }
}
