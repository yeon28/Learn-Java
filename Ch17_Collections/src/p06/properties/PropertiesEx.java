package p06.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

/*
properties : map collection에 속한 class (Map의 특수한 형태)
-> key, value 모두 String 타입
-> Map<String, String>과 동일

- file extension이 properties인 별도 파일로 관리됨
- 파일 안에서 key=value 형태로 저장됨.
- 용도 :
  - ex) 
    현재 database.prorperties의 value는 oracle DBMS 환경정보를 넣고 있음.
    이 때, database.prorperties의 환경정보만 바꿔주면,
    프로그램 내부에서는 소스코드 변경 없이 oracle, mysql 등 다른 DBMS를 접속해 사용 가능함.
 */
public class PropertiesEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		String path=PropertiesEx.class.getResource("database.properties").getPath();
		
		path = URLDecoder.decode(path, "utf-8"); // exception 발생 --> 부모로 넘김(무시함).
		System.out.println("path : " + path);
		
		// database.properties 파일을 읽어 힙메모리에 올리라는(load) 의미
		properties.load(new FileReader(path));	// exception 발생 --> 부모로 넘김(무시함).
	
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
	}
}
