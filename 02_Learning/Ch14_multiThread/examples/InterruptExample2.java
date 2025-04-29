package ch14.sec03.exam01;

public class InterruptExample2 {
    public static void main(String[] args) {
        Thread thread = new PrintThread3();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        thread.interrupt(); // interrupt()메소드 호출
    }
}