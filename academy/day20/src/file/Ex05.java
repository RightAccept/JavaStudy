package file;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) throws Exception {
		// 프로젝트 폴더에 ex05.txt 파일을 생성한다음
		// FileWriter를 이용하여 본인의 이름과 생일을 기록하세요
		// 이름은 첫 줄, 생일은 월과 일만 두번째 줄에 기록하세요

		// Scanner를 이용하여 대상 파일을 읽어서
		// 한 줄씩 화면에 출력하세요

		File f = new File("ex05.txt");

		if (f.exists() == false) {
			f.createNewFile();
		}
		
		FileWriter fw = new FileWriter(f);
		fw.append("정수용\n");
		fw.append("11월 2일\n");
		fw.flush();	// 버퍼에 기록한 내용을 밀어넣기(flush해야 데이터가 들어간다)
		fw.close();
		
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();
		
		String command = "notepad " + f.getAbsolutePath();
		Process pro = Runtime.getRuntime().exec(command);
		Thread.sleep(5000);
		pro.destroy();
	}
}
