
public class PresentSwitch {
	public static void main(String[] args) {
		
		String present = "";
		int randomScore = ((int) (Math.random() * 10 + 1)) * 100;
		
		switch(randomScore) {
		case 1000: present += "TV";
		case 900: present += "NoteBook ";
		case 800: present += "����� ";
		case 700: present += "�ѿ켼Ʈ ";
		case 600: present += "���� ";
		default: present += "ĩ�� ";
		}
		System.out.printf("������ ������ " + randomScore + "�̰�\n" + "��ǰ�� " + present + "�Դϴ�.");
	}
}
