# Chapter 18 데이터 입출력
## 18.01 입출력 스트림
### 입력 스트림과 출력 스트림
- 프로그램을 기준으로 데이터가 들어오면 **입력스트림**, 데이터가 나가면 **출력스트림**
- 프로그램이 다른 프로그램과 데이터를 교환하려면 양쪽 모두 입력스트림과 출력 스트림이 필요함
- **바이트 스트림:** 그림, 멀티미디어, 문자 등 모든 종류의 데이터를 입출력할 때 사용 ⮕ `InputStream`, `OutputStream`
- **문자 스트림:** 문자만 입출력할 때 사용 ⮕ `Reader`, `Writer`

## 18.02 바이트 출력 스트림
### 📚 OutputStream
- 바이트 출력 스트림의 최상위 클래스 추상 클래스
- 모든 바이트 출력 스트림 클래스는 이 OutputStream 클래스를 상속받아서 만들어짐

**table.** 모든 바이트 **출력** 스트림이 기본적으로 가져야 할 메소드
|No.|리턴 타입|메소드|설명|
|:-:|:-:|-|-|
|01|void|write(int b)|1byte를 출력|
|02|void|write(byte[] b)|매개값으로 주어진 배열 b의 모든 바이트를 출력|
|03|void|wrtie(byte[] b, int off, int len)|매개값으로 주어진 배열 b[off]부터 len개의 바이트를 출력|
|04|void|flush()|출력 버퍼에 잔류하는 모든 바이트를 출력|
|05|void|close()|출력 스트림을 닫고 사용 메모리 해제|

## 18.03 바이트 입력 스트림
### 📚 InputStream
- InputStream은 바이트 입력 스트림의 최상위 클래스로, 추상 클래스임.
- 모든 바이트 입력 스트림은 InputStream 클래스를 상속받아 만들어짐

**table.** 모든 바이트 **입력** 스트림이 기본적으로 가져야 할 메소드
|No.|리턴 타입|메소드|설명|
|:-:|:-:|-|-|
|01|int|read()|1byte를 읽은 후 읽은 바이트를 리턴|
|02|int|read(byte[] b)|읽은 바이트를 매개값으로 주어진 배열에 저장 후 읽은 바이트 수를 리턴|
|03|void|close()|입력 스트림을 닫고 사용 메모리 해제|

### 📖 1 바이트 입력
- 입력 스트림으로부터 1byte를 읽고 int(4byte) 타입으로 리턴
- 리턴된 4byte 중 끝 1byte에만 데이터가 있음
- 더 이상 입력 스트림으로부터 바이트를 읽을 수 없다면 `read()` 메소드는 -1을 리턴
- 읽을 수 있는 마지막 바이트까지 반복해서 한 바이트씩 읽을 수 있음

```java
InputStream is = ...;
while (true){
  int data = is.read();  // 1 바이트를 읽고 리턴
  if (data == -1) break; // -1을 리턴했을 경우 while문 종료
}
```

### 📖 바이트 배열로 읽기
- 입력 스트림으로부터 주어진 배열의 길이만큼 바이트를 읽고 배열에 저장한 다음 읽은 바이트 수를 리턴
- 입력 스트림으로부터 바이트를 더 이상 읽을 수 없다면 -1을 리턴.
- 읽을 수 있는 마지막 바이트까지 반복해서 읽을 수 있음

```java
InputStream is = ...;
byte[] data = new byte[100];
while(true){
  int num = is.read(data); // 최대 100 byte를 읽고, 읽은 바이트는 배열 data 저장, 읽은 수는 리턴
  if (num == -1) break;    // -1을 리턴하면 while문 종료
}
```

## 18.04 문자 입출력 스트림
### 📖 문자 출력
- Writer는 문자 출력 스트림의 최상위 클래스로, 추상클래스임
- 모든 문자 출력 스트림 클래스는 Writer 클래스를 상속받아서 만들어짐

