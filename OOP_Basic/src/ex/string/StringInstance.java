package ex.string;

public class StringInstance {
	public static void main(String[] args) {
		String str1 = "abc";	//Addr of "abc" reserved in str1
		String str2 = "abc";	//Addr of "abc" reserved in str2
		
		String str3 = new String("abc");	//create new instance of String
		String str4 = new String("abc");
		
//		Comparing Address between String Instance
		System.out.println(str1 == str2);	//true
		System.out.println(str3 == str4);	//false	
	}
}
