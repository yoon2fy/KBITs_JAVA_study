# Chapter 17 스트림 요소 처리

## 17.01 스트림이란?
### 📚 스트림(Stream)
- 컬렉션 및 배열의 요소를 반복 처리하기 위해 스트림 사용
- 요소들이 하나씩 흘러가면서 처리된다는 의미
- List 컬렉션의 `stream()` 메소드로 Stream 객체를 얻고, `forEach()` 메소드로 요소를 어떻게 처리할지를 **람다식**으로 제공

```java
Stream<String> stream = list.stream();
stream.forEach(item -> // item 처리);
```

### 📖 스트림과 Iterator의 차이점
1. 내부 반복자이므로 처리 속도가 빠르고 병렬 처리에 효율적
2. 람다식으로 다양한 요소 처리를 정의
3. 중간 처리와 최종 처리를 수행하도록 **파이프 라인**을 형성


## 17.02 내부 반복자
### 📚 내부 반복자
- 요소처리 방법을 컬렉션 내부로 주입시켜서 요소를 반복 처리
- 개발자 코드에서 제공한 데이터 처리 코드(람다식)를 가지고 컬렉션 내부에서 요소를 반복 처리
- 내부 반복자는 **멀티 코어 CPU를 최대한 활용**하기 위해 요소들을 분배시켜 **병렬 작업** 가능


## 17.03 중간 처리와 최종 처리
### 📚 스트림 파이프라인(Pipeline)
- 컬렉션의 오리지널 스트림 뒤에 필터링 중간 스트림이 연결될 수 있고, 그 뒤에 매핑 중간 스트림이 연결될 수 있음
- 일단 스트림으로 만들어야함. 그 다음에 필터링도 하고, 매핑도 하고, 집계도 할 수 있음
- 오리지널 스트림과 집계 처리 사이의 중간 스트림들은 최종 처리를 위해 요소를 걸러내거나 **(필터링)**, 요소를 변환시키거나 **(매핑)**, 정렬하는 작업을 수행함.

 ### 📖 순서 중요
1. 스트림에 넣고
2. 조건에 맞는 것만 필터링 해서
3. 모두 동일한 처리를 한 후
4. count, sum, avg 등의 집계를 함.

```java
// Student 스트림
Stream<Student> studentStream = list.stream();

// score 스트림
IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());

// 평균 계산
double avg = scoreStream.average().getAsDouble();
```

 ### 📖 메소드 체이닝 패턴
 1. 스트림에 넣고
 2. 모두 동일한 처리를 한 후
 3. Count, sum, avg 등의 집계를 함

```java
double avg = list.stream()
  .mapToInt(student -> student.getScore())
  .average()
  .getAsDouble();
```

## 17.04 리소스로부터 스트림 얻기
### 📚 스트림 인터페이스
- java.util.stream 패키지에는 BaseStream 인터페이스를 부모로 한 자식 인터페이스들은 상속 관계임
- BaseStream에는 모든 스트림에서 사용할 수 있는 공통 메소드들이 정의됨.
- 기본 스트림: int, long, double
- 객체 스트림: 기본 스트림 이외( Stream<String>, Stream<Member>, ... )
- **IntStream은 [ 1, 2, 3, ... ] 기본형이 들어있는 스트림**
- Stream<Integer>는 [ new Integer(1), new Integer(2), ... ] 참조형이 들어있는 스트림
➡️ 데이터 타입별 스트림을 만들어서 써야함.
➡️ 데이터 타입 별 할 수있는 처리 작업이 다름 (e.g. 객체 스트림은 바로 평균을 구할 수 없음.)


 ### 📖 컬렉션으로부터 스트림 얻기
 - java.util.Collection 인터페이스는 `stream()`과  `parallelStream()` 메소드를 가지고 있어, 자식 인터페이스인 List와 Set 인터페이스를 구현한 모든 컬렉션에서 객체 스트림을 얻을 수 있음.

**table.** 스트림 인터페이스
|소스|리턴타입|No.|메소드(매개변수)|
|-|-|-|-|
|List 컬렉션, Set 컬렉션|Stream<T>|01|java.util.Collection.stream()|
|                       |         |02|java.util.Collection.parallelStream()|

 ### 📖 배열로부터 스트림 얻기
 - 다양한 타입의 배열을 스트림객체로 만들어야 스트림에서 제공하는 함수를 사용할 수 있음.

