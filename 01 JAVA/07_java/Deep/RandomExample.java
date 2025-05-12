package Deep;
/*
다음 조건을 만족하는 프로그램을 작성하세요.
    o 난수 추출은 Random 클래스를 이용
    o 1~45 범위의 랜덤한 숫자 6개 선택한 후 출력(선택한 번호)
    o 1~45 범위의 랜덤한 숫자 6개 선택한 후 출력(당첨 번호)
    o 두 숫자 그룹을 각각 정렬
    o 두 그룹 내용의 동일 여부에 따라 1등 당첨 여부를 출력하세요.
 */

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        // 선택 번호
        int[] selectNumbers = new int[6];
        Random random = new Random(3);
        System.out.println("선택번호: ");
        for (int i = 0; i < 6; i++) {
            selectNumbers[i] = random.nextInt(45) + 1;
            System.out.println(selectNumbers[i] + " ");
        }
        System.out.println();

        // 당첨번호
        int[] winningNumbers = new int[6];
        random = new Random(5);
        System.out.println("당첨번호: ");
        for (int i = 0; i < 6; i++) {
            winningNumbers[i] = random.nextInt(45) + 1;
            System.out.println(winningNumbers[i] + " ");
        }
        System.out.println();

        // 당첨여부, 비교하기 전에 배열 항목을 정렬
        Arrays.sort(selectNumbers);
        Arrays.sort(winningNumbers);

        // 배열 항목 비교
        boolean result = Arrays.equals(selectNumbers, winningNumbers);
        System.out.print("당첨여부: ");
        if(result) {
            System.out.println("1등에 당첨되셨습니다.");
        } else {
            System.out.println("당첨되지 않았습니다.");
        }
    }
}
