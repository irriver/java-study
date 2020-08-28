package lecture.generic;

import java.util.ArrayList;

class MyGeneric<A> {
	A obj;

	void add(A obj) {
		this.obj = obj;
	}

	A get() {
		return this.obj;
	}
}

class Person extends Object {
	int age = 100;
}

public class Generics {
	public static void main(String[] args) {
		MyGeneric<String> myGen = new MyGeneric<String>();
		myGen.add("Only String can be possible.");
		String str = myGen.get();
		System.out.println(str);

		ArrayList list = new ArrayList();
		list.add(new Person());
		list.add(10);
		list.add("All types can be allocated!");

		for (Object elem : list) {
//			System.out.println(elem);
//			그런데, Person 객체의 나이만 출력하려면 어떻게 해야 할까?
			if (elem instanceof Person) {
				Person p = (Person) elem;
				System.out.println(p.age);
			} else {
				System.out.println(elem);
			}
		}
		
		ArrayList<Person> plist = new ArrayList<Person>();
	}
}
