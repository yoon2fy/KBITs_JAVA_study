package ch04.sec03;
/**
 * @author JiYoon Yang
 */
/*
장제목: 4장 조건문과 반복문 > 기본문제
작성일: 2025.04.15
*/
public class SwitchExample {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6)+1;

        switch(num) {
            case 1:
                System.out.println("1번이 나왔습니다.");
                break;
                case 2:
                    System.out.println("2번이 나왔습니다.");
                    break;
                    case 3:
                        System.out.println("3번이 나왔습니다.");
                        break;
                        case 4:
                            System.out.println("4번이 나왔습니다.");
                            break;
                            case 5:
                                System.out.println("5번이 나왔습니다.");
                                break;
                                default:
                                    System.out.println("6번이 나왔습니다.");
        }
    }
}
