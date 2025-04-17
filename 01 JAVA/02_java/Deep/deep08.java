package deep;
import java.util.Scanner;
/**
 * @author JiYoon Yang
 */
/*
장제목: 4장 조건문과 반복문참조타입 > 심화문제2
[문제] while문과 Scanner의 nextInt() 메서드를 이용해서
키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성하세요.
작성일: 2025.04.17
*/
public class deep08 {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 0;
        Scanner scanner = new Scanner(System.in);
        while (run) {
            System.out.println("-------------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------------");
            System.out.print("선택> ");
            int menuNum = Integer.parseInt(scanner.nextLine());
            switch (menuNum) {
                case 1: // 입금을 하는 기능
                    System.out.print("예금액> ");
                    balance += Integer.parseInt(scanner.nextLine());
                    break;
                    
                case 2: // 출금을 하는 기능
                    System.out.print("출금액> ");
                    balance -= Integer.parseInt(scanner.nextLine());
                    break;
                    
                case 3: // 잔고를 조회하는 기능
                    System.out.print("잔고> ");
                    System.out.println(balance);
                    break;
                    
                case 4: // 시스템을 종료하는 기능
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }
}