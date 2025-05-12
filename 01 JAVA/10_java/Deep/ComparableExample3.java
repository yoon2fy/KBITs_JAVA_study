package Deep;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparableExample3 {
    public static void main(String[] args) {
        // 비교자를 제공한 TreeSet 컬렉션 생성
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                if(o1.price < o2.price) return -1;
                else if(o1.price == o2.price) return 0;
                else return 1;
            }
        });

        // 객체를 저장함
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));

        // 객체를 하나씩 가져오기
        for (Fruit fruit : treeSet) {
            System.out.println(fruit.name + ":" + fruit.price);
        }
    }
}