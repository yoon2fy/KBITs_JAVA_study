package Deep;

/*
1) Input 클래스를 정의하세요.
 멤버 변수로 Scannere 객체에 대한 정적 참조 변수를 가지며,
 바로 초기화를 함.

2) Input 클래스에 다음과 같은 정적 메서드를 추가하세요.
 String read(String title)
    - 매개변수 title 을 출력하고 줄바꿈하지 않음 사용자가 입력한 문자열을 리턴함
 String read(String title, String defaultValue
    - 매개변수 title(defaultValue를 출력하고 줄바꿈하지 않음),
    - 사용자가 입력한 문자열을 리턴함,
    - 그냥 엔터를 치면 defaultValue를 리턴
 int readInt (String title)
    - 매개변수 title 을 출력하고 줄바꿈하지 않음 사용자가 입력한 문자열을 정수로 변환 후 리턴함
 boolean confirm(String title, boolean defaultValue
    - 매개변수 title (Y/n) 을 출력하고 줄바꿈하지 않음 ),
    - defaultValue 가 true 이면 (Y/ false 이면 (y/ 을 출력
    - 입력 없이 엔터를 친 경우 기본값 리턴
 boolean confirm(String title)
    - 앞에서 정의한 confirm 을 호출하여 그 결과를 리턴


 */
import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);

    public static String read(String title) {
        System.out.print(title);
        return sc.nextLine();
    }

    public static String read(String title, String defaultValue) {
        System.out.printf("%s(%s): ", title, defaultValue);
        String answer = sc.nextLine();

        return answer.isEmpty() ? defaultValue : answer;
    }

    public static int readInt(String title) {
        System.out.print(title);
        int answer = sc.nextInt();
        sc.nextLine(); // 엔터 제거용
        return answer;
    }

    public static boolean confirm(String title, boolean defaultValue) {
    String yesNo = defaultValue ? "(Y/n)" : "(y/N)";
    System.out.printf("%s %s: ", title, yesNo);

    String answer = sc.nextLine();
    if (answer.isEmpty()) {
        return defaultValue;
    }
    return answer.equalsIgnoreCase("y");
    }

    public static boolean confirm(String title) {
        return confirm(title, true);
    }
}
