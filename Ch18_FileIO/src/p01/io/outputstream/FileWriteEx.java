package p01.io.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
FileOutputStream("write할 file경로")

1. File을 새로 생성할 때 , 경로 지정
  - 파일 경로에 folder까지는 존재해야 함.
  - write할 때, file은 없어도 괜찮음(새로 생성함.)
  - 작성할 file경로 위치에 이미 file이 존재하면, 기존 file위에 덮어씀.
2. Write() : file에 실제 byte 단위로 작성
3. flush() : 출력 버퍼에 있는 문자 전체를 하드디스크 file에 작성함
4. close()

 */
public class FileWriteEx {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("C:/tmp/test.txt"); //현재 tmp는 없는 파일
		
		byte[] data = "XYZ".getBytes(); // String -> byte[]로 변환
		
		for (int i = 0; i < data.length; i++) {
			os.write(data[i]);
		}
		
		os.flush();
		os.close();
	}
}
