package p08.network_basic;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP주소 : " + local.getLocalHost());

			InetAddress[] ia = InetAddress.getAllByName("www.naver.com");

			for (InetAddress remote : ia) {
				System.out.println("www.naver.com IP : " + remote.getHostAddress());
			}
		} catch (UnknownHostException e) {
			System.out.println("local host를 알 수 없습니다.");
		}
	}
}
