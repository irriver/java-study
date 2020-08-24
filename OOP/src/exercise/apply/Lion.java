package exercise.apply;

public class Lion extends Animal {
	
	public Lion() {
		super("사자");
	}
	
	@Override
	void eat() {
		System.out.println("사자는 동물을 먹는다.");
	}
}
