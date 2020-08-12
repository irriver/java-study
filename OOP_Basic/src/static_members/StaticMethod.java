package static_members;

public class StaticMethod {
	
	public void im() {
		System.out.println("Instance Method!");
	}
	
	public static void sm() {
		System.out.println("Static Method!");
	} 
	
	public static void main(String[] args) {
		sm();
		
		new StaticMethod().im();
		StaticMethod sm = new StaticMethod();
		sm.im();
	}
	
	
	
}
