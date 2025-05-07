# Chapter 15 컬렉션 자료구조
## 15.01 컬렉션 프레임워크
- 널리 알려진 자료구조를 바탕으로 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 관련 인터페이스와 클래스들을 포함시켜 놓은 java.util 패키지
- 주요 인터페이스: List, Set, Map

**table.** 인터페이스 분류
|No.|인터페이스 분류|특징|구현클래스|
|:-:|:-:|:-:|:-:|
|01|List|순서 O, 중복 O|ArrayList, Vector, LinkedList|
|02|Set|순서 X, 중복 X|HashSet, TreeSet|
|03|Map|키와 값으로 구성된 엔트리 저장|HashMap, Hashtable, TreeMap, Properties|

</br>

## 15.02 List 컬렉션
- 객체를 인덱스로 관리하기 때문에 객체를 저장하면 인덱스가 부여되고 인덱스로 객체를 검색, 삭제할 수있는 기능을 제공

|기능|No.|메소드|설명|
|:-:|:-:|:-:|-|
|객체 추가|01|boolean add(E e)|주어진 객체를 맨 끝에 추가|
||02|void add(int index, E element)|주어진 인덱스에 객체를 추가|
||03|set(int index, E element)|주어진 인덱스의 객체를 새로운 객체로 바꿈|
|객체 검색|01|boolean contains(Object o)|주어진 객체가 저장되어 있는지 여부|
||02|E get(int index)|주어진 인덱스에 저장된 객체를 리턴|
||03|isEmpty()|컬렉션이 비어 있는지 조사|
||04|int size()|저장되어 있는 전체 객체 수를 리턴|
|객체 삭제|01|void clear()|저장된 모든 객체를 삭제|
||02|E remove(int index)|주어진 인덱스에 저장된 객체를 삭제|
||03|boolean remove(Object o)|주어진 객체를 삭제|

### 📚 ArrayList
- ArrayList에 객체를 추가하면 내부 배열에 객체가 저장되고 제한 없이 객체를 추가할 수 있음
- 객체의 번지를 저장, 동일한 객체를 중복 저장 시 동일한 번지가 저장, Null 저장 가능
- ArrayList 컬렉션에 객체를 추가 시 인덱스 0번부터 차례대로 저장
- 특정 인덱스의 객체를 제거하거나 삽입하면 **전체가 앞/뒤로 1씩 당겨지거나 밀림**
- 빈번한 객체 삭제와 삽입이 일어나는 곳에선 바람직하지 않음

```java
List<E> list = new ArrayList<E>(); // E에 지정된 타입의 객체만 저장
List<E> list = new ArrayList<>();  // E에 지정된 타입의 객체만 저장
List list = new ArrayList();       // 모든 타입의 객체를 저장
```

### 📚 Vector
- 동기화된 메소드로 구성되어 있어 **멀티 스레드가 동시에 Vector() 메소드를 실행할 수 없음**
- 멀티 스레드 환경에서는 안전하게 객체를 추가 또는 삭제할 수 있음

```java
List<E> list = new Vector<E>(); // E에 지정된 타입의 객체만 저장
List<E> list = new Vector<>();  // E에 지정된 타입의 객체만 저장
List list = new Vector();       // 모든 타입의 객체를 저장
```

### 📚 LinkedList
- 인접 객체를 체인처럼 연결해서 관리.
- **객체 삭제와 삽입이 빈번한 곳에서 ArrayList보다 유리**

```java
List<E> list = new LinkedList<E>(); // E에 지정된 타입의 객체만 저장
List<E> list = new LinkedList<>();  // E에 지정된 타입의 객체만 저장
List list = new LinkedList();       // 모든 타입의 객체를 저장
```

### 📖 내부 구조 차이
|항목|ArrayList|LinkedList|
|:-:|-|-|
|자료 저장 방식|동적 배열(Dynamic Array)|이중 연결 리스트(Doubly Linked List)|
|인덱스 접근|배열 기반이므로 빠름|순차 탐색이 필요하여 느림|
|메모리 구조|요소들이 연속적인 메모리 공간에 저장됨|요소들이 노드 단위로 분산 저장됨 (각 노드는 이전, 다음 노드를 가리킴)|

