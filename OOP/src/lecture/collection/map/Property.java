package lecture.collection.map;

import java.util.Properties;

/*
	Map 인터페이스를 구현한 클래스
	Map<String, String>으로 고정.
	사용목적: App 전체에 사용되는 자원 관리
	환경 변수, 프로그램 버전, 파일 경로, 공통 변수
*/
public class Property {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("admin",  "gov@gov.or.kr");
		prop.setProperty("ver",  "1.0.0");
		prop.setProperty("dwnldPath",  "C:\\Downloads");
		
		System.out.println(prop.getProperty("admin"));
		System.out.println(prop.getProperty("dwnldPath"));
	}
}
