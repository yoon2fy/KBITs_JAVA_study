package Collection;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        //객체 저장
        set.add("Java"); // 객체수: 1
        set.add("JDBC"); // 객체수: 2
        set.add("Servlet/JSP"); // 객체수: 3
        set.add("Java"); // 객체수: 3
        set.add("iBATIS"); // 객체수: 4

        //저장된 객체 수 출력
        int size = set.size();
        System.out.println("총 객체 수: " + size); // 총 객체 수: 4
    }
}

/*
총 객체 수: 4
 */