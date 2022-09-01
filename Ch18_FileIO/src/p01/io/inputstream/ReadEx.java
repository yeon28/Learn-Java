package p01.io.inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
1. File 데이터읽기 쓰기할 때, 반드시 Exception 코딩(try-catch) 해야함.
  - new File class 를 생성할 때나 read() write() method 사용시
2. new FileInputStream("파일경로입력") 형식 사용
  - 절대 경로 : 하드디스크에 실제 파일일 존재하는 위치 입력
    ("D:\\DevSapce\\Git\\Learn-Java\\Ch18_FileIO\\src\\p01\\io\\inputstream\\test.txt")
    -> MS Windows 표기법 :'\\'를 '/'로 대체 사용 가능
    -> UNIX LINUX MacOS 표기법  : '\\'를 '/'로 대체 사용
  - 상대 경로 : eclipse 등 java 개발툴(IDE)마다 사용 가이드 차이 있음
    ("src\\p01\\io\\inputstream\\test.txt")   
3. read() : return 이 -1이면 file에서 더 이상 읽어올 데이터 없음을 의미함.
4. close() : 힙메모리에 생성한 FileInputStream의 인스턴스를 즉시 제거함.
 */
public class ReadEx {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream(
				"D:\\DevSapce\\Git\\Learn-Java\\Ch18_FileIO\\src\\p01\\io\\inputstream\\test.txt");
		// promotion
		int readByte;

		while (true) {
			readByte = is.read(); // 1 byte씩 읽어옴
			if (readByte == -1) { // readByte가 -1인경우 read실패
				break;
			}
			System.out.println("readByte : " + (char) readByte);
			
		}
		is.close();

	}
}
