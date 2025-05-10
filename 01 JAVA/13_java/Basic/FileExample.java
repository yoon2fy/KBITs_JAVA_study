package Basic;
/*
다음 조건을 처리하는 코드를 작성하세요
○ C:/temp/file1.txt 이 존재하는지 확인하세요
○ 존재하는 경우 파일인지 , 디렉토리인지 구분함
     파일이면 파일경로 , 파일 크기를 출력하세요
     디렉토리이면 "<dir> 파일 경로 " 형태로 출력하세요
○ 존재하지 않는 경우 , 해당 파일은 없는 파일입니다 ." 출력함
 */

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws Exception {
        // File 객체 생성
        File dir = new File("C:/TEMP/images");
        File file1 = new File("C:/TEMP/file1.txt");
        File file2 = new File("C:/TEMP/file2.txt");
        File file3 = new File("C:/TEMP/file3.txt");

        // 존재하지 않으면 디렉토리 파일 생성
        if(dir.exists() == false) { dir.mkdirs(); }
        if(file1.exists() == false) { file1.createNewFile(); }
        if(file2.exists() == false) { file2.createNewFile(); }
        if(file3.exists() == false) { file3.createNewFile(); }

        // Temp 폴더의 내용을 출력
        File temp = new File("C:/TEMP");
        File[] contents = temp.listFiles();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (File file : contents) {
            System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
            if (file.isDirectory()) {
                System.out.printf("%-10s%-20s", "<DIR>", file.getName());
            } else {
                System.out.printf("%-10s%-20s", file.length(), file.getName());
            }
            System.out.println();
        }
    }
}