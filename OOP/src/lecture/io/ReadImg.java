package lecture.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadImg {
	public static void main(String[] args) {
		String src = "C:\\Dev\\WorkSpace\\IoTest\\image.jpg";
		String dest = "C:\\Dev\\WorkSpace\\IoTest\\copy.jpg";	//��� ���� ���ϸ� �⺻������ ������Ʈ ���� �Ʒ� ����
		
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
