package p01.io.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
new String(readB, 0, readByteNo)
- readB 바이트 배열을 문자열로 자동 형변환
 */
public class ReadEx2 {

	public static void main(String[] args) {

		try {
			InputStream is = new FileInputStream("src/p01/io/inputstream/test.txt");
			int readByteNo;
			byte[] readByte = new byte[3];
			String data = "";

			while (true) {
				
				try {
					// readByteNo 실제 읽은 byte
					readByteNo = is.read(readByte); // 3byte 씩 읽어옴

					if (readByteNo == -1) {
						break;
					}
					data += new String(readByte, 0, readByteNo);
					System.out.println(data);
				} catch (IOException e) {
					System.out.println("IOException");
				}
			}
			
			try {
				is.close();
			} catch (IOException e) {
				System.out.println("IOException");
			}

		}catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		}

	}

}
