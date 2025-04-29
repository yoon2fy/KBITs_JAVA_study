package Generic;

public class Box3<T> {
    //필드
    private T t;

    //Getter 메소드
    public T get(){
        return t;
    }

    //Setter 메소드
    public void set(T t){
        this.t = t;
    }
}