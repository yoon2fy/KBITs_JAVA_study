package ch02.sec09;
/**
 * @author JiYoon Yang
 */
/*
장제목: Ch02.변수와 타입
작성일: 2025.04.17
*/
public class StringConcatExample {
    public static void main(String[] args) {
        int result1 = 10 + 2 + 8;
        System.out.println(result1); // 20; 숫자 연산을 한 것임. 그래서 결과가 20임.

        String result2 = 10 + 2 + "8";
        System.out.println(result2); // 128; (자동변환에 의해) 12 + "8" => "128"

        String result3 = 10 + "2" + 8;
        System.out.println(result3); // 1028; (자동변환에 의해) "10" + "2" + 8=> "102" + 8 => "102" + "8" => "1028"

        String result4 = "10" + 2 + 8;
        System.out.println(result4); // 1028; (자동변환에 의해) "10" + "2" + 8 => "102" + 8 => "102" + + "8" => "1028"

        String result5 = "10" + (2 + 8);
        System.out.println(result5); // 1010; (우선순위에 의해) "10" + 10 => (자동변환에 의해) "10" + "10" => "1010"
    }
}