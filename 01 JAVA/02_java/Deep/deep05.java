package deep;
/**
 * @author JiYoon Yang
 */
/*
장제목: 5장 참조타입 > 심화문제
작성일: 2025.04.17
*/
public class deep05 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        System.out.println(array.length); // 3
        System.out.println(array[2].length); // 5
    }
}
