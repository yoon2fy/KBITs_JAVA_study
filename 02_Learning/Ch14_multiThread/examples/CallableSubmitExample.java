package ch14.sec03.exam01;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSubmitExample {
    public static void main(String[] args) {
        // ExecutorService 생성
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // 계산 작업 생성 및 처리 요청
        for (int i = 0; i < 100; i++) {
            final int idx = i;
            Future<Integer> future = executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int sum = 0;
                    for (int i = 0; i <= idx ; i++) {
                        sum += i;
                    }
                    Thread thread = Thread.currentThread();
                    System.out.println("[" + thread.getName() + "] 1~" + idx + " 합 계산");
                    return sum;
                }
            });
            try {
                int result = future.get();
                System.out.println("\t리턴값: " + result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // ExecutorService 종료
        executorService.shutdown();
    }
}