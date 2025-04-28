package ch14.sec03.exam01;

public class PrintThread extends Thread {
    private boolean stop;
    
    public void setStop(boolean stop) { // 외부에서 stop 필드값을 변경할 수 있도록 Setter 선언
        this.stop = stop;
    }

    @Override
    public void run() {
        while (!stop) { // stop 필드값에 따라 반복여부 결정
            System.out.println("실행 중");
        }
        System.out.println("리소스 정리");// 리소스 정리
        System.out.println("실행 종료");
    }
}
