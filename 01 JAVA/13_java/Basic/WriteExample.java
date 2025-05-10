package Basic;
// 다음 변수의 값을 "c:/temp/test1.db" 파일에 저장하세요

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:/TEMP/test1.db");

            byte a= 10;
            byte b= 20;
            byte c= 30;

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush();
            os.close();
    } catch (IOException e) {
        e.printStackTrace();}
    }
}
