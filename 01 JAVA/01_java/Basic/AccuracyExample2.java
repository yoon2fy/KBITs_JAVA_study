package ch03.sec04;
/**
 * @author JiYoon Yang
 */
/*
장제목: 3장 연산자
작성일: 2025.04.15
*/
public class AccuracyExample2 {
    public static void main(String[] args) {
        int apple = 1;
        int totalPieces = apple * 10;
        int number = 7;
        int result = totalPieces - number;
        System.out.println("10조각에서 남은 조각: " + result);
        System.out.println("사과 1개에서 남은 양: " + result/10.0);
    }
}

/*
totalPieces = 1*10 = 10
 ㄴ result = 10 - 7 = 3
   ㄴ result/10 = 0.3
*
*/