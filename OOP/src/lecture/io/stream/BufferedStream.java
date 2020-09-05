package lecture.io.stream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStream {
	
	public static void main(String[] args) {
		
		try {
			
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Temp\\dest.txt")); //AAAA
		
			for (int i = 0; i < 4; i++) {
				bos.write('A');
			}
			
			bos.close(); //close() includes flush()
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
