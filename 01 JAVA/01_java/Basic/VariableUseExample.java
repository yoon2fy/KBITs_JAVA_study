package ch02.sec01;
/**
 * @author JiYoon Yang
 */
/*
장제목: 2장 변수와 타입
작성일: 2025.04.14
*/
public class VariableUseExample {
    public static void main(String[] args) {
        int hour = 3; // 변수 hour에 3 지정
        int minute = 5; // 변수 minute에 5 지정
        System.out.println(hour+"시간 "+minute+"분");

        int totalMinute = hour*60 + minute; // 변수 totalMinute을 계산
        System.out.println("총 "+totalMinute+"분");
    }
}



//int result = x + y;         // 변수 result에 변수x, y의 합을 저장
//System.out.println(result); // 변수 result를 화면에 출력하세요.