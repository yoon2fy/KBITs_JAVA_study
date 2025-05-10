package Basic;

/*
test.jpg 파일을 준비하고, 이 파일을 test2.jpg 파일로 복사하세요
○ 스트림은 기본 스트림을 사용함
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
    public static void main(String[] args) throws Exception{
        String originalFileName = "C:/TEMP/test.jpg";
        String targetFileName = "C:/TEMP/test2.jpg";

        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(targetFileName);

        byte[] data = new byte[1024];

        while(true){
            int num = is.read(data);
            if(num == -1) break;
            os.write(data, 0, num);
        }

        os.flush();
        os.close();
        is.close();

        System.out.println("복사가 잘 되었습니다.");
    }
}
