# Chapter 11 예외 처리
## 11.01 예외와 예외 클래스
## 11.02 예외 처리 코드
### [1] 예외
- **예외(Exception):** 잘못된 사용 또는 코딩으로 인한 오류
- 에러와 달리 예외 처리를 통해 계속 실행 상태를 유지할 수 있음
- **일반 예외 (Exception):** 컴파일러가 예외 처리 코드 여부를 검사하는 예외
- **실행 예외 (Runtime Exception):** 컴파일러가 예외 처리 코드 여부를 검사하지 않는 예외

### [2] 예외처리
- 예외 발생 시 프로그램의 갑작스러운 종료를 막고 정상 실행을 유지할 수 있게 처리하는 코드
- 예외 처리 코드는 try-catch-finally 블록으로 구성

```java
try {
  // 📌 에러가 발생할 것 같은 코드
} catch(예외 클래스 e) {
  // 📌 에러가 발생했을 때 처리 내용 코드
} finally {
  // 📌 항상 실행되는 코드
}
```

### 개념을 잡기 위한 질문들 
1 ) 예외처리를 왜 하는가 ? 안하면 어떻게 되는가
- 실행할 때 특정한 부분에서 에러가 나면 프로그램이 중단되어 버린다.
- 특정 부분의 실행을 포기하고 프로그램을 중단시키지 않기 위해서
- **중단 (방해, interrupt, 인터럽트)**

2) ⭐⭐⭐⭐ 컴파일에러 vs 실행에러
- **컴파일(번역) 에러:** 영어코드(문법에러)---번역----> JVM
- **실행(run-time) 에러:** 논리적 문제, 자원 연결 문제 --- JVM이 실행

3) 반드시 예외처리해야하는 경우는
1. 자바에서 외부 자원을 연결해야할 때
2. File 연결
3. DB 연결
4. 네트워크 연결
5. 컴퓨터 주요 device 연결 (CPU)

## 11.03 예외 종류에 따른 처리
### 다중 catch로 예외 처리하기
- catch 블록의 예외 클래스는 try 블록에서 발생된 예외의 종류를 말함.

**📌 다중 catch 블록일 때?**
- 해당 타입의 예외가 발생하면 catch 블록이 선택되어 실행
- catch 블록이 여러 개라도 catch 블록은 단 하나만 실행됨

**📌 처리해야 할 예외 클래스들이 상속 관계에 있을 때?**
- 하위 클래스 catch 블록을 먼저 작성하고 상위 클래스 catch 블록을 나중에 작성해야 함

```java
try {
  // ArrayIndexOutBoundsException 발생
  // NumberFormatException 발생
} catch(ArrayIndexOutBoundsException e){
  // 예외처리 1
} catch(NumberFormatException e){
  // 예외처리 2
}
```

## 11.04 리소스 자동 닫기
- **리소스(resource):** 데이터를 제공하는 객체
- 리소스는 사용하기 위해 열어야(open)하며, 사용이 끝난 다음에는 닫아야(close)한다.
- 리소스를 사용하다가 **예외가 발생된 경우**에는 **안전하게 닫는 것이 중요**하다.
- 방법: (1) **FileInputStream** 리소스, (2) **try-with-resources** 블록

```java
// "file.txt" 파일의 내용을 읽기 위해 FileInputStream 리소스를 사용하는 예제
FileInputStream fis = null;
try {
  fis = new FileInputStream("file.txt"); // 📌 파일 열기
} catch(IOException e) {
} finally {
  fis.close();                           // 📌 파일 닫기
}
```

- **try-with-resources** 사용 시 예외 발생 여부와 상관없이 리소스를 **자동**으로 닫음.
- 단, 리소스는 *java.lang.AutoCloseable* 인터페이스를 구현해서 *AutoCloseable* 인터페이스의 *close()* 메소드를 **재정의**해야 함.

```java
try (FileInputStream fis = new FileInputStream("file.txt")){
  ...
} catch(IOException e) {
  ...
}

public class FileInputStream implements AutoCloseable {
  ...
  @Override
  public void close() throws Exception { ... }
}
```

## 11.05 예외 떠넘기기
- 메소드 내부에서 예외 발생 시 **throws** 키워드를 이용해 **메소드를 호출한 곳으로 예외 떠넘기기**

```java
리턴타입 메소드명(매개변수, ...) throws 예외클래스1, 예외클래스2, ... {
}
```

- **나열할 예외 클래스가 많으면 throws Exception** 또는 throws Throwable로 모든 예외 떠넘기기

```java
리턴타입 메소드명(매개변수, ...) throws Exception {
}
```

### 📌 try-catch VS throws
- 호출한 내가 처리하면, **try-catch**
- 호출한 나를 부른 메서드로 떠넘기면, **throws**

### 📌Q. 호출한 메서드에 떠넘겨진 경우에, 호출한 메서드는
1) 스스로 예외처리를 할 수도 있고,
2) 또 떠넘길 수 있다.

## 11.06 사용자 정의 예외
- **사용자 정의 예외:** 표준 라이브러리에는 없어 직접 정의하는 예외 클래스
- **일반 예외:** Exception의 자식 클래스로 선언.
- **실행 예외:** RuntimeException의 자식 클래스로 선언.
- **사례:** 은행의 뱅킹 프로그램에서 잔고보다 더 많은 출금 요청이 들어온 경우에는 잔고 부족 예외를 발생시킬 필요가 있다. 그러나 잔고부족 예외는 표준 라이브러리에 존재하지 않기 때문에 직접 예외 클래스를 정의해서 사용해야 한다.

### 📌 예외 발생시키기
- **throws** 키워드와 함께 예외 객체를 제공해 사용자 정의 예외를 직접 코드에서 발생시킬 수 있음
- 예외의 원인에 해당하는 메시지를 제공하려면 생성자 매개값으로 전달

### 📌 예외를 발생시켜서 던지겠다는 의미
던져진 Exception은,
1) catch 블록으로 처리할 수 있고,
2) 메서드를 호출한 곳으로 떠넘길 수 있음.
