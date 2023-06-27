package file;

import java.io.File;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("a.txt");	// 파일 이름으로 지정, 부모 경로를 실행하지 않으면 현재 프로젝트 위치
		File f2 = new File("C:\\upload", "b.txt");	// 파일 위치, 파일 이름으로 지정
		File dir = new File("C:\\upload");	// 디렉토리 지정 가능
		File f3 = new File(dir, "c.txt");	// 디렉토리 위치 변수, 파일 이름 지정
		
		// 자바에서 파일 객체를 생성한다고 해서, 실제 디스크에 파일이 만들어지는 것이 아니다
		
		// exists() : 파일이 실제로 존재하는지 확인하는 메서드
		System.out.println("f1이 존재하는가 : " + f1.exists());
		System.out.println("f2이 존재하는가 : " + f2.exists());
		System.out.println("dir이 존재하는가 : " + dir.exists());
		System.out.println("f3이 존재하는가 : " + f3.exists());
		System.out.println();
		
		if(f1.exists() == false) { // 파일이 존재하지 않으면
			boolean flag1 = f1.createNewFile();	// 파일 생성, 부모 경로를 지정하지 않았기 때문에 현재 프로젝트 위치에 생성된다
			// 예외가 나오면 try-catch로 처리하거나 throws로 처리
			System.out.println("f1이 생성 되었는가 : " + flag1);
		}
		
		if(dir.exists()) {	// 폴더가 존재하면
			boolean flag2 = dir.delete();	// 폴더를 삭제
			System.out.println("dir가 삭제되었는가 : " + flag2);
		}
		
		System.out.println("f1이 존재하는가 : " + f1.exists());
		System.out.println("f1이 읽기 가능한가 : " + f1.canRead());
		System.out.println("f1이 쓰기 가능한가 : " + f1.canWrite());
		System.out.println("f1이 실행 가능한가 : " + f1.canExecute());
		System.out.println("f1이 파일인가 : " + f1.isFile());
		System.out.println("f1이 디렉토리(폴더)인가 : " + f1.isDirectory());
		System.out.println();
	}
}
