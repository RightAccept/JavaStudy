package file;

import java.io.File;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		// 텍스트 파일의 내용을 읽어오기
		
		String parent = "C:\\windows\\system32\\drivers\\etc";
		String child = "hosts";
		File f = new File(parent, child);
		
		System.out.println("f가 존재하는가 : " + f.exists());
		
		if(f.exists()) {
			Scanner sc = new Scanner(f);
			
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
				Thread.sleep(500);
			}
			sc.close();
		}
	}
}
