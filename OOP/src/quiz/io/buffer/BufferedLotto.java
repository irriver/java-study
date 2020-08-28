package quiz.io.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class BufferedLotto {

	public String createLottoNums() {
		Set<Integer> setLotto = new HashSet<Integer>();
		while (setLotto.size() < 6) {
			setLotto.add((int) (Math.random() * 45 + 1));
		}
		return setLotto.toString();
	}

	public static void main(String[] args) {
		
		BufferedLotto lottoLogic = new BufferedLotto();
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("C:\\Dev\\WorkSpace\\IoTest\\SavedLottoNums.txt", true));
			br = new BufferedReader(new FileReader("C:\\Dev\\WorkSpace\\IoTest\\SavedLottoNums.txt"));

			bw.write(lottoLogic.createLottoNums());
			bw.newLine();
			bw.write(LocalDate.now().toString());
			bw.newLine();
			bw.write(LocalTime.now().toString());
			bw.newLine();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
