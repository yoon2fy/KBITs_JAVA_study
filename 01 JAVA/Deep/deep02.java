package deep;
/**
 * @author JiYoon Yang
 */
/*
장제목: 4장 조건문과 반복문 > 심화문제
작성일: 2025.04.16
*/
public class deep02 {
    public static void main(String[] args) {
        int i = 1;
        for (i=1; i <=5; i++){
            for(int j=1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
