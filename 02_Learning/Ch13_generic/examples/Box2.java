package Generic;

public class Box2<T> {
    public T content;

    // Box2의 내용물이 같은지 비교
    public boolean compare(Box2<T> other) {
        boolean result = content.equals(other.content);
        return result;
    }
}