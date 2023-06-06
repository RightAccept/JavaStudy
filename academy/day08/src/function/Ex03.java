package function;

public class Ex03 {

	static int absolute(int num) {
		int answer = 0;		// 반환값에 맞는 변수를 생성한다
		// 여기에 코드를 작성한다(매개변수를 활용한 코드)
		if(num < 0) {
			answer = -num;
		}
		else {
			answer = num;
		}
		return answer;
	}
	
	
	// main함수가 static 속성이므로, main에서 바로 호출하려면 함수도 static이여야 한다
	public static void main(String[] args) {
		// 정수를 하나 전달받아서 정수의 절대값을 반환하는 함수
		// int를 하나 전달받아서, int를 반환한다 (반환값은 하나만 가능)
		
		System.out.println("absolute(-3) : " + absolute(-3));
		System.out.println("absolute(3) : " + absolute(3));
		
		// 정수로 반지름을 전달받아서, 원의 넓이를 계산하여 반환하는 함수를 작성하세요
		// 원의 넓이 = 반지름 * 반지름 * 3.14
		
		double s1 = getCircleSize(3);
		double s2 = getCircleSize(4);
		System.out.printf("s1 : %.2f\n", s1);
		System.out.printf("s2 : %.2f\n", s2);
		System.out.println();
		
		// 두 정수를 전달하여, 큰 값을 반환하는 함수를 작성하세요
		int n1 = getBigNumber(5, 3);
		int n2 = getBigNumber(-5, 3);
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
	}	// end of main
	
	static double getCircleSize(int num) {
		double size;
		size = num * num * 3.14;
		
		return size;
	}
	
	static int getBigNumber(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
		}
	}