1. ArrayList
- 내부적으로 배열 크기가 부족할 경우 **2배씩 배열을 늘리며 복사**함 → 성능 부하 유발 가능
- RandomAccess 인터페이스 구현 (빠른 인덱스 접근을 명시적으로 표시)

2. LinkedList
- 각 요소가 노드 객체로 존재하며, 이전/다음 노드를 가리키는 포인터가 있음 → 포인터 메모리 추가 사용
- Queue, Deque의 특성을 함께 가짐 (예 : `poll()`, `offer()` 등 지원)

### 🔖 ArrayList 동작
- List<String> list = new ArrayList<>();
- 처음엔 내부 배열이 크기 10짜리로 생성(기본값)
- 사용자가 10개 이상 요소를 추가하면, ArrayList는 자동으로 크기를 늘림.

  → **새로운 더 큰 배열을 만들고, 기존 요소들을 새 배열로 복사**
  
  → 그 다음에 새 요소를 추가

</br>

## 15.03 Set 컬렉션
- Set 컬렉션은 저장 순서가 유지되지 않음
- 객체를 중복해서 저장할 수 없고, 하나의 Null만 저장할 수 있음 (수학의 집합 개념)

|기능|No.|메소드|설명|
|:-:|:-:|:-:|-|
|객체 추가|01|boolean add(E e)|주어진 객체를 성공적으로 저장하면 true를 리턴하고 중복 객체 false를 리턴|
|객체 검색|01|boolean contains(Object o)|주어진 객체가 저장되어 있는지 여부|
||02|isEmpty()|컬렉션이 비어 있는지 조사|
||03|Iterator<E> iterator()|저장된 객체를 한 번씩 가져오는 반복자 리턴|
||04|int size()|저장되어 있는 전체 객체 수를 리턴|
|객체 삭제|01|void clear()|저장된 모든 객체를 삭제|
||02|boolean remove(Object o)|주어진 객체를 삭제|

### 📚 HashSet
- **iterator() 메소드:** 반복자를 얻어 Set 컬렉션의 객체를 하나씩 가져옴

```java
Set<E> set = new HashSet<>();
Iterator<E> iterator = set.iterator();
```

|리턴 타입| 메소드명|설명|
|:-:|:-:|-|
|boolean|hasNext()|가져올 객체가 있으면 true를 리턴하고, 없으면 fasle를 리턴|
|E|next()|컬렉션에서 하나의 객체를 가져옴|
|void|remove()|next()로 가져온 객체를 Set 컬렉션에서 제거|

</br>

## 15.04 Map 컬렉션
- 키와 값으로 구성된 엔트리 객체를 저장
- 키: 중복 저장 X, 값: 중복 저장 O
- 기존에 저장된 키와 동일한 키로 값을 저장하면 새로운 값으로 대치

**table.** Map 컬렉션 주요 메소드
|기능|No.|메소드|설명|
|:-:|:-:|:-:|-|
|객체 추가|01|V put(K key, V value)|주어진 키와 값을 추가. 저장이 되면 값을 리턴|
|객체 검색|01|boolean containsKey(Object key)|주어진 키가 있는지 여부|
||02|boolean containsValue(Object value)|주어진 값이 있는지 여부|
||03|Set<Map.Entry<K, V>> entrySet()|키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아서 리턴|
||04|V get(Object key)|주어진 키의 값을 리턴|
||05|boolean isEmpty()|컬렉션이 비어 있는지 여부|
||06|Set<K> keySet()|모든 키를 Set 객체에 담아서 리턴|
||07|int size()|저장된 키의 총 수를 리턴|
||06|Collection<V> values()|저장된 모든 값 Collection에 담아서 리턴|
|객체 삭제|01|void clear()|모든 Map.Entry(키와 값)를 삭제|
||02|V remove(Object key)|주어진 키와 일치하는 Map.Entry 삭제. 삭제가 되면 값을 리턴|


```java
Map<String, Integer> map = new HashMap<String, Integer>(); // <K, V>에 지정된 타입의 객체만 저장
Map<String, Integer> map = new HashMap<>();                // <K, V>에 지정된 타입의 객체만 저장
Map map = new HashMap<>();                                 // 모든 타입의 객체를 저장
```

