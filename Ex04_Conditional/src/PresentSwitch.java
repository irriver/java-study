
public class PresentSwitch {
	public static void main(String[] args) {
		
		String present = "";
		int randomScore = ((int) (Math.random() * 10 + 1)) * 100;
		
		switch(randomScore) {
		case 1000: present += "TV";
		case 900: present += "NoteBook ";
		case 800: present += "냉장고 ";
		case 700: present += "한우세트 ";
		case 600: present += "휴지 ";
		default: present += "칫솔 ";
		}
		System.out.printf("고객님의 점수는 " + randomScore + "이고\n" + "상품은 " + present + "입니다.");
	}
}
