package quiz.collections;

import java.util.ArrayList;

public class EmpData {
	private String name;
	private int[] numbers;
	private ArrayList alist;
	
	public EmpData() {
		//Initialization -> allocated Memory
		this.name = "John Doe";
		this.numbers = new int[10];
		alist = new ArrayList();
	}
	public EmpData(String name, int[] numbers, ArrayList alist) {
		super();
		this.name = name;
		this.numbers = numbers;
		this.alist = alist;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getNumbers() {
		return numbers;
	}
	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	public ArrayList getAlist() {
		return alist;
	}
	public void setAlist(ArrayList alist) {
		this.alist = alist;
	}
}
