package period;

class Solution {
	public boolean isConflict(int n1, int n2, int n3, int n4) {
		boolean answer = true;
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		
		boolean b1 = s.isConflict(1, 5, 3, 7);	// 1 ~ 5, 3 ~ 7 (true)
		boolean b2 = s.isConflict(1, 3, 5, 7);	// 1 ~ 3, 5 ~ 7 (false)
		boolean b3 = s.isConflict(1, 7, 3, 5);	// 1 ~ 7, 3 ~ 5 (true)
		boolean b4 = s.isConflict(3, 5, 1, 7);	// 3 ~ 5, 1 ~ 7 (true)
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}
}
