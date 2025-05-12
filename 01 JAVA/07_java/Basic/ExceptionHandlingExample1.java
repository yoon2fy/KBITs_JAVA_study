package Basic;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        int result = data.length(); // data 가 null 일 경우 NullPointerException 발생
        System.out.println("문자 수:" + result);
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength("null"); // 매개값으로 null 대입
        System.out.println("[프로그램 종료]");
    }
}