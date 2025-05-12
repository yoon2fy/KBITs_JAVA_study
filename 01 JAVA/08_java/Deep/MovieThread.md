package Deep;
/*
1초 간격으로 "동영상을 재생합니다,"를 3회 출력하는 스레드 클래스를 정의하세요.
 */
public class MovieThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("동영상을 재생합니다.");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}
