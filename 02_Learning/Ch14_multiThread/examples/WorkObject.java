package ch14.sec03.exam01;

public class WorkObject {
    public synchronized void methodA(){ //동기화 메소드
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": methodA 작업 실행");
        notify(); // 다른 스레드를 실행 대기 상태로 만듦
        try {
            wait(); // 자신의 스레드는 일시 정지로 만듦
        } catch (InterruptedException e) {
        }
    }

    public synchronized void methodB(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": methodB 작업 실행");
        notify(); // 다른 스레드를 실행 대기 상태로 만듦
        try {
            wait(); // 자신의 스레드는 일시 정지로 만듦
        } catch (InterruptedException e) {
        }
    }
}
