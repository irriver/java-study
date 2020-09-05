package lecture.io.stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayStream {
	public static void main(String[] args) {
		
		//To read data from 'src', then write data to 'dest'
		
		byte[] src = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] dest = null;
		
		//read, write data in memory..
		
		ByteArrayInputStream bis = new ByteArrayInputStream(src);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		System.out.println("dest before write: " + Arrays.toString(dest));	//dest before write: null
		
		// read() returns the next byte of data
		//EOF -1
		
		int ch = bis.read();
		while (ch != -1) {
			System.out.println("ch: " + ch); //for debugging
			bos.write(ch);
			ch = bis.read();
		}
/*		ch: 0
		ch: 1
		ch: 2
		ch: 3
		ch: 4
		ch: 5
		ch: 6
		ch: 7
		ch: 8
		ch: 9
*/		
		//returns the current contents of this output stream, as a byte array.
		
		dest = bos.toByteArray();
		
		System.out.println("dest after write: " + Arrays.toString(dest));	//dest after write: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	}
}
