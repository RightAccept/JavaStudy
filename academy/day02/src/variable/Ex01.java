package variable;

public class Ex01 {
	public static void main(String[] args) {
		int num;	// [자료형] [변수이름]
		num = 12;	// 변수에 값을 저장
		
		int num2 = 23;	// 변수 선언 및 초기화
		
		System.out.println(num);	// 선언된 변수는 이름만으로 참조할 수 있다
		System.out.println(num2);
		
//		int num = 25;	// 이미 선언된 변수는 자료형을 명시하지 않는다
						// 새로운 변수를 만들기 위해서는 기존 변수와 이름이 겹치지 않아야한다
		
		num2 = num;		// 대입연산의 좌변은 공간
						// 대입연산의 우변은 값
		
		num2 = num + 2 * 3 -4;	// 우변부터 먼저 처리한다
		
		num = 5;		// 대입연산자 '='는 등호가 아니다
//		5 = num;		// 등호는 '=='로 표기한다
		
		System.out.println(num2);
//		System.out.println(num3);	// 선언하지 않았거나, 값이 할당되지 않았으면 참조 불가
		
//		int num3;
//		System.out.println(num3);	// 값이 할당되지 않음
	}
}
