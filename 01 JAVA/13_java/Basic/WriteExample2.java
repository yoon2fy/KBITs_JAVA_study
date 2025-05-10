package Basic;
/*
다음 배열의 값을 "c:/temp/test2. 에 저장하세요
○ 스트림은 기본 스트림을 사용함
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:/TEMP/test2.db");

            byte[] array = {10, 20, 30};

            os.write(array);

            os.flush();
            os.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
