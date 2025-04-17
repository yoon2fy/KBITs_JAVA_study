package ch02.sec13;

import java.util.Scanner;

/**
 * @author JiYoon Yang
 */
/*
장제목: Ch02.변수와 타입
작성일: 2025.04.17
*/
public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("x 값 입력: ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.println("y 값 입력: ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y: " + result);
        System.out.println();

        while(true){
            System.out.println("입력 문자열: ");
            String data = scanner.nextLine();
            if(data.equals("q")){
                break;
            }
            System.out.println("출력 문자열: " + data);
            System.out.println();
        }
        System.out.println("종료");
    }
}
/*
x 값 입력:
1
y 값 입력:
2
x + y: 3

입력 문자열:
안녕!
출력 문자열: 안녕!

입력 문자열:
바보
출력 문자열: 바보

입력 문자열:
q
종료

종료 코드 0(으)로 완료된 프로세스
 */