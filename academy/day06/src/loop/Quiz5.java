package loop;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		String n2 = "";
		String tmp = "";
		String tmp2 = "";

		System.out.print("입력 : ");
		n1 = sc.nextInt();

		while (n1 != 0) {
			tmp += n1 % 10;
			n1 /= 10;
		}
//		for (int i = 0; i < tmp.length(); i++) {
//			char ch = tmp.charAt(i);
//			tmp2 += ch;
//			if (i != tmp.length() - 1) {
//				if (i % 3 == 0) {
//					tmp2 += ",";
//				}
//			}
//		}
		
//		while (n1 != 0) {
//		if (n1 % 1000 != 0) {
//			n3 = n1 % 1000;
//			n1 /= 1000;
//			for (int i = 0; i < 3; i++) {
//				tmp += n3 % 10;
//				n3 /= 10;
//			}
//			tmp += ",";
//		}
//		tmp += n1 % 10;
//		n1 /= 10;
//	}
		
		System.out.println("tmp : " + tmp);

		n1 = Integer.parseInt(tmp);
		tmp = "";
		while (n1 != 0) {
			tmp += n1 % 10;
			n1 /= 10;
		}
		for (int i = 0; i < tmp.length(); i++) {
			char ch = tmp.charAt(i);
			n2 += ch;
			if (i != tmp.length() - 1 && i % 3 == 0) {
				n2 += ",";
			}
		}
		
//		for (int i = 0; i < tmp.length(); i++) {
//		char ch = tmp.charAt(i);
//		tmp2 += ch;
//		if (i != tmp.length() - 1) {
//			if (i % 3 == 0) {
//				tmp2 += ",";
//			}
//		}
//	}
		
		System.out.println("n2 : " + n2);

		sc.close();
	}
}