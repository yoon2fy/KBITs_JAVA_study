package Basic;
/*
○ 처리할 예외
     ArrayIndexOutOfBoundsException
     NullPointerException
     NumberFormatException
○ NullPointerException 와 NumberFormatException 는 동일한 예외처리
 */
public class ExceptionHandlingExample4 {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "200"};
        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과됨" + e.getMessage());
            } catch (NullPointerException | NumberFormatException e) {
                System.out.println("데이터에 문제가 있음: " + e.getMessage());
            }
        }
    }
}