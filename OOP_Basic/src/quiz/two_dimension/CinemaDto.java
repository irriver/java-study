package quiz.two_dimension;

import java.util.Arrays;
import java.util.Scanner;

public class CinemaDto {
	private int[] seatNo; 
	private Scanner userInput;
//	private String[] inputSeat;
	private int seatLen;
	
	public int[] getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int[] seatNo) {
		this.seatNo = seatNo;
	}
	public Scanner getUserInput() {
		return userInput;
	}
	public void setUserInput(Scanner userInput) {
		this.userInput = userInput;
	}
	public int getSeatLen() {
		return seatLen;
	}
	public void setSeatLen(int seatLen) {
		this.seatLen = seatLen;
	}
	
	@Override
	public String toString() {
		return "CinemaDto [seatNo=" + Arrays.toString(seatNo) + ", userInput=" + userInput + ", seatLen=" + seatLen
				+ "]";
	}
}
