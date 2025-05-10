package Basic;
/*
"c:/temp/test1.db" 에서 바이트 데이터를 읽어 화면에 출력하세요
○ 스트림은 기본 스트림을 사용함
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:/TEMP/test1.db");

            while (true){
                int data = is.read();
                if(data == -1) break;
                System.out.println(data);
            }
            is.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}