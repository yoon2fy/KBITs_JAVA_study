package ch14.sec03.exam01;

public class WorkThread extends Thread {
    //필드
    public boolean work = true;
    
    //생성자
    public WorkThread(String name) {
        setName(name);
    }
    
    //메소드

    @Override
    public void run() {
        while (true){
            if(work){
                System.out.println(getName() + ": 작업처리");
            } else {
                Thread.yield();
            }
        }
    }
}
