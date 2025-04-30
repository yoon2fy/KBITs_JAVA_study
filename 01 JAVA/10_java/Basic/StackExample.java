package Collection;
/*
스택을 이용하여 다음 순서대로 추가하고, 스택이 빌 때까지 하나씩 뽑으면서 해당 요소를 출력하세요.
    ○ 추가 순서 Coin 100, 50, 500, 10
 */
import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        // Stack 컬렉션 생성
        Stack<Coin> coinBox = new Stack<Coin>();

        // 동전 넣기
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        // 동전을 하나씩 꺼내기
        while (!coinBox.isEmpty()) {
            Coin coin = coinBox.pop();
            System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
        }
    }
}
/*
꺼내온 동전 : 10원
꺼내온 동전 : 500원
꺼내온 동전 : 50원
꺼내온 동전 : 100원
 */