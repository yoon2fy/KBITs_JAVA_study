package Basic;
/*
1 부터 1000000 까지의 합을 구하는 프로그램을 작성하고 , 계산결과와 계산에 소요된 시간을 nano 초 단위로 출력하세요
 */
public class MeasureRunTimeExample {
    public static void main(String[] args) {
        long time1 = System.nanoTime();
        int sum = 0;
        for (int i = 1; i <=1000000 ; i++) {
            sum += i;
        }
        long time2 = System.nanoTime();

        System.out.println("1~1000000까지의 합: " + sum);
        System.out.println("계산에 " + (time2 - time1) + " 나노초가 소요되었습니다.");
    }
}
