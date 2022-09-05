package p08.network_basic2;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket(); 
			// 서버용 socket을 만듦.(네트워크 상에서 데이터를 주고 받을 때 생성하는 인스턴스)
			
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			// IP address : "localhost"(127.0.0.1), port : 5001
			
			while (true) {
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept();
				// 클라이언트가 연결(.connect) 요청하면 서버는 허락(.accept)하라는 의미
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함]" + isa.getHostName());
			}
		} catch (IOException e) {
			System.out.println("serverSoket 생성 실패");
		}

		if (!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				System.out.println("socket close Error");
			}
		}

	}
}
