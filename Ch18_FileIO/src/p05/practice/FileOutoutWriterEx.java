package p05.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
new FileWriter(File file, boolean append)
- append가 true, 기존 파일 내용을 삭제하지 않고 이어서 내용 추가함.
 */
public class FileOutoutWriterEx {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/tmp/file.txt");
		FileWriter fw = new FileWriter(file, true);
		
		fw.write("FileWriter는 한글로된 \r\n");
		fw.write("문자열을 바로 출력할 수 있습니다. \r\n");
		fw.flush();
		fw.close();
		System.out.println("file.txt 파일에 저장");
	}
}