**table.** Write 클래스의 문자 출력 스트림이 기본적으로 가져야 할 메소드
|No.|리턴 타입|메소드|설명|
|:-:|:-:|-|-|
|01|void|write(int c)|매개값으로 주어진 한 문자를 출력|
|02|void|write(char[] cbuf)|매개값으로 주어진 배열의 모든 문자를 출력|
|03|void|write(char[] cbuf, int off, in len)|매개값으로 주어진 배열에서 cbuf[off]부터 len개까지의 문자를 출력|
|04|void|write(String str)|매개값으로 주어진 문자열을 출력|
|05|void|write(String str, int off, int len)|매개값으로 주어진 문자열에서 off 순번부터 len개까지의 문자를 출력|
|06|void|flush()|버퍼에 잔류하는 모든 문자를 출력
|07|void|close()|출력 스트림을 닫고 사용 메모리를 해제|

### 📖 Reader
- Reader는 문자 입력 스트림의 최상위 클래스로, 추상 클래스임
- 모든 문자 입력 스트림 클래스는 Reader 클래스를 상속받아서 만들어짐

**table.** Reader 클래스의 문자 출력 스트림이 기본적으로 가져야 할 메소드
|No.|리턴 타입|메소드|설명|
|:-:|:-:|-|-|
|01|int|read()|1개의 문자를 읽고 리턴|
|02|int|read(char[] cbuf)|읽은 문자들을 매개값으로 주어진 문자 배열에 저장하고 읽은 문자 수를 리턴|
|03|void|close()|입력 스트림을 닫고, 사용 메모리 해제|

## 18.05 보조 스트림
- 다른 스트림과 연결되어 여러 편리한 기능을 제공해주는 스트림.
- 자체적으로 입출력을 수행할 수 없기 때문에 입출력 소스로부터 직접 생성된 입출력 스트림에 연결해서 사용
- 입출력 스트림에 보조 스트림을 연결하려면 보조 스트림을 생성할 때 새어상자 매개갑승로 입출력 스트림을 제공
- 보조스트림 변수 = new 보조스트림(입출력스트림);

### 📚 스트림 체인 구성
- 여러 보조 스트림 연결해서 사용하기

```java
InputStream is = new FileInputStream("...");
InputStreamReader reader = new InputStreamReader(is);
BufferReader br = new BufferReader(reader);
```

**table.** 보조 스트림
|No.|보조 스트림|기능|
|:-:|-|-|
|InputStreamReader|바이트 스트림을 문자 스트림으로 변환|
|BufferedInputStream, BufferedOutputStream, BufferedReader, BufferedWriter|입출력 성능 향상|
|DataInputStream, DataOutputStream|기본 타입 데이터 입출력|
|PrintStream, PrintWriter|줄바꿈 처리 및 형식화된 문자열 출력|
|ObjectInputStream, ObjectOutputStream|객체 입출력|

## 18.06 문자 변환 스트림
### 📚 InputStream을 Reader로 변환
- InputStream을 Reader로 변환하려면 InputStreamReader 보조 스트림을 연결

```java
InputStream is = new FileInputStream('C:/Temp/test.txt');
Reader reader = new InputStreamReader(is);
```

### 📚 OutputStream을 Writer로 변환
- OutStream을 Writer로 변환하려면 OutputStreamWriter 보조 스트림을 연결

```java
OutStream os = new FileOutputStream('C:/Temp/test.txt');
Writer writer = new OutputStreamWriter(is);
```

## 18.07 성능 향상 스트림
### 📚 메모리 버퍼로 실행 성능을 높이는 보조 스트림
- 프로그램이 중간에 메모리 buffer와 작업해서 실행 성능 향상 가능
- 출력 스트림의 경우 직접 하드 디스크에 데이터를 보내지 않고 메모리 buffer에 데이터를 보냄으로써 출력 속도를 향상
- 입력 스트림의 경우 buffer를 사용하면 읽기 성능 향상
- 바이트 스트림: `BufferedInputStream`, `BufferedOutputStream`
- 문자 스트림: `BufferedReader`, `BufferedWriter`

