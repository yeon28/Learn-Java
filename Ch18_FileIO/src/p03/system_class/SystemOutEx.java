package p03.system_class;

import java.io.IOException;
import java.io.OutputStream;

/*
System.err은 개발자가 콘솔에 error 메세지를 보여줄 때 사용 -> 붉은 글씨로 출력
 */
public class SystemOutEx {

	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;

		for (byte b = 48; b < 58; b++) { // 아스키 코드로 작성
			os.write(b);
		}

		os.write(10);

		for (byte b = 97; b < 123; b++) {
			os.write(b);
		}

		os.write(10);

		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulByte = hangul.getBytes();
		os.write(hangulByte);

		os.flush();
		os.close();
		
		System.out.println();
		
		System.err.println("System error 사용");	// 잘 사용하지 않음.
	}
	
	
}
