package loop;

import java.util.Scanner;

public class Quiz5_success {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		int cnt=0;
		String n2 = "";
		String tmp = "";

		System.out.print("입력 : ");
		n1 = sc.nextInt();
		
		while (n1 != 0) {
			tmp += n1 % 10;
			n1 /= 10;
			cnt++;
			if(cnt % 3 ==0 && n1 > 0) {
				tmp += ",";
			}
		}
		
		System.out.println("tmp : " + tmp);
		
		for (int i = tmp.length() - 1; i >= 0; i--) {
			n2 = n2 + tmp.charAt(i);
		}
		System.out.println("n2 : " + n2);
		
		sc.close();
	}
}
