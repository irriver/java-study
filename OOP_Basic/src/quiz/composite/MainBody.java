package quiz.composite;

public class MainBody {
	int noOfCpus;
	int memSize;
	
	public MainBody(int noOfCpus, int memSize) {
		this.memSize = memSize;
		this.noOfCpus = noOfCpus;
	}

	public static void main(String[] args) {
		MainBody mBody = new MainBody(4, 16);
		KeyBoard keyB = new KeyBoard();
		Monitor mon = new Monitor();
		
		Computer com = new Computer(mBody, keyB, mon);
	}
}
