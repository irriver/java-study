package quiz.pizza;

import java.util.Scanner;

public class PizzaMain {
	
	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		Scanner userInput = new Scanner(System.in);
		
		pizza.isCorrectInput();
		
		pizza.setDough(userInput);
		pizza.setTopping1(userInput);
		pizza.setTopping2(userInput);
		pizza.setSide(userInput);
		
		System.out.println(pizza.toString());
	}
}
