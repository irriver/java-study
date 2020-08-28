package lecture.collection.set;

import java.util.HashSet;
import java.util.Iterator;

class Myclass {
	private int id;
	private String name;
	public Myclass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void displayInfo() {
		System.out.println("ID >> " + this.id);
		System.out.println("NAME >> " + this.name);
	}
	
	public static void display(Myclass c) {
		c.displayInfo();
	}

	@Override 
	public String toString() {
		return "Myclass [ID=" + id + ", NAME=" + name + "]";
	}
}

public class SetObj {
	public static void main(String[] args) {
		HashSet<Myclass> hsMy = new HashSet<Myclass>();
		Myclass my1 = new Myclass(1, "JAN");
		Myclass my2 = new Myclass(2, "FEB");
		Myclass my3 = new Myclass(3, "MAR");
		
		hsMy.add(my1);
		hsMy.add(my2);
		hsMy.add(my3);
		
		Iterator<Myclass> itrMy = hsMy.iterator();
		while (itrMy.hasNext()) {
			System.out.println(itrMy.next());
//			System.out.println(itrMy.next().toString());
		}
	}
}
