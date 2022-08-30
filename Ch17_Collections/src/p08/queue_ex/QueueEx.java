package p08.queue_ex;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		Queue<Message> messagesQueue = new LinkedList<Message>();

		messagesQueue.offer(new Message("sendMail", "홍길동"));
		messagesQueue.offer(new Message("sendSMS", "신용권"));
		messagesQueue.offer(new Message("sendKakaotalk", "홍두께"));

//		
		// queue 인터페이스 사용
		while (!messagesQueue.isEmpty()) { 
			Message message1 = messagesQueue.poll(); 
			// poll() : 객체를 하나를 가져옴, 객체를 큐에서 제거함.

			switch (message1.command) {
			case "sendMail": {
				System.out.println(message1.to + "님에게 메일을 보냅니다.");
				break;
			}
			case "sendSMS": {
				System.out.println(message1.to + "님에게 메세지를 보냅니다.");
				break;
			}
			case "sendKakaotalk": {
				System.out.println(message1.to + "님에게 카톡을 보냅니다.");
				break;
			}

			}

		}

//		-------------------------------------------------
		
		// 상향된 for문 사용 
		for (Message message2 : messagesQueue) {
			switch (message2.command) {
			case "sendMail": {
				System.out.println(message2.to + "님에게 메일을 보냅니다.");
				break;
			}
			case "sendSMS": {
				System.out.println(message2.to + "님에게 메세지를 보냅니다.");
				break;
			}
			case "sendKakaotalk": {
				System.out.println(message2.to + "님에게 카톡을 보냅니다.");
				break;
			}

			}
		}
		
//		
		
	}
}
