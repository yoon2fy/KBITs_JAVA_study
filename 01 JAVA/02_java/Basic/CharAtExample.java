package ch05.sec05;
/**
 * @author JiYoon Yang
 */
/*
장제목: 5장 참조타입 > 기본문제
작성일: 2025.04.16
*/
public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9506241230123"; // 남자입니다.
        char gender = ssn.charAt(6); // 7번째 값을 보겠다.
        switch(gender) {
            case '1':
            case '3':
                System.out.println("남자입니다.");
                break;
            case '2':
            case '4':
                System.out.println("여자입니다.");
                break;
        }
    }
}
