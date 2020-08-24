package lecture.inheriatance;

class Children extends Parents {
	String cName;
	
	Children() {
		System.out.println("Default Children Constructor");
	}
	
	Children(String cName) {
		//overloaded parent's constructor
		//super's constructor must be called in first line
		super(cName);
		this.cName = cName;
		System.out.println("cName: " + cName);
		
	}
	
	@Override
	void method() {
		System.out.println("Children method");
	}
	
	void parent_method() {
		super.method();
	}
}

public class Parents {
	String pName;
	Parents() {
		System.out.println("Default Parent Constructor");
	}
	
	Parents(String pName) {
		this.pName = pName;
		System.out.println("pName: " + pName); 
	}
	
	void method() {
		System.out.println("Parent's method");
	}
	
	public static void main(String[] args) {
		Children child = new Children("Spoiled Child");
	}
}
