package lecture.singleton;

public class SingletonMain {
	public static void main(String[] args) {
		Singleton sing = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		Singleton sing3 = Singleton.getInstance();
	}
}
