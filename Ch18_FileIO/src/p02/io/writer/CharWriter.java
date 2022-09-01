package p02.io.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharWriter {

	public static void main(String[] args) throws IOException {
		Writer w = new FileWriter("C:/tmp/test.txt");
		char[] cbuf = "홍길동".toCharArray();
		
		for (int i = 0; i < cbuf.length; i++) {
			w.write(cbuf[i]);
		}
		
		w.flush();
		w.close();
	}
}