### 📚 Hash tabke
- 동기화된 메소드로 구성되어 있어 멀티 스레드가 동시에 Hashtable의 메소드들을 실행 불가
- **멀티 스레드 환경**에서도 안전하게 객체를 추가, 삭제할 수 있음.

```java
Map<String, Integer> map = new Hashtables<String, Integer>();
Map<String, Integer> map = new Hashtables<>();
```

### 📚 Properties
- Properties는 **Hashtable의 자식 클래스. 키와 값을 String 타입으로 제한한 컬렉션**
- 주로 확장자가 `.properties`인 프로퍼티 파일을 읽을 때 사용
- 프로퍼티 파일은 키와 값이 `=` 기호로 연결된 텍스트 파일
- Properties 객체를 생성하고, `load()` 메소드로 프로퍼티 파일의 내용을 **메모리**로 로드

**[database.properties]** 실제 프로젝트에서는 인증키 등은 java 코드에 넣지 않고 별도로 관리한다
1. 별도의 인증번호 관리용 java 파일을 만들어 관리
2. properties 파일로 관리
3. yml 파일로 관리

</br>

## 15.05 검색 기능을 강화시킨 컬렉션
### 📚 TreeSet
- 이진 트리를 기반으로 한 Set 컬렉션
- 여러 개의 노드가 트리 형태로 연결된 구조
- 루트 노드에서 시작해 각 노드에 최개 2개의 노드를 연결할 수 있음
- TreeSet에 객체를 저장하면 부모 노드의 객체와 비교해서 낮은 것은 왼쪽 자식 노드에, 높은 것은 오른쪽 자식 노드에 저장함.
- **TreeSet 컬렉션을 생성하는 방법:** Set 타입 변수에 대입해도 되지만 TreeSet 타입으로 대입한 이유는 검색 관련 메소드가 TreeSet에만 정의되어 있기 때문

```java
TreeSet<E> treeSet = new TreeSet<E>();
TreeSet<E> treeSet = new TreeSet<>();
```

**table.** TreeSet 컬렉션 메소드
|리턴 타입|메소드|설명|
|:-:|:-:|-|
|E|first()|제일 낮은 객체를 리턴|
|E|last()|제일 높은 객체를 리턴|
|E|lower(E e)|주어진 객체보다 바로 아래 객체를 리턴|
|E|higher(E e)|주어진 객체보다 바로 위 객체를 리턴|
|E|floor(E e)|주어진 객체와 동등한 객체가 있으면 리턴. 만약 없다면 주어진 객체의 바로 아래의 객체를 리턴|
|E|ceiling(E e)|주어진 객체와 동등한 객체가 있으면 리턴. 만약 없다면 주어진 객체의 바로 위의 객체를 리턴|
|E|pollFirst()|제일 낮은 객체를 꺼내오고 컬렉션에서 제거함|
|E|pollLast()|제일 높은 객체를 꺼내오고 컬렉션에서 제거함|
|Iterator<E>|descendingIterator()|내림차순으로 정렬된 Iterator를 리턴|
|NavigableSet<E>|descendingSet()|내림차순으로 정렬된 NavigableSet을 리턴|
|NavigableSet<E>|headSet(E toElement, boolean inclusive)|주어진 객체보다 낮은 객체들을 NavigableSet으로 리턴. 주어진 객체 포함 여부는 두 번째 매개값에 따라 달라짐|
|NavigableSet<E>|tailSet(E fromElement, boolean inclusive)|주어진 객체보다 높은 객체들을 NavigableSet으로 리턴. 주어진 객체 포함 여부는 두 번째 매개값에 따라 달라짐|
|NavigableSet<E>|subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)|시작과 끝으로 주어진 객체 사이의 객체들을 NavigableSet으로 리턴. 시작과 끝 객체의 포함 여부는 두/네 번째 매개값에 따라 달라짐|


### 📚 TreeSet
- 이진 트리를 기반으로 한 Map 컬렉션. 키와 값이 저장된 엔트리 저장 **--> 검색에 특화**
- 부모 키 값과 비교해서 낮은 것은 왼쪽, 높은 것은 오른쪽 자식 노드에 Entry 객체를 저장.

