# Chapter 10 라이브러리와 모듈
## 10.01 라이브러리
- **라이브러리(library):** 는 프로그램 개발 시 활용할 수 있는 클래스와 인터페이스를 모아놓은 것을 말함.
- 일반적으로 JAR(Java ARchive) 압축파일(*jar) 형태. 클래스와 인터페이스의 바이트코드 파일(~.class)들이 압축.

### 📌 라이브러리 추가하기
- 라이브러리 JAR 파일을 사용하려면 ClassPath(클래스를 찾기 위한 경로)에 추가
- **콘솔에서 실행할 경우:** java 명령어를 실행할 때 - classpath로 제공 (또는 CLASSPATH 환경 변수에 경로 추가)
- **이클립스 프로젝트에서 실행할 경우:** 프로젝트의 Build Path에 추가

## 10.02 모듈
- **모듈(module):** 패키지 관리 기능까지 포함된 라이브러리. 일부 패키지를 은닉하여 접근할 수 없게끔 할 수 있음.
- **의존 모듈**을 모듈 기술자(module-info.jaca)에 기술할 수 있어 모듈간 의존관계를 파악하기 쉬움
- 대규모 응용프로그램은 기능별로 모듈화해서 개발.
- **재사용성** 및 **유지보수**에 유리

## 10.03 응용프로그램 모듈화
응용프로그램은 하나의 프로젝트로도 개발이 가능하지만, 이것을 기능별로 서브 프로젝트(모듈)로 쪼갠 다음 조합해서 개발할 수도 있다.

## 10.04 모듈 배포용 JAR 파일
다른 모듈에서 쉽게 사용할 수 있게 바이트코드 파일(.class)로 구성된 배포용 JAR 파일을 모듈별로 따로 생성할 수 있음

## 10.05 패키지 은닉
모듈은 모듈 기술자(module-infro.java)에서 **exports** 키워드를 사용해 내부 패키지 중 외부에서 사용할 패키지를 지정함. exports되지 않은 패키지는 자동적으로 은닉됨

## 10.06 전이 의존
프로젝트 A와 모듈 a1, a2이 의존관계라면, 프로젝트 A는 직접적으로 두 모듈을 requires하고 있다고 함.

## 10.07 집합 모듈
- **집합 모듈:** 여러 모듈을 모아놓은 모듈임.
- 자주 사용되는 모듈들을 일일이 requires하는 번거로움을 피하고 싶을 때 집합 모듈을 생성하면 편리함.
- 집합 모듈은 자체적인 패키지를 가지지 않고, 모듈 기술자에 전이 의존 설정만 함.

## 10.08 리플렉션 허용
- **리플렉션(reflection):** 실행 도중에 타입(클래스, 인터페이스 등)을 검사하고 구성 멤버를 조사하는 것을 말함.
- 은닉된 패키지는 기본적으로 다른 모듈에 의해 리플렉션을 허용하지 않으나, 예외는 있음.

## 10.09 자바 표준 모듈
### 📌 표준 라이브러리
- JDK가 제공하는 표준 라이브러리는 Java 9부터 모듈화됨
- 응용프로그램을 실행하는 데 필요한 모듈만으로 구성된 작은 사이즈의 자바 실행 환경(JRE)
- Java 17의 전체 모듈 그래프 [링크](https://docs.oracle.com/en/java/javase/17/docs/api/java.se/module-summary.html)
