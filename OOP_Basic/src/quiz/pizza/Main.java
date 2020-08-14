package quiz.pizza;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	Pizza thinDoughChickenWithCoke = new Pizza();
	int processNum = Integer.parseInt(new Scanner(System.in).nextLine()); // 1 ~ 4
	int pizPart = thinDoughChickenWithCoke.selectionLoop(processNum);
	  
	
	}
	
}
