package lecture.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadImg {
	public static void main(String[] args) {
		String src = "C:\\Dev\\WorkSpace\\IoTest\\image.jpg";
		String dest = "C:\\Dev\\WorkSpace\\IoTest\\copy.jpg";	//경로 설정 안하면 기본적으로 프로젝트 폴더 아래 생성
		
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		try {
			fin = new FileInputStream(src);
			fout = new FileOutputStream(dest, false);
			
			int data = 0;
			while ((data = fin.read()) != -1) {
				fout.write(data); //copy.jpg
			}
		} catch (Exception e) {
			e.printStackTrace();
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
