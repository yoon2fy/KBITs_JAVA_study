package Deep;
/*
다음 조건을 만족하는 프로그램을 작성하세요.
    o Board 클래스를 저장하기 위한 ArrayList 인스턴스 생성
    o Board 클래스의 인스턴스 5개를 생성하여 ArrayList에 추가
    o ArrayList에 저장된 요소의 개수 출력
    o 3번째 데이터를 추출하여 출력
    o 일반 for 문으로 순회하면서 리스트의 각 요소를 출력
    o 인덱스 2에 해당하는 요소 제거
    o 향상된 for 문으로 순회하면서 리스트의 각 요소를 출력
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList 컬렉션 생성
        List<Board> list = new ArrayList<>();

        // 객체 추가
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        // 저장된 총 객체의 수 얻기
        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();

        // 특정 인덱스의 객체 가져오기
        Board board = list.get(2);
        System.out.println(board.getSubject() + "\t" + board.getContent() +
                "\t" + board.getWriter());
        System.out.println();

        // 모든 객체를 하나씩 가져오기
        for (int i = 0; i < list.size(); i++) {
            Board b = list.get(i);
            System.out.println(b.getSubject() + "\t" + b.getContent() +
                    "\t" + b.getWriter());
        }
        System.out.println();

        // 객체 삭제
        list.remove(2);

        // 향상된 for 문으로 모든 객체를 하나씩 가져오기
        for (Board b : list) {
            System.out.println(b.getSubject() + "\t" + b.getContent() +
                    "\t" + b.getWriter());
        }
    }
}
