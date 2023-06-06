package loop;

public class Quiz1 {
	public static void main(String[] args) {
		// 반복문을 "1번"만 사용하여 다음과 같이 출력하세요
		/*
			*   *   * 
		 	  *   * 
		  	*   *   *
		  	  *   * 
		  	*   *   *
		 */
		
		String s = "";
		for (int i = 1; i <= 25; i++) {
			if (i % 2 != 0) {
				s += "* ";
			}
			else {
				s += "  ";
			}
			if (i % 5 == 0) {
				s += "\n";
			}
		}
		System.out.println(s);
	}
}