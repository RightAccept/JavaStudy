package exception;

public class Ex05 {
//		throws : callee에서 발생한 예외를 caller에게 전가시킨다 
//		예외를 무한정 전가시키기 위함이 아니다
//		하위 코드에서 발생한 예외를 적절한 상위 단계에서 모아서 일괄적으로 처리하고,
//		예외 처리의 효율성을 증대시키기 위한 문법이다
	public static void main(String[] args) throws InterruptedException {
		
		for(int i = 5; i != -1; i--) {
			System.out.println(i);
//			try {
				Thread.sleep(1000);
//			} catch(InterruptedException e) {}
		}
		System.out.println("End");
		
	}
}
