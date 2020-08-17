package quiz.array;

public class FinalExam {
	public static void main(String[] args) {
		int sum = 0;
		float avg = 0;
		int[] scores = {100, 55, 90, 78};
		
		//1) 총 과목의 수
		int countArrs = scores.length;
		
		//2) 과목의 합, 3) 과목의 평균
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		avg = sum / countArrs;
		
		System.out.println("count: " + countArrs);
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
