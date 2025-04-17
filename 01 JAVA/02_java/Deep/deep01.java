package deep;
/**
 * @author JiYoon Yang
 */
/*
장제목: 4장 조건문과 반복문 > 심화문제
작성일: 2025.04.16
*/
public class deep01 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        System.out.print("1부터 100까지의 3의 배수의 정수: ");

        for(i=1; i <=100; i++){
        if(i%3 != 0){
        continue;}
        sum += i;

            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("3의 배수의 총합: " + sum);
    }
}
