package Basic;

/*
c:/temp/test3.txt 파일을 라인 단위로 읽어, 화면에 한 줄씩 출력하세요
○ test3.txt 파일에 여러 줄의 텍스트를 입력해 둠
○ 스트림은 성능 향상 보조 스트림을 사용함
 */

import java.io.*;

public class ReadLineExample {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:/TEMP/test.txt"));

        int lineNo =1;
        while(true) {
            String str = br.readLine(); // 1행 단위로 읽음
            if (str == null) break;
            System.out.println(lineNo + "\t" + str);
            lineNo++;
        }
        br.close();
    }
}
