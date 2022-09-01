package p06.filter_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {

	public static void main(String[] args) throws IOException {
		long start = 0;
		long end = 0;

		FileInputStream fis1 = new FileInputStream("C:/house.jpg");
		FileOutputStream fos1 = new FileOutputStream("C:/tmp/house.jpg");

		start = System.currentTimeMillis();
		while ((fis1.read()) != -1) {

		}

		end = System.currentTimeMillis();
		fos1.close();

		System.out.println("BufferedOutput 사용하지 않음 : " + (end - start) + "ms");

//		--------------------------------

		FileInputStream fis2 = new FileInputStream("C:/house.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		FileOutputStream fos2 = new FileOutputStream("C:/tmp/house.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos2);

		start = System.currentTimeMillis();
		while ((bis.read()) != -1) {
		}

		end = System.currentTimeMillis();
		bos.close();
		bis.close();

		System.out.println("BufferedOutput 사용함 : " + (end - start) + "ms");

	}
}
