package lecture.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {
	public static void main(String[] args) {
		
		String path = "C:\\Temp\\test.txt";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream("C:\\Temp\\new.txt", false);
			
			int ch = fis.read();
			
			while (ch != -1) {
				System.out.println("ch: " + (char)ch);
				fos.write(ch);
				ch = fis.read();
			}
/*			ch: H
			ch: e
			ch: l
			ch: l
			ch: o
			ch: ,
			ch:  
			ch: W
			ch: o
			ch: r
			ch: l
			ch: d
			ch: !
*/
			
			fos.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}
}
