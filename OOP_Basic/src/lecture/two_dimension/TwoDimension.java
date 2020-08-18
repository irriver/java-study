package lecture.two_dimension;

public class TwoDimension {
	public static void main(String[] args) {
		int[][] score = new int[3][2];
		//put data...
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = i + j ;
			}
		}
		
		//out data...
//		for (int i = 0; i < score.length; i++) {
//			for (int j = 0; j < score[i].length; j++) {
//				System.out.print("[" + i + "]" + "[" + j + "]" + score[i][j] + "\t");
//			}
//			System.out.println();
//		}
//		
		int[][] score2 = new int[][] {
			{1, 2},
			{3, 4},
			{5, 6}
		};

		for (int[] row : score2) {			//row <- {1, 2}, {3, 4}, {5, 6}
			for (int col : row) {			//col <- 1, 2	3, 4	5, 6
				System.out.print(col + "\t");
			}
			System.out.println();
		}
	}
}