**table.** 스트림 인터페이스
|소스|리턴타입|No.|메소드(매개변수)|
|-|-|-|-|
|배열|Stream<T>|01|Arrays.stream(T[ ])|
|    |         |02|Stream.of(T[ ])|
|    |IntStream|01|Arrays.stream(int[ ])|
|    |         |02|IntStream.of(int[ ])|
|    |LongStream|01|Arrays.stream(long[ ])|
|    |          |02|LongStream.of(long[ ])|
|    |DoubleStream|01|Arrays.stream(double[ ])|
|    |            |02|DoubleStream.of(double[ ])|

 ### 📖 숫자 범위로부터 스트림 얻기
 - IntStream 또는 LongStream의 정적 메소드인 `range()`와 `rangeClosed()` 메소드로 특정 범위의 정수 스트림을 얻을 수 있음.
 - 범위를 설정하여 스트림을 만들 수 있음.

**table.** 스트림 인터페이스
|소스|리턴타입|No.|메소드(매개변수)|
|-|-|-|-|
|int 범위|IntStream|01|IntStream.range(int, int)|
|        |         |02|IntStream.rangeClosed(int, int)|
|long 범위|IntStream|01|LongStream.range(long, long)|
|        |         |02|LongStream.rangeClosed(long, long)|

 ### 📖 파일로부터 스트림 얻기
 - java.nio.file.Files의 `lines()` 메소드로 텍스트 파일의 행 단위 스트림을 얻을 수 있음

**table.** 스트림 인터페이스
|소스|리턴타입|No.|메소드(매개변수)|
|-|-|-|-|
|디렉토리|Stream<Path>||Files.list(Path)|
|텍스트 파일|Stream<String>||Files.list(Path, Charset)|

 ### 📖 랜덤한 수로 스트림 얻기

**table.** 스트림 인터페이스
|소스|리턴타입|No.|메소드(매개변수)|
|-|-|-|-|
|랜덤 수|DoubleStream||Random.doubles(...)|
|       |IntStream||Random.ints()|
|       |LongStream||Random.longs()|


## 17.05 요소 걸러내기(필터링)
### 📚 필터링
- 필터링은 요소를 걸러내는 중간 처리 기능
- **distinct() 메소드:** 요소의 **중복을 제거**
- **filter() 메소드:** 매개값으로 주어진 Predicate(조건식)가 true를 리턴하는 요소 필터링


## 17.06 요소 변환(매핑)
### 📚 매핑
- 스트림의 요소를 다른 요소로 변환하는 중간 처리 기능
- 스트림에 들어있는 요소에 모두 같은 처리를 하는 경우 사용
- 매핑 메소드: mapXxx(), asDoubleStream(), asLongStream(), boxed(), flatMapXxx() 등
- mapXxx() 메소드: 요소를 다른 요소로 변환한 새로운 스트림을 리턴

### 📖 매핑의 주요 메소드

|리턴 타입|메소드(매개변수)|요소 ⭢ 변환 요소|
|-|-|-|
|Stream<R>|map(Function<T, R>)| T ⭢ R |
|IntStream|mapToInt(ToIntFunction<T>)| T ⭢ int |
|LongStream|mapToInt(ToLongFunction<T>)| T ⭢ long |
|DoubleStream|mapToInt(ToDoubleFunction<T>)| T ⭢ double |
|Stream<U>|mapToObj(IntFunction<U>) | int ⭢ U |
|         |mapToObj(LongFunction<U>)| long ⭢ U |
|         |mapToObj(DoubleFunction<U>)| double ⭢ U |
|DoubleStream|mapToDouble(IntToDoubleFunction)|int ⭢ double|
|            |mapToDouble(LongToDoubleFunction)|long ⭢ double|
|IntStream|mapToInt(DoubleToIntFunction)|double ⭢ int|
|LongStream|mapToLong(DoubleToLongFunction)|double ⭢ long|

### 📖 매핑의 간편화 메소드
- 기본 타입간의 변환이거나 기본 타입 요소를 래퍼(Wrapper) 객체 요소로 변환하려면 간편화 메소드를 사용할 수 있음

|리턴타입|메소드(매개변수)|설명|
|-|-|-|
|LongStream|asLongStream()| int ⭢ long |
|DoubleStream|asDoubleStream() |int ⭢ double|
|Stream<Integer>|boxed()|int ⭢ Integer|
|Stream<Long>|boxed()|long ⭢ Long|
|Stream<Double>|boxed()|double ⭢ Double|

