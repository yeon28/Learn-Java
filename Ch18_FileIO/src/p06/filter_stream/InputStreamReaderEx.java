package p06.filter_stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
InputStreamReader() 
: inputStream 객체를 매개변수로 받아서 입력된 byte 데이터를 char로 변환함.
 */
public class InputStreamReaderEx {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in; // console에서 읽어옴
		Reader reader = new InputStreamReader(is); // 
		
		int readCharNo;
		char[]	cbuf = new char[100];
		while ((readCharNo = reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		
		reader.close();
	}
}
