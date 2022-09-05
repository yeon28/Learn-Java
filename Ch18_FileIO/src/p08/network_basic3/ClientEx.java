package p08.network_basic3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientEx {

	public static void main(String[] args) {
		Socket socket = null;

		try {
			socket = new Socket();
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("192.168.30.141", 5001));
			// IP주소가 "localhost", port번호가 5001인 server에 연결요청(connect)
			System.out.println("[연결 성공]");

			byte[] bytes = null;
			String message = null;
			OutputStream os = socket.getOutputStream();
			message = "*^^*";
			bytes = message.getBytes("utf-8");
			os.write(bytes);
			os.flush();
			System.out.println("[데이터 보내기 성공]");

			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes, 0, readByteCount, "utf-8"); //encoding
			System.out.println("[데이터 받기 성공]" + message);

			os.close();
			is.close();
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
