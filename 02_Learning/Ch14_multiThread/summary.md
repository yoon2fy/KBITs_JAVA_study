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
### 일지 정지 상태
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

### 실행 대기 상태 (RUNNABLE)
- 실행을 기다리고 있는 상태

### 실행(RUNNING) 상태
- CPU 스케쥴링에 따라 CPU를 점유하고 run() 메소드를 실행
- 스케줄링에 의해 다시 실행 대기 상태로 돌아갔다가 다른 스레드가 실행 상태 반복

### 종료 상태 (TERMINATED)
- 실행 상태에서 run() 메소드가 종료
- 실행할 코드 없이 스레드의 실행을 멈춘 상태


### 📌 다른 스레드의 종료를 기다림
- 어떤 스레드 A는 특정 스레드 B의 작업 결과를 바탕으로 동작
- 스레드 A는 스레드 B의 작업이 끝날 때까지 하는 일 없이 기다려야 함 --> 어떻게 스레드 B의 작업 종료를 인지할 수 있는가
- **join() 메소드:** 해당 스레드가 종료할 때까지 대기 하다가 스레드가 종료하면 실행을 재개

### 📌 다른 스레드에게 실행 양보
- **yield() 메소드:** 실행되는 스레드는 실행 대기 상태로 돌아가고, 다른 스레드가 실행되도록 양보함.

## 14.06 스레드 동기화
### 동기화(synchronized) 메소드와 블록
- 스레드 작업이 끝날 때까지 객체에 잠금을 걸어 스레드가 사용 중인 객체를 다른 스레드가 변경할 수 없게함.

### 동기화 메소드 및 블록 선언
- 인스턴스와 정적 메소드에 **synchronized** 키워드 붙임
- 동기화 메소드를 실행 즉시 객체는 잠금이 일어나고, 메소드 실행이 끝나면 잠금 풀림
- 메소드 일부 영역 실행 시 객체 잠금을 걸고 싶다면 동기화 블록을 만듦

```java
public synchronized void method(){
  // 단 하나의 스레드만 실행하는 영역
}
```

```java
public void method (){
  // 여러 스레드가 실행할 수 있는 영역
  synchronized(공유객체){
    // 단 하나의 스레드만 실행하는 영역
  }
  // 여러 스레드가 실행할 수 있는 영역
}
```

### 📌 wait()와 notify()를 이용한 스레드 제어 
**공유 객체**는 두 스레드가 작업할 내용을 각각 동기화 메소드로 정해놓음. 한 스레드가 작업을 완료하면 **notify()** 메소드를 호출해서 일시 정지 상태에 있는 다른 스레드를 실행 대기 상태로 만들고, 자신은 두 번 작업을 하지 않도록 **wait()** 메소드를 호출하여 일시 정지 상태로 만든다.

## 14.07 스레드 안전 종료
사용하던 리소스들을 정리하고 run() 메소드를 빨리 종료하는 것.
주로 **(1)** 조건 이용 방법, **(2)** interrupt() 메소드를 사용함.

### 📌조건 이용
```java
public class XXXThread extend Thread {
  private boolean stop; // 📌 stop이 필드 선언

  public void run() {
    while(!stop) { // 📌 stop이 true가 되면 while문을 빠져 나감
    // 스레드가 반복 실행하는코드; 
    }
  // 스레드가 사용한 리소스 정리 // 📌 리소스 정리
  } // 📌 스레드 종료
}
```

### 📌 interrupt()
- **interrupt()** 메소드는 스레드가 **일시 정지 상태**에 있을 때 InterruptedException 예외를 발생시키는 역할을 함. 이것을 이용해서 run() 메소드를 정상 종료시킬 수 있음.
- 그러나, 스레드가 **실행 대기/실행 상태**일 때는 예외가 발생되지 않음.

## 14.08 데몬 스레드
- **데몬 스레드:** 주 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드임.
- 주스레드가 종료되면 데몬 스레드도 따라서 자동으로 종료된다.

## 14.09 스레드풀
- **스레드 풀(Thread pool):** 병렬 작업 처리가 많아지면 스레드의 개수가 폭증하여 CPU가 바빠지고 메모리 사용량이 늘어남. 이를 막기 위해서 스레드 풀을 사용함.
- 스레드풀은 작업 처리에 사용되는 스레드를 제한된 개수만큼 정해놓고 작업 큐(Queue)에 들어오는 작업들을 스레드가 하나씩 맡아 처리하는 방법임.

### 📌스레드풀 생성
java.util.concurrent 패키지에서 ExecutorService 인터페이스와 Executors 클래스를 제공하고 있음.

**table.** Executors의 정적 메소드
|메소드명(매개변수)|초기 수|코어 수|최대 수|
|-|-|-|-|
|newCachedThreadPool()|0|0|integer.MAX_VALUE|
|newFixedThreadPool(int n Threads)|0|생성된 수|nThreads|

### 📌 스레드풀 종료
스레드풀은 main 스레드가 종료되어도 작업을 처리하기 위해 계속 실행 상태로 남아 있다. 스레드풀의 모든 스레드를 종료하려면 ExecutorService의 다음 두 메소드 중 하나를 실행해야함.

**table.** ExecutorService의 종료 메소드
|리턴타입|메소드명(매개변수)|설명|
|-|-|-|
|void|shutdown()|현재 처리 중인 작업뿐만 아니라 작업 큐에 대기하고 있는 모든 작업을 처리한 뒤에 스레드풀을 종료시킴|
|List<Runnable>|shutdownNow()|현재작업 처리 중인 스레드를 interrupt해서 작업을 중지시키고 스레드풀을 종룟킴. 리턴값은 작업 큐에 있는 미처리된 작업(Runnable)의 목록임| 

### 📌 작업 생성과 처리 요청
하나의 작업은 Runnnable 또는 Callable 구현 객체로 표현함. 차이점은 Callable이 return값이 있다는 것임.

```java
// 📌 Runnable 익명 구현 객체
new Runnable() {
  @Override
  public void run () {
    // 스레드가 처리할 작업 내용
  }
}

// 📌 Callable 익명 구현 객체
new Calable<T>(){
  @Override
  public T call() throws Exception {
    // 스레드가 처리할 작업 내용 
    return T;
  }
}
```

**table.** ExecutorService의 작업처리 메소드
|리턴타입|메소드명(매개변수)|설명|
|-|-|-|
|void|execute(Runnable command)|Runnable을 작업 큐에 저장함. 작업 처리 결과를 리턴하지 않음.|
|Future<T>|submit(Callable<T> task)|Callable을 작업 큐에 저장.|
