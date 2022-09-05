package p08.network_basic2;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientEx {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket();
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("localhost", 5001));
			//IP주소가 "localhost", port번호가 5001인 server에 연결요청(connect)
			System.out.println("[연결 성공]");
		} catch (IOException e) {
			System.out.println("socket connect 실패");
		}
		
		if (!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				System.out.println("socket close Error");
			}
		}
	}
}
