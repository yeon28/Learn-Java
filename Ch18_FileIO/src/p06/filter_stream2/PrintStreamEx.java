package p06.filter_stream2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamEx {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:/tmp/print.txt");
		PrintStream ps = new PrintStream(fos); // 파일 경로에 저장
		
		ps.println("[프린터 보조 스트림]");
		ps.print("마치");
		ps.println("프린터가 출력하는 것 처럼");
		ps.println("데이터를 출력합니다.");
		// 콘솔에 출력하지 않음. PrintStream으로 지정된 경로에 저장됨.
		
		ps.flush();
		ps.close();
		fos.close();
	}
}
