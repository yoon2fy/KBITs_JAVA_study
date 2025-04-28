package ch14.sec03.exam01;

public class Calculator {
    private int memory;

    public int getMemory(){
        return memory;
    }
// --- 동기화 메소드 -------------------------------------------------------------------
    public synchronized void setMemory1(int memory){
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
    }

    public void setMemory2(int memory){
// --- 동기화 블록 ----------------------------------------------------------------------
        synchronized (this){
            this.memory = memory;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
            System.out.println(Thread.currentThread().getName() + ": " + this.memory);
        }
    }
}
