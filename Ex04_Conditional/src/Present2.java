
public class Present2 {
	public static void main(String[] args) {
		int randomScore = ((int) (Math.random() * 10 + 1)) * 100;
		System.out.println(randomScore + "Á¡ ÀÔ´Ï´Ù.");

		while (true) {
			if (randomScore == 1000) {
				System.out.println("TV, NoteBook, ³ÃÀå°í, ÇÑ¿ì¼¼Æ®, ÈŞÁö ´çÃ·!");
				break;
			} else if (randomScore == 900) {
				System.out.println("NoteBook, ³ÃÀå°í, ÇÑ¿ì¼¼Æ®, ÈŞÁö ´çÃ·!");
				break;
			} else if (randomScore == 800) {
				System.out.println("³ÃÀå°í, ÇÑ¿ì¼¼Æ®, ÈŞÁö ´çÃ·!");
				break;
			} else if (randomScore == 700) {
				System.out.println("ÇÑ¿ì¼¼Æ®, ÈŞÁö ´çÃ·!");
				break;
			} else if (randomScore == 600) {
				System.out.println("ÈŞÁö ´çÃ·!");
				break;
			} else {
				System.out.println("Ä©¼Ö ´çÃ·!");
				break;
			}
		}
		System.out.println("ÃàÇÏµå¸³´Ï´Ù!");
	}
}
