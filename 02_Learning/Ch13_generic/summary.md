# Chapter 13 제네릭
## 13.01 제네릭이란?
- **제네릭:** 결정되지 않은 타입을 파라미터로 처리하고 실제 사용할 때 파라미터를 구체적인 타입으로 대체시키는 기  

```java
public class Box <T>{ // 여기서, <T>는 T라는 타입 파라미터임
  public T content;
}
```

## 13.02 제네릭 타입
- **제네릭 타입:** 결정되지 않은 타입을 파라미터로 가지는 클래스와 인터페이스

```java
public class 클래스명<A, B, ...> { ... }
public interface 인터페이스명<A, B, ...> { ... }
```

## 13.03 제네릭 메소드
- **제네릭 메소드:** 타입 파라미터를 가지고 있는 메소드를 말함. 타입 파라미터가 메소드 선언부에 정의된다는 점에서 제네릭 타입과 차이가 있음.
- **boxing()** 메소드: 타입 파라미터로 <T>를 정의하고 매개변수 타입과 리턴 타입에서 T를 사용함.

```java
// 제네릭 메소드
public <A, B, ...> 리턴타입 메소드명(매개변수, ...) { ... }

// boxing() 메소드
public <T> Box<T> boxing(T t) { ... }
```

## 13.04 제한된 타입 파라미터
- **제한된 타입 파라미터(bounded type parameter):** 특정 타입과 자식 또는 구현 관계에 있는 타입만 대체할 수 있는 타입 파라미터

```java
public <T extends 상위타입> 리턴타입 메소드(매개변수, ...) { ... }
```

## 13.05 와일드카드 타입 파라미터
- **?(와일드카드)** 는 범위에 있는 모든 타입으로 대체할 수 있다는 표시임.
- 제네릭 타입을 매개값이나 리턴 타입으로 사용할 때 타입 파라미터로 **?(와일드카드)** 를 사용할 수있다.

*e.g.* 

```java
// 타입 파라미터의 대체 타입으로 Student와 자식 클래스인 HighSchool와 MiddleStudent만 가능하도록 매개변수 선언
리턴타입 메소드명(제네릭타입<? extends Student> 변수){...}

// Worker와 부모 클래스인 Person만 가능하도록 매개변수 선언
리턴타입 메소드명(제네릭타입<? super Worker> 변수){...}

// 어떤 타입이든 가능하도록  매개변수 선언
리턴타입 메소드명(제네릭타입<?> 변수){...}
```
