package Basic;
 /*
 현재 날짜 데이터를 "2024.06.15 15:22: 와 같은 포맷으로 출력하세요
  */
import java.text.*;
import java.util.*;
public class DateExample {
    public static void main(String[] args) {
        Date now = new Date();
        String strNow1 = now.toString();
        System.out.println(strNow1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String strNow2 = sdf.format(now);
        System.out.println(strNow2);
    }
}