### 📚 텍스트 파일의 행단위 읽기
```java
BufferedReader br = new BufferedReader(new FileReader("..."));
while(true){
  String str = br.readLine(); // 파일에서 한 행씩 읽음
  if(str == null) break;      // 더 이상 읽을 행이 없을 경우(파일끝) while문 종료
}
```

## 18.08 기본 타입 스트림
- 바이트 스트림에 DataInputStream과 DataOutputStream 보조 스트림을 연결하면 기본 타입 값을 입출력할 수 있음.
```java
DataInputStream dis = new DataInputStream(바이트 입력 스트림);
DataOutputStream dos = new DataOutputStream(바이트 출력 스트림);
```

## 18.09 프린트 스트림
### 📚 PrintStream과 PrintWriter
- 프린터와 유사하게 출력하는 `print()`, `printIn()`, `printf()` 메소드를 가진 보조 스트림
- PrintStream은 바이트 출력 스트림과 연결되고, PrintWriter는 문자 출력 스트림과 연결

## 18.10 객체 스트림
- **직렬화(serialization):** 객체를 출력하기 위해 필드값을 일렬로 늘어선 바이트로 변경함
- **역직렬화(deserialization):** 직렬화된 바이트를 객체의 필드갑으로 복원함

### 📚 Serializable 인터페이스
- 멤버가 없는 빈 인터페이스이지만, 객체를 **직렬화**할 수 있다고 표시하는 역할
- 객체가 직렬화될 때 **인스턴스 필드값**은 직렬화 대상이지만,
- **정적 필드값**과 **transient로 선언된 필드값**은 직렬화에서 제외되므로 출력되지 않음


### 📚 serialVersionUID 필드
클래스 내용이 다르다 할지라도 직렬화된 필드를 공통으로 포함하고 있다면 역직렬화할 수 있는 방법임.

## 18.11 File과 Files 클래스
### 📚 File 클래스
- File 클래스로부터 File 객체를 생성

```java
File file = new File("경로");
```

### 📖 exist() 메소드
**table.** `exist()` 메소드가 false를 리턴할 경우
|리턴 타입|메소드|설명|
|-|-|-|
|boolean|createNewFile()|새로운 파일을 생성|
|boolean|mkdir()|새로운 디렉토리를 생성|
|boolean|mkdirs()|경로상에 없는 모든 디렉토리를 생성|

**table.** `exist()` 메소드가 true를 리턴할 경우
|리턴 타입|메소드|설명|
|-|-|-|
|boolean|delete()|파일 또는 디렉토리 삭제|
|boolean|canExecute()|실행할 수 있는 파일인지 여부|
|boolean|canRead()|읽을 수 있는 파일인지 여부|
|boolean|canWrite()|수정 및 저장할 수 있는 파일인지 여부|
|String|getName()|파일의 이름을 리턴|
|String|getParent()|부모 디렉토리를 리턴|
|File|getParentFile()|부모 디렉토리를 File 객체로 생성 후 리턴|
|String|getPath()|전체 경로를 리턴|
|boolean|isDirectory()|디렉토리인지 여부|
|boolean|isFile()|파일인지 여부|
|boolean|isHidden()|숨김 파일인지 여부|
|long|lastModified()|마지막 수정 날짜 및 시간을 리턴|
|long|length()|파일의 크리 리턴|
|String[]|list()|디렉토리에 포함된 파일 및 서브 디렉토리 목록 전부를 String 배열로 리턴|
|String[]|list(FilenameFilter filter)|디렉토리에 포함된 파일 및 서브 디렉토리 목록 중에 FilenameFilter에 맞는 것만 String 배열로 리턴|
|File[]|listFiles()|디렉토리에 포함된 파일 및 서브 디렉토리 목록 전부를 File 배열로 리턴|
|File[]|listFiles(FilenameFilter filter)|디렉토리에 포함된 파일 및 서브 디렉토리 목록 중에 FilenameFilter에 맞는 것만 File 배열로 리턴|
