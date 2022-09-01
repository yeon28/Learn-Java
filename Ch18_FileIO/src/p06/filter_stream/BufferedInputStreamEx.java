package p06.filter_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class BufferedInputStreamEx {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;// 키보드 입력 받음
		Reader reader = new InputStreamReader(is); // 바이트 데이터 문자로 변환
		BufferedReader br = new BufferedReader(reader);
		
		System.out.print("입력 : " );
		String lineString = br.readLine(); // 한 줄 씩 읽음
	
		System.out.println("출력 : " + lineString);
	}
}
