package quiz_class;

public class MainBody {
	int noOfCpus;
	int memSize;
	private char[] price;
	
	public MainBody(int noOfCpus, int memSize) {
		this.memSize = memSize;
		this.noOfCpus = noOfCpus;
	}

	public static void main(String[] args) {
		
		Computer comMac = new Computer(10000, "Apple", "ac-1234", "Space Grey");
		MainBody mainBody = new MainBody(4, 16);
		
		comMac.mainBody = new MainBody(4, 16);
		System.out.println(mainBody.price);
	}
}
