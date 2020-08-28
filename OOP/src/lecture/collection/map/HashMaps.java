package lecture.collection.map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMaps {
	public static void main(String[] args) {
		HashMap loginMap = new HashMap();
		loginMap.put("kim", "1234");
		loginMap.put("scott", "tiger");
		loginMap.put("lee", "1234");
		
//		System.out.println(loginMap.toString());
		Scanner sc = new Scanner (System.in);
		while (true) {
			System.out.println("Enter Id Password..");
			System.out.println("Id >> ");
			String id = sc.nextLine().trim().toLowerCase();
			
			String pw = sc.nextLine().trim();
			if (!loginMap.containsKey(id)) {
				System.out.println("No such Id..");
			} else {
				System.out.println("Password >> ");
				pw = sc.nextLine().trim();
				if (loginMap.get(id).equals(pw)) {
					System.out.println("Login Success!");
					break;
				} else {
					System.out.println("Wrong Password..");
				}
			}
		}
	}
}
