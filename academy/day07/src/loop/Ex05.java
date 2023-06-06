package loop;

public class Ex05 {
	public static void main(String[] args) {
		// 다음 모양의 문자열을 만들어서 화면에 출력하세요

		// ====*====*====*====*====
		String str = "";
//		for(int i = 0; i < 20 ; i++) {
//			if(i % 4 == 0 && i != 0) {
//				str += "*";
//			}
//			str += "=";
//		}

//		for(int i = 0; i < 5; i++) {
//			str += "====";
//			if(i != 4) {
//				str += "*";				
//			}
//		}

		for (int i = 1; i < 25; i++) {
			if (i % 5 == 0) {
				str += "*";
			} else {
				str += "=";
			}
		}
		System.out.println(str);
	}
}
