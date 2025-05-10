package Basic;
/*
다음 변수의 값들을 c:/temp/test.txt 에 저장하세요
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample3 {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("C:/TEMP/test.txt");

            char a = 'A';
            writer.write(a);

            char b = 'B';
            writer.write(b);

            char[] arr = {'C', 'D', 'E'};
            writer.write(arr);

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
