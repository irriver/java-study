package quiz.constructor;

public class Airplane {
	private int airnums;
	private String airname;
	private static int airtotalcount;
	
	public Airplane(int airnums, String airname) {
		this.airnums = airnums;
		this.airname  =  airname;
		airtotalcount++;
	}


	public static void main(String[] args) {
		Airplane boeing = new Airplane(747, "Boeing-747");
		Airplane airbus = new Airplane(320, "AirBus-320");
		
		System.out.println("--- Info of [Boeing-747] ---");
		System.out.println("Name: " + boeing.airname);
		System.out.println("No: " + boeing.airnums);
		System.out.println("Total: " + airtotalcount);
	}
}
