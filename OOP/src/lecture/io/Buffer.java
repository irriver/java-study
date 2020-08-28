package lecture.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buffer {
	public static void main(String[] args) {
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		
		try {
			fout = new FileOutputStream("C:\\Dev\\WorkSpace\\IoTest\\data.txt");	//여기에 쓰겠다. 없다면 create
			bout = new BufferedOutputStream(fout);		//OutputStream 객체의 '주소값'을 받음
			
			for (int i = 0; i < 10; i++) {
				bout.write('A');
			}
			bout.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bout.close();	//close()가  flush()를 호출
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
