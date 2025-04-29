package ch14.sec03.exam01;

public class PrintThread3 extends Thread {
    public void run() {
            while (true) {
                System.out.println("실행 중");
                if (Thread.interrupted()) { // interrupt() 메소드가 호출되었다면 while문을 빠져나감
                    break;
                }
            }
            System.out.println("리소스 정리");
            System.out.println("실행 중");
        }
    }