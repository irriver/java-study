package lecture.scope;

public class Airplane {
	public String name;
	public String serialNo;
	
	public static int noOfPlanes = 0;
	
	public void checkInfo() {
		System.out.println("편명: " + name);
		System.out.println("시리얼넘버: " + serialNo);
		noOfPlanes++;
	}
}