## 17.07 요소 정렬
### 📚 정렬
- 요소를 오름차순 또는 내림차순으로 정렬하는 중간 처리 기능

|리턴타입|메소드(매개변수)|설명|
|-|-|-|
|Stream<T>|sorted()|Comparable 요소를 정렬한 새로운 스트림 생성|
|Stream<T>|sorted(Comparator<T>)|요소를 Comparator에 따라 정렬한 새 스트림 생성|
|DoubleStream|sorted()|double 요소를 올림차순으로 정렬|
|IntStream|sorted()|int 요소를 올림차순으로 정렬|
|LongStream|sorted()|long 요소를 올림차순으로 정렬|


## 17.08 요소를 하나씩 처리(루핑)
- 루핑(looping): 스트림에서 요소를 하나씩 반복해서 가져와 처리하는 것.
- `peek()`와 `forEach()`가 있다.
- peek()와 forEach()는 동일하게 요소를 루핑하지만, peek()은 중간 처리 메소드이고, forEach()는 최종처리 메소드임. 따라서 peek()은 최종 처리가 뒤에 붙지 않으면 동작하지 않음.


## 17.09 요소 조건 만족 여부(매칭)
### 📚 매칭
- 요소들이 특정 조건에 만족하는지 여부를 조사하는 최종 처리 기능
- allMatch(), anyMatch(), noneMatch() 메소드는 매개값으로 주어진 Predicate가 리턴하는 값에 따라 T/F를 리턴

|메소드|조사내용|
|-|-|
|allMatch()|모든 요소가 만족하는지 여부|
|anyMatch()|최소한 하나의 요소가 만족하는지 여부|
|noneMatch()|모든 요소가 만족하지 않는지 여부|

## 17.10 요소 기본 집계
### 📚 집계(Aggregat)
- 최종 처리 기능으로 요소들을 처리해서 카운팅, 합계, 평균값, 최대값, 최소값 등 하나의 값으로 산출하는 것
- 즉, 대량의 데이터를가공해서 하나의 값으로 축소하는 **리덕션(Reduction)** 이라고 볼 수 있음.

**table.** 스트림이 제공하는 기본 집계
|리턴 타입|메소드(매개변수)|설명|
|-|-|-|
|long|count()|요소 개수|
|OptionalXXX|findFirst()|첫 번째 요소|
|Optional<T>|max(Comparator<T>)|최대 요소|
|OptionalXXX|max()|최대 요소|
|Optional<T>|min(Comparator<T>)|최소 요소|
|OptionalXXX|min()|최소 요소|
|OptionalDouble|average()|요소 평균|
|int, long, double|sum()|요소 총합|


### 📚 Optional 클래스
- `isPresent()` 메소드가 true를 리턴할 때만 집계값 얻기 
- `orElse()` 메소드로 집계값이 없을 경우 대비해서 디폴트 값
- `ifPresent()` 메소드로 집계값이 있을 경우에만 동작하는 Consumer 람다식 제공하기

|메소드|조사내용|리턴 타입|
|-|-|-|
|isPresent()|집계값이 있는지 여부|boolean|
|orElse()|집계값이 없을 경우 디폴트 값 설정|T, double, int, long|
|ifPresent()|집계값이 있을 경우 Consumer에서 처리|void|


## 17.11 요소 커스텀 집계
- 스트림은 기본 집계 메소드인 sum(), average(), count(), max(), min()을 제공하지만, 다양한 집계 결과물을 만들 수 있도록 `reduce()` 메소드도 제공함.

## 17.12 요소 수집
### 📚 필터링한 요소 수집
- Stream의 collection(Collector<T, A, R> collector) 메소드는 필터링또는 매핑된 요소들을 새로운 컬렉션에 수집하고, 이 컬렉션을 리턴함.
- 매개값인 Collector는 어떤 요소를 어떤 컬렉션에 수집할 것인지를 결정함.
- 타입파라미터의 T: 요소
- A: 누적기(accumulator)
- R: 요소가 저장될 컬렉션

➡️ T 요소를 A 누적기가 R에 저장한다는 의미임.

|리턴 타입|메소드(매개변수)|인터페이스|
|-|-|-|
|R|collect(Collector<T, A, R> collector)|Stream|

