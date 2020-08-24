package quiz.two_dimension;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
/*
	'seatNo' is an 1 dimensional String array and each components has ASCII codes in integer value
	'userInput' takes two digits in String which are seat numbers from user
	'seatLen' is a integer, can
	change length of 'seatNo'
	
	 'A	B	C	D	E
	 F	G	H	I	J
	 K	L	M	N	O
	
*/

public class Cinema {
	private int[] seatNo; 
	private Scanner userInput;
//	private String[] inputSeat;
	private int seatLen;
	
	public Cinema() {
		this.seatNo = new String[2];
		this.seatNo = new int[seatLen];
		this.userInput = new Scanner(System.in);
	}

	//*�� �ڸ� �����
	public int[] makeSeat() {
			for (int i = 0; i < seatNo.length; i++) {
				seatNo[i] = 'A' + i;
		}
		return seatNo;
	}

	//*���� �¼� ���� -> �Է°��� �¼��� ���ڿ� ������ �迭�� ����
	public String[] selectSeat() {
		System.out.println("�¼� ��ȣ �� �ڸ����� �Է��ϼ���>> ");
		String seatStr = userInput.nextLine();
		String row = seatStr.substring(0, 1);
		String col = seatStr.substring(1, 2);
		inputSeat[0] = row;
		inputSeat[1] = col;
		return inputSeat;
	}
	//*�����ϱ�
	void booking(String[] inputSeat) {
		int row = Integer.parseInt(inputSeat[0]);
		int col = Integer.parseInt(inputSeat[1]);
		System.out.println("row: " + row + " col: " + col);
		seatNo[row - 1][col - 1] = "+Book";
	}

	//*���Ź�ȣ ����: ��¥ + �¼���ȣ �� �ڸ�
	public String reservationNo(String[] seatNo) {
		SimpleDateFormat dates = new SimpleDateFormat ("yyyyMMddHHmm"); //�� ���Ź�ȣ�� 0 ~ 13 ����
		Calendar time = Calendar.getInstance();
		String reservationDate = dates.format(time.getTime());
		String reservationNo = reservationDate + seatNo[0] + seatNo[1];
		return reservationNo;
	}
	
	//*�������: ���Ź�ȣ Ȯ�� -> ���Ź�ȣ�� �� �� ���ڸ��� subString(10)���� �߶󳻱� -> �ʱ�ȭ
	public void cancleSeat(String reservationNo) {
		//[2, 1] �̸�  seatNo[2][1] = "____" ����
		String result = reservationNo.substring(12);
		System.out.println("�Ľ��� ���Ź�ȣ: " + result);
		//���ڿ� �Ľ� 
		int row = Integer.parseInt(result.substring(0, 1));
		int col = Integer.parseInt(result.substring(1, 2));
		
		//������ ����
		seatNo[row - 1][col - 1] = "Empty";
	}
	
	//*�¼� �ʱ�ȭ ��ü for loop
	public void initSeat() {
		for (int i = 0; i < seatNo.length; i++) {
			for (int j = 0; j < seatNo[i].length; j++) {
				seatNo[i][j] = "Empty";
			}
		}
	}
	
	//*�¼� ���� ���
	public void showReservationStatus(String[][] seatNo) {
		for (int i = 0; i < seatNo.length; i++) {
			for (int j = 0; j < seatNo[i].length; j++) {
				System.out.printf("[%s]", seatNo[i][j].equals("____") ? "----" : seatNo[i][j]);
			}
			System.out.println();
		}
	}
}
