package Basic;
/*
"c:/temp/test2.db"에서 바이트 데이터를 읽어 바이트 배열 (data)에 저장하세요
○ 스트림은 기본 스트림을 사용함
○ 1 바이트 씩 읽어 , 화면에 출력함
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:/TEMP/test2.db");
            byte[] data = new byte[100];
            while (true) {
                int num = is.read(data);
                if (num == -1) break;

                for (int i = 0; i < num; i++) {
                    System.out.println(data[i]);
                }
            }
            is.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