```java
TreeMap<K, V> treeMap = new TreeMap<K, V>();
TreeMap<K, V> treeMap = new TreeMap<>();
```

**table.** TreeMap 메소드
|리턴 타입|메소드|설명|
|:-:|:-:|-|
|Map.Entry<K, V>|firstEntry()|제일 낮은 Map.Entry를 리턴|
|Map.Entry<K, V>|lastEntry()|제일 높은 Map.Entry를 리턴|
|Map.Entry<K, V>|lowerEntry(K key)|주어진 키보다 바로 아래 Map.Entry를 리턴|
|Map.Entry<K, V>|higherEntry(K key)|주어진 키보다 바로 위 Map.Entry를 리턴|
|Map.Entry<K, V>|floorEntry(K key)|주어진 키와 동등한 키가 있으면 해당 Map.Entry를 리턴. 없다면, 주어진 키 바로 아래의 Map.Entry를 리턴|
|Map.Entry<K, V>|ceilingEntry(K key)|주어진 키와 동등한 키가 있으면 해당 Map.Entry를 리턴. 없다면, 주어진 키 바로 위의 Map.Entry를 리턴|
|Map.Entry<K, V>|pollFirstEntry(K key)|제일 낮은 Map.Entry를 꺼내오고 컬렉션에서 제거|
|Map.Entry<K, V>|pollLastEntry(K key)|제일 높은 Map.Entry를 꺼내오고 컬렉션에서 제거|
|NavigableSet<K>|descendingKeySet()|내림차순으로 정렬된 키의 NavigableSet을 리턴|
|NavigableMap<K, V>|descendingMap()|내림차순으로 정렬된 Map.Entry의 NavigableMap을 리턴|
|NavigableMap<K, V>|headMap(K toKey, boolean inclusive)|주어진 키보다 낮은 Map.Entry들을 NavigableMap으로 리턴. 주어진 키의 Map.Entry 포함 여부는 두 번째 매개값에 따라 달라짐|
|NavigableMap<K, V>|tailMap(K fromKey, boolean inclusive)|주어진 객체보다 높은 Map.Entry들을 NavigableSet으로 리턴. 주어진 객체 포함 여부는 두 번째 매개값에 따라 달라짐|
|NavigableMap<K, V>|subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive)|시작과 끝으로 주어진 키 사이의 Map.Entry들을 NavigableMap 컬렉션으로 반환. 시작과 끝 키의 Map.Entry 포함 여부는 두/네 번째 매개값에 따라 달라짐|

### 🔖 TreeSet 자동정렬 기능
TreeSet에 넣어주는 경우 자동정렬 기능이 있음. 어떤 필드를 기준으로 정렬을 해야할 지 모를 때 그 기준을 `age`로 하고 싶으면 2가지 방법이 있음.

1. Comparable 인터페이스를 구현한, 정렬하고 싶은 클래스 내에 `compareTO()` 메서드를 **재정의** 해주면 됨.
2. 별도의 Comparator 인터페이스를 구현한 `compare()` 메서드가 재정의된 클래스를 만들어, 정렬하고 싶은 클래스 객체 생성시 매개변수로 넣어줌.

### 🔖 Comparable과 Comparator
- TreeSet에 저장되는 객체와 TreeMap에 저장되는 키 객체를 정렬
- Comparable 인터페이스에는 compareTo() 메소드가 정의됨
- 사용자 정의 클래스에서 이 메소드를 재정의해서 비교 결과를 정수값으로 리턴함.

|방법|리턴 타입|메소드|설명|
|:-:|:-:|-|-|
|01|int|compareTo(T o)|주어진 객체와 같으면 0을 리턴, 주어진 객체보다 적으면 음수를 리턴, 주어진 객체보다 크면 양수를 리턴|
|02|int|compare(T o1, T o2)|o1과 o2가 동등하다면 0을 리턴, o1이 o2보다 앞에 오게 하려면 음수를 리턴, o1이 o2보다 뒤에 오게 하려면 양수를 리턴|

</br>

