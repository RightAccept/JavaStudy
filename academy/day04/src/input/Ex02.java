package input;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		// java 1.5버전부터 등장
		Scanner sc = new Scanner(System.in);
		
		// 정수 입력받기
		int num;
		System.out.print("정수 입력 : ");
		num = sc.nextInt();	// 숫자, \r, \n
		sc.nextLine();
		
		// 실수 입력받기
		double db;
		System.out.print("실수 입력 : ");
		db = sc.nextDouble();	//  숫자, \r, \n
		sc.nextLine();
		
		// 문자열 입력받기
		String str;
		System.out.print("문자열 입력 : ");
//		str = sc.next();		// 엔터키와 띄어쓰기 앞까지 받아온다
		// 입력데이터의 기본처리 자료형은 문자열이다!!
		 str = sc.nextLine();	// 줄 단위, 엔터키를 입력할 때까지의 내용을 가져온다, 띄어쓰기를 포함한다
		// 띄어쓰기를 포함하여 가져오기 위해서 nextLine을 사용해야 하지만, 앞에 nextInt와 nextDouble이 엔터키를 버퍼에 남겨두고 가서 값을 입력받지 못한다.
		// 버퍼가 정리되지 않았다면 정상적으로 처리할 수 없다
		 
		// 따라서 nextLine을 사용하기 위해서는 버퍼를 비워주는 작업이 필요
		// 차라리 wrapper 클래스로 받아오는게 속 편하다
//		String str2;
//		str2 = sc.nextLine();
		
		System.out.println("num : " + num);
		System.out.println("db : " + db);
		System.out.println("str : " + str);
		
		sc.close();	// 다 사용한 통로는 반드시 닫아주기!
	}
}

