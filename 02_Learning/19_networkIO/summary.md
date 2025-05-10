# Chapter 19 네트워크 입출력
# 19.01 네트워크 기초
- **네트워크(Network):** 여러 컴퓨터들을 통신 회선으로 연결한 것.
- **LAN(Local Area Network)** 가정, 회사, 건물, 특정 영역에 존재하는 컴퓨터를 연결한 것.
- **WAN(Wide Area Network):** LAN을 연결한 것. (Internet)

### 📚 서버와 클라이언트
- **서버(Server):** 서비스를 제공하는 프로그램
- **클라이언트(Client):** 서비스를 요청하는 프로그램

### 📚 IP 주소
- **IP(Internet Protocol):** 컴퓨터의 고유한 주소.
- **IP 주소:** 네트워크 어댑터(LAN 카드)마다 할당됨.
- **DNS(Domain Name System):** 컴퓨터의 IP 주소를 검색함. 도메인의 이름.

### 📚 Port 번호
- IP는 컴퓨터의 네트워크 어댑터까지만 갈 수 있는 정보이기 때문에, 컴퓨터 내부에서 실행하는 서버를 선택하기 위해서는 추가적인 Port 번호가 필요함.
- 클라이언트도 서버에서 보낸 정보를 받기 위해서는 Port 번호가 필요함. 이는 운영체제(OS, Operating System)가 자동으로 부여하는 번호를 사용.

# 19.02 IP 주소 얻기
1. `InetAddress`를 이용하면 로컬컴퓨터의 IP 주소를 얻을 수 있음.
2. 도메인 이름으로 DNS에서 검색한 후 IP 주소를 얻을 수 있음.
3. `getByName()` 메소드는 DNS에서 도메인 이름으로 등록된 단 하나의 IP 주소를 가져옴
4. `getAllByName()` 메소드는 등록된 모든 IP 주소를 배열로 가져옴.

# 19.03 TCP 네트워킹
- **전송용 프로토콜(Protocol):** IP 주소로 프로그램들이 통신할 때의 약속된 데이터 전송 규약
- 인터넷에서 전송용 프로토콜은 TCP(Transmission Control Protocol)와 UDP(User Datagram Protocol)가 있음

## 📚 TCP
- 연결형 프로토콜
- 상대방이 연결된 상태에서 데이터를 주고받음
- IP와 함께 사용하기 때문에 TCP/IP라고 함.
- TCP는 웹 브라우저가 웹 서버에 연결할 때 사용되며 이메일 전송, 파일 전송, DB 연동에서도 사용됨.

### 📖 Socket
- 클라이언트에서 연결 요펑할 때와 클라이언트와 서버 양쪽에서 데이터를 주고받을 때 사용되는 클래스

### 📖 ServerSocket
- 클라이언트의 연결을 수락하는 서버 쪽 클래스
- ServerSocket을 생성할 때는 바인딩할 Port 번호를 지정해야함.
- `accept()` 메소드로 연결 수락을 하고 통신용 Socket을 생성함.

⮕ 클라이언트와 서버는 양쪽의 Socket을 이용해서 데이터를 주고받게 됨.

## 📚 TCP 서버
1. TCP 서버 프로그램을 개발하려면 ServerSocket 객체를 생성해야 함.
(방법 1) ServerSocket 객체를 생성
(방법 2) 기본 생성자로 객체를 생성 ⮕ Port 바인딩을 위해 `bind()` 메소드를 호출 

2. ServerSokcet이 생성 되었다면 연결 요청 수락을 위해 `accept()` 메소드를 실행함.
- `accept()`: 클라이언트가 연결 요청하기 전까지 블로킹 됨.
- **블로킹:** 실행을 멈춘 상태

3. 클라이언트의 연결 요청이 들어오면 블로킹이 해체되고 통신용 Socket을 리턴함.
4. 서버를 종료하려면 ServerSocket의 `close()` 메소드를 호출해서 Port 번호를 **언바인딩**시켜야 함. 그래야 다른 프로그램에서 해당 Port 번호를 재사용 할 수 있음.

## 📚 TCP 클라이언트
- 서버에 연결을 요청: Socket 객체를 생성할 때 생성자 매개값으로 서버 IP 주소와 Port 번호를 제공하면 됨.
- 서버와 연결을 끊기: `socket.close()`

## 📚 입출력 스트림으로 데이터 주고받기
클라이언트가 연결 요청(`connect()`)을 하고 서버가 연결 수락(`accept()`)을 했다면, 양쪽의 Socket 객체로부터 각각 입력 스트림(InputStream)과 출력 스트림(OutputStream)을 얻을 수 있음.

```java
InputStream is = socket.getInputStream();
OutputStream os = socket.getOutputStream();
```

```java
String data = "보낼 데이터";
byte[] bytes = data.getBytes("UTF-8");
OutputStream os = socket.getOutputStream();
os.write(bytes);
os.flush();
```

```java
String data = "보낼 데이터";
DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
dos.writeUTF(data);
dos.flush();
```

```java
byte[] bytes = new byte[1024];
InputStream is = socket.getInputStream();
int num = is.read(bytes);
String data = new String(bytes, 0, num, "UTF-8);
```

```java
DataInputStream dis = new DataInputStream(socket.getInputStream());
String data = dis.readUTF();
```

# 19.04 UDP 네트워킹
- **UDP(User Datagream Protocol):** 발신자가 일방적으로 수신자에게 데이터를 보내는 방식. TCP처럼 연결 요청 및 수락 과정이 없기 때문에 TCP보다 데이터 전송 속도가 상대적으로 빠름

## 📚 UDP 서버
- UDP 서버를 위한 DatagramSocket 객체를 생성할 때는 바인딩할 Port 번호를 생성자 매개값으로 제공해야함.
- UDP 서버는 클라이언트가 보낸 DatagramPacket을 항상 받을 준비를 해야함. ⮕ `receive()`
- `receive()`: 데이터를 수신할 때까지 블로킹되고, 데이터가 수신되면 매개값으로 주어진 DatagramPacket에 저장함.


- DatagramPacket을 클라이언트로 보낼 때는 DatagramSocket의 `send()` 메소드를 이용함.
- UDP 서버를 종료하고 싶을 때는 `close()` 메소드를 이용함.

## 📚 UDP 클라이언트
서버에 요청 내용을 보내고 그 결과를 받는 역할을 함.

# 19.05 서버의 동시 요청 처리
일반적으로 서버는 다수의 클라이언트와 통신을 함.

## 📚 19.3 TCP 네트워킹 - EchoServer

```java
while(true){
  // 연결 수락
  Socket socket = serverSocket.accpet();

  // 데이터 받기
  ...

  // 데이터 보내기
  ...
}
```


## 📚 19.4 UDP 네트워킹 - NewsServer
```java
while(true){
  // 클라이언트가 구독하고 싶은 뉴스 종류 얻기
  DatagramPacket receive
}
```



# 19.06 JSON 데이터 형식





# 19.07 TCP 채팅 프로그램






