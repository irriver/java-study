package lecture.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriter {
	public static void main(String[] args) {
		
	
	FileReader fr = null;
	FileWriter fw = null;
	
	try {
		fr = new FileReader("C:\\Dev\\WorkSpace\\IoTest\\InFile.txt");
		fw = new FileWriter("C:\\Dev\\WorkSpace\\IoTest\\CopiedInFile.txt", true);
		
		int data = 0;
		while ((data = fr.read()) != -1) {
//			System.out.println(data);
			if (data != '\n' && data != '\r' && data != '\t'  && data != ' ') {
				fw.write(data);
			}
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
		finally {
			try {
				fw.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
