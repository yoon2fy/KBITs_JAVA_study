package Deep;
/*
다음 클래스를 실행하면 "로그인 합니다", "파일 다운로드 합니다."가 차례대로 출력되도록
LoginServlet과 FileDownloadServlet 클래스를 정의하고, method 메서드를 완성하세요
 */
public class HttpServiceExample {
    public static void main(String[] args) {
        // 로그인 합니다. -- LoginServlet
        method(new LoginServlet());

        // 파일을 다운도르 합니다. -- FileDownloadServlet
        method(new FileDownloadServlet());
    }
    public static void method(HttpServlet servlet) {
        servlet.service();
    }
}
