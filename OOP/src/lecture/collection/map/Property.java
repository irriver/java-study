package lecture.collection.map;

import java.util.Properties;

/*
	Map �������̽��� ������ Ŭ����
	Map<String, String>���� ����.
	������: App ��ü�� ���Ǵ� �ڿ� ����
	ȯ�� ����, ���α׷� ����, ���� ���, ���� ����
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
