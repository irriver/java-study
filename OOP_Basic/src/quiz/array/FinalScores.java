package quiz.array;

public class FinalScores {
	static int findMax(int[] arr) {
		int max = arr[0];
		for (int idx = 0; idx < arr.length; idx++) {
//			if (max < arr[idx]) {
//				max = arr[idx];
//			}
		max = (arr[idx] > max) ? arr[idx] : max;
		}
		return max;
	}
	
	static int findMin(int[] arr) {
		int min = arr[0];
		for (int idx = 0; idx < arr.length; idx++) {
			if (min > arr[idx]) {
				min = arr[idx];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		int[] scores = new int[] {79, 88, 97, 54, 56, 95};
		
//		Q. 배열도 객체라서 인스턴스 생성 후 인스턴스 메소드를 사용 가능한데 어떻게??
		int maxResult = findMax(scores);
		int minResult = findMin(scores);
		
		System.out.println("Max: " + maxResult + " | " + "min: " + minResult);
	}
}	
