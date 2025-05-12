package Basic;
/*
다음 조건을 만족하도록 프로그램을 수정하세요
    ○ split 메서드를 이용하여 홍길동 이수홍 박연수 에서 이름 문자열만 추출하여 출력
    ○ String Tokenizer 를 이용하여 홍길동 이수홍 박연수 " 에서 이름 문자열만 추출하여 출력
 */
import java.util.StringTokenizer;
public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍, 박연수 ";
        String[] arr = data1.split("&|,");
        for(String token : arr) {
            System.out.println(token);
        }
        System.out.println();

        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data2, "/");
        while (st.hasMoreTokens()){
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}