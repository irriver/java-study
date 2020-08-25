package quiz.collections;

import java.util.ArrayList;

public class EmpMain {
	public static void main(String[] args) {
		EmpData ed = new EmpData();
		System.out.println(ed);
		System.out.println("Before add data... " + ed.getAlist());
		
		
//		ArrayList li = new ArrayList();
//		
//		li.add(111);
//		li.add("Str");
//		li.add(ed.toString());
//		
//		//EmpData에   ArrayList 타입의 매개변수를 넘겨줌
//		ed.setAlist(li);
		
//		ArrayList<String> strList = new ArrayList<String>();
//		strList.add("abc");
//		strList.add("sdf");
//		ed.setAlist(strList);
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		ed.setAlist(intList);
		
		System.out.println("After add data... " + ed.getAlist());
	}
}
