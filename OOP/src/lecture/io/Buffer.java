package lecture.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buffer {
	public static void main(String[] args) {
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		
		try {
			fout = new FileOutputStream("C:\\Dev\\WorkSpace\\IoTest\\data.txt");	//���⿡ ���ڴ�. ���ٸ� create
			bout = new BufferedOutputStream(fout);		//OutputStream ��ü�� '�ּҰ�'�� ����
			
			for (int i = 0; i < 10; i++) {
				bout.write('A');
			}
			bout.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bout.close();	//close()��  flush()�� ȣ��
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
