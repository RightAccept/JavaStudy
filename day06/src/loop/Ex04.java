package loop;

import java.io.*;
import java.util.*;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		// 어떤 파일을 지정하냐에 따라서 반복횟수가 달라진다

		String fileName = "src/loop/Ex01.java";		// 1
		File f = new File(fileName);				// 2
		Scanner sc = new Scanner(f);				// 3
		int cnt = 0;

		while (sc.hasNextLine()) {		// 4 // 다음 줄을 확인하여, 다음 줄이 있다면 true
			cnt += 1;
			String line = sc.nextLine();
			System.out.printf("%5d : %s\n", cnt, line);		// 5
		}
		sc.close();		// 6

	}
}
