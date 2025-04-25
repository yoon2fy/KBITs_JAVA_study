package ch02.sec01;
/**
 * @author JiYoon Yang
 */
/*
장제목: Ch02.변수와 타입
작성일: 2025.04.17
*/
public class VariableUseExample {
    public static void main(String[] args) {
        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시간 " + minute + "분"); // 3시간 5분

        int totalMinutes = hour*60 + minute;
        System.out.println("총 " + totalMinutes + "분"); // 총 185분
    }
}
