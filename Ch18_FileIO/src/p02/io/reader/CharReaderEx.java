package p02.io.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
FileReader : 한영문 포함 유니코드 1문자 단위로 파일에서 데이터 읽음.
 */
public class CharReaderEx {

	public static void main(String[] args) throws IOException {
		Reader r = new FileReader("C:/tmp/test.txt");
		int readData;
		
		while (true) {
			readData = r.read();
			if (readData == -1) {
				break;
			}
			System.out.println((char)readData);
		}
		r.close();
	}
}
