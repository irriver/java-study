
public class Present {
	
	static void print(String present) {
		System.out.print(present);
	}
	static void checkScore(int randomScore) {
		if (randomScore >= 600) {
			print("���� ");
		}
		if (randomScore >= 700) {
			print("�ѿ켼Ʈ ");
		}
		if (randomScore >= 800) {
			print("����� ");
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
		System.out.println(randomScore + "�� �Դϴ�.");
		
		checkScore(randomScore);
		
		System.out.println("ĩ�� ��÷!");
		System.out.println("���ϵ帳�ϴ�!");
	}
}
