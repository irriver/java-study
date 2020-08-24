package lecture.inheriatance;

class GrandMa {
	public GrandMa() {
		System.out.println("default constructor: GrandMa");
	}

	public int gMoney = 5000;
	private int blackMoney = 2147483647;
	
	public int getBlackMoney() {
		return blackMoney;
	}
}

class Mama extends GrandMa {
	public Mama() {
		System.out.println("default constructor: Mama");
	}

	public int mMoney = 3000;

}

class Me extends Mama {
	public Me() {
		System.out.println("default constructor: Me");
	}

	public int money = 1000;

}

public class Inheritance {
	public static void main(String[] args) {
		Me me = new Me();
		System.out.println(me.gMoney);
		System.out.println(me.mMoney);
		System.out.println(me.money);

//		Object class == root class
//		모든 클래스는 Object class를 상속합니다
		
//		class Me extends Object...
		System.out.println("get private money from super using public getter(): $" + me.getBlackMoney());
	}
}