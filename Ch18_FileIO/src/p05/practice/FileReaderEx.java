package p05.practice;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		FileReader r = new FileReader("src/p05/practice/FileReaderEx.java");
		
		int readCharNo;
		char[]	cbuf = new char[100];
		while ((readCharNo = r.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		r.close();
		
	}
}
