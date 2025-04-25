# Chapter 12 java.base 모듈
## 12.01 API(Application Programming Interface) 도큐먼트
- 자바 표준 모듈에서 제공하는 라이브러리를 쉽게 찾아서 사용할 수 있도록 도와주는 문서
- JDK 버전별로 사용할 수 있는 API 도큐먼트: [링크](https://docs.oracle.com/en/java/javase/index.html)

## 12.02 java.base 모듈
### 📌 java.base
모든 모듈이 의존하는 기본 모듈로, 모듈 중 유일하게 requires하지 않아도 사용할 수 있음

|패키지|용도|
|-|-|
|java.lang⭐|자바 언어의 기본 클래스를 제공|
|java.util⭐|자료 구조와 관련된 컬렉션 클래스를 제공|
|java.text|날짜 및 숫자를 원하는 형태의 문자열로 만들어 주는 포맷 클래스를 제공|
|java.time|날짜 및 시간을 조작하거나 연산하는 클래스를 제공|
|java.io|입출력 스트림 클래스를 제공|
|java.net|네트워크 통신과 관련된 클래스를 제공|
|java.nio|데이터 저장을 위한 Buffer 및 새로운 입출력 클래스 제공|

### 📌 java.lang
자바 언어의 기본적인 클래스를 담고 있는 패키지로, 이 패키지에 있는 클래스와 인터페이스는 import 없이 사용할 수 있음

|클래스|용도|
|-|-|
|Object|자바 클래스의 최상위 클래스로 사용|
|System|키보드로부터 데이터를 입력받을 때, 모니터(콘솔)로 출력하기 위해, 프로세스를 종료시킬 때, 진행시간을 읽을 때, 시스템 속성(프로퍼티)를 읽을 때 사용|
|String|문자열을 저장하고 조작할 때 사용|
|StringBuilder|효율적인 문자열 조작 기능이 필요할 때 사용|
|java.util.String.Tokenizer|구분자로 연결된 문자열을 분리할 때 사용|
|Byte, Short, Character, Integer, Float, Double, Boolean|기본 타입의 값을 포장할 때, 문자열을 기본 타입으로 변환할 때 사용|
|Math|수학 계산이 필요할 때 사용|
|Class|클래스의 메타 정보(이름, 구성 멤버) 등을 조사할 때 사용|

## 12.03 Object 클래스
클래스를 선언할 때 extends 키워드로 다른 클래스를 상속하지 않으면, 암시적으로 java.lang.Object 클래스를 상속 -> 자바의 모든 클래스는 Object의 자식이거나 자손 클래스

|메소드|용도|
|-|-|
|boolean equals(Object obj)|객체의 번지를 비교하고 결과를 리턴|
|int hashCode()|객체의 해시코드를 리턴|
|String toString()|객체 문자 정보를 리턴|

### 📌 객체 동등 비교
- Object의 equals() 메소드는 **객체의 번지를 비교하고** boolean 값을 리턴

### 📌 객체 해시코드
- 객체를 식별하는 정수
- Object의 hashCode() 메소드는 객체의 메모리 번지를 이용해서 해시코드를 생성하기 때문에 객체마다 다른 정수값을 리턴

```java
public int hashCode()
```

### 📌 객체 문자 정보
- 객체를 문자열로 표현한 값
- Object의 toString() 메소드는 객체의 문자 정보를 리턴
- 기본적으로 Object의 toString() 메소드는 *클래스명@16진수해시코드*로 구성된 문자열을 리턴

```java
Object obj = new Object();
System.out.println(obj.toString()); // java.lang.Object@de6ced 를 리턴함
```

### 📌 lombok 사용하기 (주요 함수를 자동으로 생성해주는 라이브러리임)
- **DTO 클래스**를 작성할 때 **Getter, Setter, hashCode(), equals(), toString() 메소드**를 자동으로 생성
- 필드가 final이 아니며, 값을 읽는(= 꺼내는) Getter는 getXxx(또는 isXxx)로, 값을 변경하는(= 넣는) Setter는 setXxx로 생성됨
- [사이트](https:// projectlombok.org/download)

**table.** lombok 어노테이션
|어노테이션|설명|
|-|-|
|@Data|@RequiredArgsConstructor, @Getter, @Setter, @EqualsAndHashCode, @ToString 합친 것|
|@NoArgsConstructor|기본(매개변수가 없는) 생성자 포함|
|@AllArgsConstructor|모든 필드를 초기화시키는 생성자 포함|
|@RequiredArgsConstructor|기본적으로 매개변수가 없는 생성자 포함. 만약 final 또는 @NonNull이 붙은 필드가 있다면 이 필드만 초기화시키는 생성자 포함|
|@Getter|Getter 메소드 포함|
|@Setter|Setter 메소드 포함|
|@EqualsAndHashCode|equals()와 hashCode() 메소드 포함|
|@ToString|toString() 메소드 포함|

**[용어정리]**
- DTO = Data Transfer Object
- VO = Value Object

### 📌 DTO 클래스란?
- 많은 양의 데이터를 전달할 목적으로 사용하는 가방 역할의 클래스
- 값들만 넣어서 전달하고, 전달된 값들을 꺼내어 사용하는 역할
- 자바에서는 여러 데이터를 전달할 때 하나씩 전달하지 않고, 데이터들을 넣어서 전달할 클래스(가방역할)을 만들어 사용함.

## 12.04 System 클래스
System 클래스의 정적 static 필드와 메소드를 이용하면 프로그램 종료, 키보드 입력, 콘솔(모니터) 출력, 현재 시간 읽기, 시스템 프로퍼티 읽기 등이 가능함.

**table.** 정적 멤버 System 클래스 **(필드)**
|정적 멤버|용도|
|-|-|
|out|콘솔에서 문자 출력|
|err|콘솔에서 에러 내용 출력|
|in|키보드 입력|

**table.** 정적 멤버 System 클래스 **(메소드)**
|정적 멤버|용도|
|-|-|
|exist(int status)|프로세스 종료|
|currentTimeMillis()|현재 시간을 밀리초 단위의 long 값으로 리턴|
|nanoTime()|현재 시간을 나노초 단위의 long 값으로 리턴|
|getProperty()|운영체제와 사용자 정보 제공|
|getenv()|운영체제의 환경 변수 정보 제공|

### 📌 시스템 프로퍼티 읽기
**시스템 프로퍼티(System Property):** 자바 프로그램이 시작될 때 자동 설정되는 시스템의 속성 *(교과서 2권 p.520)*

## 12.05 문자열 클래스
**table.** 문자열 관련 주요 클래스
|클래스|설명|
|-|-|
|String|문자열을 저장하고 조작할 때 사용|
|StringBuilder|효율적인 문자열 조작 기능이 필요할 때 사용|
|StringTokenizer|구분자로 연결된 문자열을 분리할 때 사용|

### 📌 String 클래스
- String 클래스는 문자열을 저장하고 조작할 때 사용됨
- 문자열 리터럴은 자동으로 String 객체로 생성
- String 클래스의 다양한 생성자를 이용해서 직접 객체를 생성할 수도 있음

```java
// 기본 문자셋으로 byte 배열을 디코딩해서 String 객체로 생성
String str = new String(byte[] bytes);

// 특정 문자셋으로 byte 배열을 디코디애서 String 객체로 생성
String str = new String(byte[] bytes, String charseName);
```

**[인코딩]**
- **인코딩(encoding):** 사람이 인지할 수 있는 문자(언어)를 약속된 규칙에 따라 컴퓨터가 이해하는 언어 (0과 1)로 이루어진 코드로 바꾸는 것
- 프로그램을 개발하다 보면, byte 배열을 문자열로 변환하는 경우가 있음.
- (+) **TCP/UDP 네트워크 통신에 사용됨. 네트워크는 바이트 단위로 전송함.**
- (+) *e.g.* 네트워크 통신으로 얻은 byte 배열을 원래 문자열로 변환하는 경우
- 한글 1자를 UTF-8로 인코딩하면 3바이트, EUC-KR로 인코딩하면 2바이트가 됨
- 인코딩할 때 사용한 문자셋으로 **디코딩(decoding)** 을 해야만 한글이 올바르게 **복원**이 됨.

### 📌 StringBuilder 클래스
- 잦은 문자열 변경 작업을 해야 한다면  String보다는 StringBuilder가 좋음
- StringBuilder는 내부 버퍼(데이터를 저장하는 메모리)에 문자열을 저장해두고 그 안에서 추가, 수정, 삭제 작업을 하도록 설계함.

**table.** StringBuilde의 메소드와 설명
|리턴 타입|메소드(매개변수)|설명|
|-|-|-|
|StringBuilder|append(기본값|문자열)|문자열을 끝에 추가|
|StringBuilder|insert(위치, 기본값|문자열)|문자열을 지정 위치에 추가|
|StringBuilder|delete(시작 위치, 끝 위치)|문자열 일부를 삭제|
|StringBuilder|replace(시작 위치, 끝 위치, 문자열)|문자열 일부를 대체|
|String|toString()|완성된 문자열을 리턴|

- toString()을 제외한 다른 메소드는 StringBuilder를 다시 리턴하기 때문에 연이어서 다른 메소드를 호출할 수 있는 메소드 체이닝(chaining) 패턴을 사용함

### 📌 StringTokenizer 클래스
- 문자열에 여러 종류가 아닌 한 종류의 **구분자(delimtier)** 만 있다면 StringTokenizer를 사용할 수도 있음.
- **StringTokenizer:** 문자로 구분함
- **split() 메소드:** 정규 표현식으로 구분함

**table.** StringTokenizer의 메소드와 설명
|리턴 타입|메소드(매개변수)|설명|
|-|-|-|
|int|countTokens()|분리할 수 있는 문자열의 총 수|
|boolean|hasMoreTokens()|남아 있는 문자열이 있는지 여부|
|String|nextToken()|문자열을 하나씩 가져옴|

## 12.06 포장 클래스
### 📌 포장 객체(Wrapper class, 랩퍼 클래스)
- 기본 타입의 값을 갖는 객체.
- 기본 타입과 관련된 처리를 하는 메서드(기능)를 가지도록 클래스를 만듦.
- 포장하고 있는 기본 타입의 값을 변경할 수 없고, 단지 객체로 생성하는 목적.

### 📌 박싱과 언박싱
- **박싱(Boxing):** 기본 타입 값을 포장 객체로 만드는 과정. 포장 클래스 변수에 기본 타입 값이 대입 시 발생함.
- **언박싱(Unboxing):** 포장 객체에서 기본 타입 값을 얻어내는 과정. 기본 타입 변수에 포장 객체가 대입 시 발생함.

```java
Integer obj = 100; // 박싱
int value = obj; // 언박싱

int value = obj + 50; // 언박싱 후 연산
```

### 📌 문자열을 기본 타입 값으로 변환
- 포장 클래스는 문자열을 기본 타입 값으로 변환할 때도 사용
- 대부분의 포장 클래스에는 *'parse+기본타입'* 명으로 되어 있는 **정적(static) 메소드**가 있음.

## 12.07 수학 클래스
- **Math 클래스:** 수학 계산에 사용할 수 있는 정적 메소드를 제공

|구분|코드|
|-|-|
|절대값|Math.abs()|
|올림값|Math.ceil()|
|버림값|Math.floor()|
|최대값|Math.max()|
|최소값|Math.min()|
|랜덤값|Math.random()|
|반올림값|Math.round()|


---
여기까지



## 12.08 날짜와 시간 클래스



## 12.09 형식 클래스



## 12.10 정규 표현식 클래스



## 12.11 리플렉션



## 12.12 어노테이션





