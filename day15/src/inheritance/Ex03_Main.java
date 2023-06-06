package inheritance;

import java.util.Scanner;

public class Ex03_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex03_MessageBox box1 = new Ex03_MessageBox(sc);
		
		box1.input();
		String s1 = box1.getMessage();
		System.out.println("s1 : " + s1);
		System.out.println();
		
		Ex03_TimeMessageBox box2 = new Ex03_TimeMessageBox(sc);
		box2.input();
		String s2 = box2.getMessage();
		System.out.println("s2 : " + s2);
		System.out.println();
		
		// 이미 오버라이딩 된 객체를 참조하였기 때문에, test는 TimeMessageBox의 input을 실행한다
		Ex03_MessageBox test = box2;
		test.input();
		String s3 = test.getMessage();
		System.out.println("s3 : " + s3);
		System.out.println();
		
		Ex03_MessageBox test2 = new Ex03_MessageBox(sc);
		test2.input();
		String s4 = test2.getMessage();
		System.out.println("s4 : " + s4);
		System.out.println();
		
		sc.close();
	}
}