## 15.06 LIFO와 FIFO 컬렉션
- **후입선출(LIFO):** 나중에 넣은 객체가 먼저 빠져나가는 구조
- **선입선출(FIFO):** 먼저 넣은 객체가 먼저 빠져나가는 구조
- 컬렉션 프레임워크는 LIFO 자료구조를 제공하는 **스택 클래스**와, FIFO 자료구조를 제공하는 **큐 인터페이스**를 제공

### 📚 Stack
- **Stack 클래스:** LIFO 자료구조를 구현한 클래스
- 스택은 데이터를 일시적으로 쌓아 놓는 자료구조
- 데이터의 입력과 출력 순서는 **후입선출**임
- **푸시:** 스택에서 데이터를 넣는 작업
- **팝:** 스택에서 데이터를 꺼내는 작업

```java
Stack<E> stack = new Stack<E>();
Stack<E> stack = new Stack<>();
```

**table.** Stack의 주요 메서드
|리턴 타입|메소드 명|설명|
|:-:|:-:|-|
|boolean|empty()|비어있는지 여부 확인. 비어 있으면 true, 비어있지 않으면 false|
|item|push(item)|주어진 객체를 stack에 넣는다.|
|item|peek()|stack의 맨 위 객체를 가지고 온다. stack에서 제거하는 것은 아님. 값만 가지고 올 때 사용. (peek=훔쳐보다)|
|item|pop()|stack의 맨 위 객체를 가지고 온다.|
|int|indexOf(item)|stack내에서의 index를 찾는다. 0부터 시작|
|int|size()|stack의 항목 개수|
|item|get(index)|특정 index에 있는 항목 추출|

### 📚 Queue
- **Queue 인터페이스:** FIFO 자료구조에서 사용되는 메소드를 정의
- **LinkedList:** Queue 인터페이스를 구현한 대표적인 클래스
- 가장 먼저 넣은 데이터를 가장 먼저 꺼내는 **선입선출** 구조
- **인큐:** Queue에 데이터를 넣는 작업
- **디큐:** Queue에서 데이터를 꺼내는 작업
- **리어(rear/back):** 데이터를 넣는 쪽
- **프런트(front):** 데이터가 나오는 쪽

```java
Queue<E> queue = new LinkedList<E>();
Queue<E> queue = new LinkedList<>();
```

**table.** Queue의 주요 메서드
|리턴 타입|메소드 명|설명|
|:-:|:-:|-|
|boolean|add(item)|큐의 맨 뒤에 항목을 삽입함. 성공하면 true, 실패하면 false|
|item|element()|맨 앞에 있는 항목을 리턴|
|item|peek()|큐의 맨 앞에 객체를 가지고 옴. 큐에서 제거하는 것은 아님. 값만 가지고 올 때 사용|
|item|remove()|큐의 맨 위 객체를 가지고 옴. 큐에서 제거|
|boolean|isEmpty()|비어있는지 확인|
|int|size()|Queue 항목의 개수|

</br>

## 15.07 동기화된 컬렉션
- 동기화된 메소드로 구성된 `Vector`와 `Hashtable`는 **멀티 스레드 환경**에서 **안전**하게 요소를 처리함
- Collections의 synchronizedXXX() 메소드: ArrayList, HashSet, HashMap 등 비동기화된 메소드를 동기화된 메소드로 래핑

**table.** synchronizedXXX() 메소드
|리턴 타입|메소드(매개변수)|설명|
|:-:|:-:|-|
|List<T>|synchronizedList(List<T> list)|List를 동기화된 List로 리턴|
|Map<K, V>|synchronizedMap(Map<K, V> m)|Map을 동기화된 Map으로 리턴|
|Set<T>|synchronizedSet(Set<T> s)|Set을 동기화된 Set으로 리턴|


## 15.08 수정할 수 없는 컬렉션
- 요소를 추가, 삭제할 수 없는 컬렉션
- 컬렉션 생성 시 저장된 요소를 변경하고 싶지 않을 때 유용함
- List, Set, Map 인터페이스의 정적 메소드인 `of()`로 생성
- List, Set, Map 인터페이스의 정적 메소드인 `copyOf()`을 이용해 기존 컬렉션을 복사
- 배열로부터 수정할 수 없는 List 컬렉션을 만듦
