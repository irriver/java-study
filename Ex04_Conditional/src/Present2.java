
public class Present2 {
	public static void main(String[] args) {
		int randomScore = ((int) (Math.random() * 10 + 1)) * 100;
		System.out.println(randomScore + "�� �Դϴ�.");

		while (true) {
			if (randomScore == 1000) {
				System.out.println("TV, NoteBook, �����, �ѿ켼Ʈ, ���� ��÷!");
				break;
			} else if (randomScore == 900) {
				System.out.println("NoteBook, �����, �ѿ켼Ʈ, ���� ��÷!");
				break;
			} else if (randomScore == 800) {
				System.out.println("�����, �ѿ켼Ʈ, ���� ��÷!");
				break;
			} else if (randomScore == 700) {
				System.out.println("�ѿ켼Ʈ, ���� ��÷!");
				break;
			} else if (randomScore == 600) {
				System.out.println("���� ��÷!");
				break;
			} else {
				System.out.println("ĩ�� ��÷!");
				break;
			}
		}
		System.out.println("���ϵ帳�ϴ�!");
	}
}
