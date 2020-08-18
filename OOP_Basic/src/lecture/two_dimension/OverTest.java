package lecture.two_dimension;

//배열도 타입

public class OverTest {
	
	int[] add(int[] source) {
		int[] target = new int[source.length];	 ////////////////////
		for (int i = 0; i < target.length; i++) {
			target[i] = source[i] + 1;
		}
		return target;
	}
	
	public static void main(String[] args) {
		OverTest overTest = new OverTest();
		int[] source = {1, 2, 3, 4};
		int[] ret = overTest.add(source);
		for (int i : ret) {
			System.out.print(i + "\t");
		}
	}
}
