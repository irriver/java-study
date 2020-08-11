package kr.or.bit;

/*
 
 	Return Type	of Method		>>	primitive + String, Array, Class, Collection, Interface
 	Parameter Type	of Method	>>	primitive + String, Array, Class, Collection, Interface
	
	Car print() { return new Car(); }	->	{Car c = new Car(); return c; }
	boolean print(boolean boo) { return true/false); }
	
 */
public class FunctionTest {
	
	public void callMethod() {
		System.out.println("No return type and Parameter");
	}
	
	public void callMethod2(int param) {
		System.out.println("No return type but has Paramter: " + param);
	}
	
	public int callMethod3() {
		return 100;
	}
	
	public int callMethod4(int param) {
		return 100 + param;
	}
	
	public int sum(int one, int two, int three) {
		return one + two + three;
	}
	
//	default int subSum()...
//	�Լ��� �ٸ� �Լ��� ������ ���� �� �־�	>> ������ �ܺη� ����� �ʿ�� ����(���ο��� ���: �������� ���� ����)
//	�ɷ��� ���ο����� � ���������� �������� �ʾ�
	private int subSum(int i) {
		return i + 100;
	}
//	Ŭ���� ���ο����� ��밡���� ���� �Լ� ��!
	public void callSubSum() {
		int result = subSum(8);
		System.out.println(result);
	}
	
	private int operationMethod(int data) {
		return data * 100;
	}
	
	public int opSum(int data) {
		int result = operationMethod(data);
		if (result > 0) {
			return 1;
		} else {
			return -1;
		}
	}
}
