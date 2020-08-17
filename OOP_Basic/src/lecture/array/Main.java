package lecture.array;

public class Main {
	public static void main(String[] args) {
		
		//°´Ã¼ ¹è¿­ »ý¼º
		Emp[] emp = new Emp[3];
		
		//°´Ã¼ ÇÒ´ç
		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Emp();
		}

		String[] nameList = {"È«±æµ¿", "±èÀ¯½Å", "À¯°ü¼ø"};
		
		//setter·Î °´Ã¼ ¼Ó¼º ÇÒ´ç
		for (int i = 0; i < emp.length; i++) {
			emp[i].setEmpNo((i + 1) * 1000);
			emp[i].setEmpName(nameList[i]);
		}
		
		//°´Ã¼ ¼Ó¼º Ãâ·Â
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i].toString());
		}
	}
}
