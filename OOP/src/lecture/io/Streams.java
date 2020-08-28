package lecture.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
	Stream >> Byte���� �����
	InputStream, OutputStream	>> Abstract class, need implementation
	
	1) Memory: ByteArray
*/
public class Streams {
	public static void main(String[] args) {
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;	//Not initialized
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		System.out.println("outSrc Before: " + Arrays.toString(outSrc));
		
		int data = 0;
		
		//If no data left, return -1
		while ((data = input.read()) != -1) {
			System.out.println("data: " + data);
//			System.out.println("input.read(): " + input.read());	>> read() �� ���������� next�� ����
			output.write(data);	//output ��ü �ȿ� data�� �޾Ƽ� ������ ����
		}
		
		outSrc = output.toByteArray();
		System.out.println("outSrc After: " + Arrays.toString(outSrc));
	}
}
