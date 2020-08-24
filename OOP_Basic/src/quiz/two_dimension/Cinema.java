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

	//*빈 자리 만들기
	public int[] makeSeat() {
			for (int i = 0; i < seatNo.length; i++) {
				seatNo[i] = 'A' + i;
		}
		return seatNo;
	}

	//*고객이 좌석 선택 -> 입력값을 좌석을 문자열 일차원 배열로 받자
	public String[] selectSeat() {
		System.out.println("좌석 번호 두 자릿수를 입력하세요>> ");
		String seatStr = userInput.nextLine();
		String row = seatStr.substring(0, 1);
		String col = seatStr.substring(1, 2);
		inputSeat[0] = row;
		inputSeat[1] = col;
		return inputSeat;
	}
	//*예매하기
	void booking(String[] inputSeat) {
		int row = Integer.parseInt(inputSeat[0]);
		int col = Integer.parseInt(inputSeat[1]);
		System.out.println("row: " + row + " col: " + col);
		seatNo[row - 1][col - 1] = "+Book";
	}

	//*예매번호 생성: 날짜 + 좌석번호 두 자리
	public String reservationNo(String[] seatNo) {
		SimpleDateFormat dates = new SimpleDateFormat ("yyyyMMddHHmm"); //총 예매번호는 0 ~ 13 까지
		Calendar time = Calendar.getInstance();
		String reservationDate = dates.format(time.getTime());
		String reservationNo = reservationDate + seatNo[0] + seatNo[1];
		return reservationNo;
	}
	
	//*예매취소: 예매번호 확인 -> 예매번호의 맨 끝 두자리만 subString(10)으로 잘라내기 -> 초기화
	public void cancleSeat(String reservationNo) {
		//[2, 1] 이면  seatNo[2][1] = "____" 대입
		String result = reservationNo.substring(12);
		System.out.println("파싱한 예매번호: " + result);
		//문자열 파싱 
		int row = Integer.parseInt(result.substring(0, 1));
		int col = Integer.parseInt(result.substring(1, 2));
		
		//예약자 리셋
		seatNo[row - 1][col - 1] = "Empty";
	}
	
	//*좌석 초기화 전체 for loop
	public void initSeat() {
		for (int i = 0; i < seatNo.length; i++) {
			for (int j = 0; j < seatNo[i].length; j++) {
				seatNo[i][j] = "Empty";
			}
		}
	}
	
	//*좌석 정보 출력
	public void showReservationStatus(String[][] seatNo) {
		for (int i = 0; i < seatNo.length; i++) {
			for (int j = 0; j < seatNo[i].length; j++) {
				System.out.printf("[%s]", seatNo[i][j].equals("____") ? "----" : seatNo[i][j]);
			}
			System.out.println();
		}
	}
}
