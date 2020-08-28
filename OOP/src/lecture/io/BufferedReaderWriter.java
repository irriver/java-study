package lecture.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderWriter {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("C:\\Dev\\WorkSpace\\IoTest\\CopiedInFile.txt");
			br = new BufferedReader(fr);
			
			String line = "";
			for (int i = 0; (line = br.readLine()) != null; i++) {
				if (line.indexOf(" ") != -1) {
					System.out.println(line);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
