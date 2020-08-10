
public class Present {
	
	static void print(String present) {
		System.out.print(present);
	}
	static void checkScore(int randomScore) {
		if (randomScore >= 600) {
			print("휴지 ");
		}
		if (randomScore >= 700) {
			print("한우세트 ");
		}
		if (randomScore >= 800) {
			print("냉장고 ");
		}
		if (randomScore >= 900) {
			print("NoteBook ");
		}
		if (randomScore >= 1000) {
			print("TV ");
		}
	}

	public static void main(String[] args) {
		int randomScore = ((int) (Math.random() * 10 + 1)) * 100;
		System.out.println(randomScore + "점 입니다.");
		
		checkScore(randomScore);
		
		System.out.println("칫솔 당첨!");
		System.out.println("축하드립니다!");
	}
}
