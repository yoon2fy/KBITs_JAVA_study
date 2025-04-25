# Chapter 14 멀티 스레드
## 14.01 멀티 스레드 개념
- **프로세스(process):** 운영체제는 실행 중인 프로그램을 관리
- **멀티 스레드(multitread):** 두 개의 코드 실행 흐름. 두 가지 이상의 작업을 처리

## 14.02 메인 스레드
- 메인 스레드는 main() 메소드의 첫 코드부터 순차적으로 실행함
- main() 메소드의 마지막 코드를 실행하거나 return문을 만나면 실행을 종료함
- 메인 스레드는 추가 작업 스레드들을 만들어서 실행시킬 수 있음
- 메인 스레드가 작업 스레드보다 먼저 종료되더라도 작업 스레드가 계속 실행 중이라면 프로세스는 종료되지 않음

## 14.03 작업 스레드 생성과 실행
**작업 스레드:** 멀티 스레드 프로그램을 개발 시 먼저 몇 개의 작업을 병렬로 실행할 지 결정하고 각 작업별로 스레드를 생성

### 📌 Thread 클래스로 직접 생성
**방법 1.** Runnable 인터페이스에 따라 구현된 객체를 매개값으로 갖는 생성자를 호출

```java
Thread thread = new Thread(Runnable target); // 📌 Runnable Interface에 따라 구현한 Task 클래스

class Task implements Runnable {
  @Override
  public void run(){
    // Thread가 실행할 코드
  }
}
```

```java
// 📌 Task를 Thread 객체 생성시 넣어줌.
Runnable task = new Task();
Thread thread = new Thread(task);

// 📌 익명 클래스를 만들기
Thread thread = new Thread(new Runnable() {
  @Override
  public void run () {
    // 스레드가 실행할 코드
  }
});

thread.start(); // 메소드 호출
```

**방법 2.** Thread 클래스를 상속한 다음 run() 메소드를 재정의

```java
public class WorkerThread extends Thread {
  @Override
  public void run(){
    // 스레드가 실행할 코드
  }
}

// 스레드 객체 생성
Thread thread = new WorkerThread();
thread.start();
```

**방법 3.** 객체를 생성 혹은 Thread 익명 자식 객체를 사용 가능

```java
// 익명 클래스
Thread thread = new Thread(){
  @Override
  public void run(){
    // 스레드가 실행할 코드
  }
};
thread.start();
```

## 14.04 스레드 이름
### 📌 작업 스레드의 이름
- 작업 스레드 이름을 Thread-n 대신 다른 이름으로 설정하려면 Thread 클래스의 setName() 메소드 사용

```java
thread.setName("스레드 이름");
```

- 디버깅할 때 어떤 스레드가 작업을 하는지 조사하기 위해 주로 사용
- 어떤 스레드가 실행하고 있는지 확인하려면 정적 메소드인 currentThread()로 스레드 객체의 참조를 얻은 다음 getName() 메소드로 이름을 출력

```java
Thread thread = Thread.currentThread();
System.out.println(thread.getName());
```

## 14.05 스레드 상태
### 📌 일지 정지 상태
- 스레드가 실행할 수 없는 상태
- 스레드가 다시 실행 상태로 가기 위해서는 일시 정지 상태에서 실행 대기 상태로 가야함
- Thread 클래스의 sleep() 메소드: (1) 실행 중인 스레드를 일정 시간 멈추게 함. (2) 매개값 단위는 밀리세컨드(1/1000)
- Cpu 를 연결하는 것이므로 예외처리 반드시 필요함 **(try catch)**.

```java
try {
  Thread.sleep(1000);
} catch(InterruptedException e) {
  // Interrupt() 메소드가 호출되면 실행
}
```

### 📌 실행 대기 상태
- 실행을 기다리고 있는 상태

### 📌 실행 상태
- CPU 스케쥴링에 따라 CPU를 점유하고 run() 메소드를 실행
- 스케줄링에 의해 다시 실행 대기 상태로 돌아갔다가 다른 스레드가 실행 상태 반복

### 📌 종료 상태
- 실행 상태에서 run() 메소드가 종료
- 실행할 코드 없이 스레드의 실행을 멈춘 상태


## 14.06 스레드 동기화


## 14.07 스레드 안전 종료


## 14.08 데몬 스레드


## 14.09 스레드풀


