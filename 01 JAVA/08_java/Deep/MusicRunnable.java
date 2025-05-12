package Deep;
/*
0.5초 간격으로 "음악을 재생합니다."를 6회 출력하는 MusicRunnable 클래스를 정의하세요.
    ○ Runnable 인터페이스 구현으로 정의하세요.
 */
public class MusicRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("음악을 재생합니다.");
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}
