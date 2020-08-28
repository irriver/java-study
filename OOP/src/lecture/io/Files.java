package lecture.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Files {
	public static void main(String[] args) {
		//file�� �� ã�� ���ܸ� ����� throw Exception
		
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
//				System.out.println("txt ������ ascii code ���� ������ �о����\n" + (char)data);
				fout.write(data);	//���� ������ OutFile.txt�� ���� �о���� fin�� �����͸� ī��
			}
		} catch (Exception e) {
			e.printStackTrace();
			//IO �ڿ��� ����: ����, ������ ����� ������� ��� -> ������ �÷��Ͱ� �������� ����.
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
