package p05.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// file copy 예제
public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {
		String originalFilePath = "C:/house.jpg"; // 원본 이미지 파일 경로
		String targetFilePath = "C:/tmp/house.jpg"; // 복사할 이미지 파일 경로
		
		
		FileInputStream fis = new FileInputStream(originalFilePath); 
		FileOutputStream fos = new FileOutputStream(targetFilePath);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while ((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close(); // close() 순서는 new File- 생성 역순으로 닫음.
		
		System.out.println("복사가 정상적으로 완료됨.");
	}
}
