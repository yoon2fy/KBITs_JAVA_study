package ch14.sec03.exam01;

public class PrintThread2 extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("실행 중");
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
        }
        System.out.println("리소스 정리");
        System.out.println("실행 중");
    }
}
