package lecture.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Files {
	public static void main(String[] args) {
		//file을 못 찾을 예외를 대비해 throw Exception
		
		String path = "C:\\Dev\\WorkSpace\\IoTest\\InFile.txt";
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			fin = new FileInputStream(path);
																		//False: overwrite, True: append
			fout = new FileOutputStream("C:\\Dev\\WorkSpace\\IoTest\\OutFile.txt", false);
//			FileOutputStream("C:\\Dev\\WorkSpace\\IoTest\\OutFile.txt", False);
			
			int data = 0;
			while ((data = fin.read()) != -1) {
//				System.out.println("txt 파일의 ascii code 값을 정수로 읽어들임\n" + (char)data);
				fout.write(data);	//원래 없었던 OutFile.txt를 만들어서 읽어들인 fin의 데이터를 카피
			}
		} catch (Exception e) {
			e.printStackTrace();
			//IO 자원의 해제: 정상, 비정상 종료와 상관없이 사용 -> 가비지 컬렉터가 관리하지 않음.
		} finally {
			try {
				fin.close();
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
