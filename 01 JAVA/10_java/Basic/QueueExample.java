package Collection;

import java.util.LinkedList;
import java.util.Queue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
/*
다음 조건을 만족하는 프로그램을 작성하세요.
    ○ LinkedList를 큐로 이용
    ○ Message 인스턴스를 다음 순(command, to)으로 추가
        ▪ sendMail, 홍길동
        ▪ sendSMS, 신용권
        ▪ sendKakaotalk, 감자바
    ○ 큐가 빌 때까지 큐에서 Message를 추출하며 command에 따라 다음과 같이 출력
 */
public class QueueExample {
    public static void main(String[] args) {
        // Queue 컬렉션 생성
        Queue<Message> messageQueue = new LinkedList<>();

        // 메시지 넣기
        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSMS", "신용권"));
        messageQueue.offer(new Message("sendKakaotalk", "김자바"));

        // 메시지를 하나씩 꺼내어 처리
        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.getCommand()) {
                case "sendMail":
                    System.out.println(message.getTo() + "님에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(message.getTo() + "님에게 SMS를 보냅니다.");
                    break;
                case "sendKakaotalk":
                    System.out.println(message.getTo() + "님에게 Kakaotalk을 보냅니다.");
                    break;
            }
        }
    }
}
/*
홍길동님에게 메일을 보냅니다.
신용권님에게 SMS를 보냅니다.
김자바님에게 Kakaotalk을 보냅니다.
 */