package ch14.sec03.exam01;
import java.awt.Toolkit;
public class BeepPrintExample2 {
    public static void main(String[] args) {
// --------------- 작업 스레드 생성 ----------------------------------------
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {Thread.sleep(500);} catch (Exception e) {}
                }
            }
        });
// -----------------------------------------------------------------------
        thread.start(); // 작업 스레드 실행
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {Thread.sleep(500);} catch (Exception e) {}
        }
    }
}