|리턴 타입|메소드(매개변수)|설명|
|-|-|-|
|Collector<T, ?, List<T>>|toList()|T를 List에 저장|
|Collector<T, ?, Set<T>>|toSet()|T를 Set에 저장|
|Collector<T, ?, Map<K, U>>|toMap(Function<T, K> keyMapper, Function<T, U> valueMapper)|T를 K와 U로 매핑하여 K를 키고, U를 값으로 Map에 저장|
 
### 📚 요소 그룹핑
- collect() 메소드는 컬렉션의 요소들을 그룹핑해서 Map 객체를 생성하는 기능도 제공함.

|리턴 타입|메소드|
|-|-|
|Collector<T, ?, Map<K, List<T>>>|groupingBy(Function<T, K> classifier)|

## 17.13 요소 병렬 처리 (Parallel Operation)
- 멀티 코어 CPU 환경에서 전체 요소를 분할해서 각각의 코어가 병렬적으로 처리하는 것을 말함.
- **목적:** 작업 처리 시간을 줄이는 것

### 📚 동시성과 병렬성
- 멀티 스레드는 동시성(Concurrency) 또는 병렬성(Parallelism)으로 실행됨.
- **동시성:** 멀티 작업을 위해 멀티 스레드가 하나의 코어에서 번갈아 가며 실행하는 것
- **병렬성:** 멀티 작업을 위해 멀티 코어를 각각 이용해서 병렬로 실행하는 것
- **데이터 병렬성(Data parallelism):** 전체 데이터를 분할해서 서브 데이터셋으로 만들고, 이 서브 데이터셋들을 병렬 처리해서 작업을 빨리 끝내는 것을 말함.
- **작업 병렬성(Task parallelism):** 서로 다른 작업을 병렬 처리하는 것을 말함. (e.g. 서버 프로그램: 서버는 각각의 클라이언트에서 요청한 내용을 개별 스레드에서 병렬로 처리함.)

### 📚 포크조인 프레임워크(ForkJoin Framework)
- 자바 병렬 스트림은 요소들을 병렬 처리하기 위해 포크조인 프레임워크를 사용함.
   
1. **포크 단계**에서 전체 요소들을 서브 요소셋으로 분할하고, 각각의 서브 요소셋을 멀티 코어에서 병렬로 처리함.
2. **조인 단계**에서 서브 결과를 결합해서 최종 결과를 만들어냄.

### 📖 포그조인 프레임워크와 스레드풀의 관계
- 포크조인 프레임워크는 병렬 처리를위해 **스레드풀**을 사용함.
- 각각의 코어에서 서브 요소셋을 처리하는 것은 작업 스레드가 해야 하므로 스레드 관리가 필요함.
- 포크조인 프레임워크는 ExecutorService의 구현 객체인 ForkJoinPool을 사용해서 작업 스레드를 관리함.포

### 📚 병렬 스트림 사용
- `parallelStream()` 메소드는 컬렉션(List, Set)으로부터 병렬 스트림을 바로 리턴함.
- `parallel()` 메소드는 기존 스트림을 병렬 처리 스트림으로 변환함.


### 📚 병렬 처리 성능
- 스트림 병렬 처리가 스트림 순차 처리보다 항상 실행 성능이 좋다고 판단해서는 안됨.
1. 요소의 수와 요소당 처리 시간
2. 스트림 소스의 종류
3. 코어의 수

### 📖 요소의 수와 요소당 처리 시간
- 컬렉션에 전체 요소의 수 ⭡ 요소당 처리 시간 ⭣ ➡️ 일반 스트림이 더 빠를 수 있음
- 왜냐하면, 병렬 처리는 포크 및 조인 단계가 있고, 스레드 풀을 생성하는 추가적인 비용이 발생하기 때문

### 📖 스트림 소스의 종류
- **ArrayList**, **배열**: 포크 단계에서 요소를 쉽게 분리할 수 있음 ➡️ 시간절약
- **HashSet**, **TreeSet**, **LinkedList** : 요소 분리가 쉽지 않음 ➡️ 상대적으로 느림

### 📖 코어의 수
- CPU 코어(Core)의 수 ⭡ ➡️ 빠름
- 병렬 스트림은 스레드 수가 증가하여 동시성이 일어나므로 오히려 느려짐.
