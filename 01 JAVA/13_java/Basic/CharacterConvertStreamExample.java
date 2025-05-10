package Basic;
/*
다음 문자열을 "c:/temp/test. 에 저장하고, 그 파일에서 읽어서 화면에 출력하세요
○ 문자 변환 보조 스트림을 사용함
○ 문자열은 UTF 8 문자셋으로 저장하고, 읽어 옴
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {
    public static void main(String[] args) throws Exception {
        write("문자 변환 스트림을 사용합니다.");
        String data = read();
        System.out.println(data);
    }

        public static void write(String str) throws Exception {
            OutputStream os = new FileOutputStream("C:/TEMP/test.txt");
            Writer writer = new OutputStreamWriter(os, "UTF-8");
            writer.write(str);
            writer.flush();
            writer.close();
        }

        public static String read() throws Exception {
            InputStream is = new FileInputStream("C:/TEMP/test.txt");
            Reader reader = new InputStreamReader(is, "UTF-8");
            char[] data = new char[100];
            int num = reader.read(data);
            reader.close();
            String str = new String(data, 0, num);
            return str;
        }
    }
