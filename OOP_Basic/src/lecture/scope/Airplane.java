package lecture.scope;

public class Airplane {
	public String name;
	public String serialNo;
	
	public static int noOfPlanes = 0;
	
	public void checkInfo() {
		System.out.println("���: " + name);
		System.out.println("�ø���ѹ�: " + serialNo);
		noOfPlanes++;
	}
}
