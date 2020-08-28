package lecture.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Student {
	private String name;
	private ArrayList<int[]> score; 
//	private int kor;
//	private int eng;
//	private int math;
//	public Student(String name, int kor, int eng, int math) {
//		super();
//		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//	}
	public Student(String name, ArrayList<int[]> score) {
		this.name = name;
		this.score = new ArrayList<int[]>();
	}
}

public class HashMapEx {
	public static void main(String[] args) {
		
//		//key + "=" + value -> 증복값이 없다
//		Set<E> set = hmStudent.entrySet();
//		Iterator<E> itr = set.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.      );
//		}
		HashMap<String, Student> hmStud = new HashMap<String, Student>();
//		hmStud.put("Disney-A11", new Student("Pooh", ));
	}
}
