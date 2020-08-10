public class Assignment_01_Print_Garam {
	public static void main(String[] args) {
		
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int num = 1;
		for (int i = 0; i < 10; i++ ) {
			for (int j = 0; j < 10; j++) {
				System.out.print(num + "\t");
				num++;
			}
			System.out.println();
		}
	}
}
