package programmers;

import java.util.Stack;

class Solution2_stack {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		
		Stack<Integer> basket = new Stack<>();
		for(int i = 0; i < moves.length; i++) {
			// index 번째 인형을 꺼낸다
			int index = moves[i] - 1;
			for(int j = 0; j < board.length; j++) {	// 인형이 담긴 통은 N x N 정사각형
				if(board[j][index] != 0) {	// 인형이 있다면
					int size = basket.size();
					if(size >= 1 && board[j][index] == basket.get(size - 1)) {
						basket.remove(size - 1);
						answer += 2;
					}
					else {
						basket.add(board[j][index]);	// 꺼낸 인형을 바구니에 넣는다
					}
					board[j][index] = 0;	// 인형을 꺼낸 자리는 0을 대입한다
					break;					// 인형 하나 꺼냈으면 더 이상 반복하지 않는다				
				}
			}
		}
		System.out.println();
		
		return answer;
	}
}

public class Quiz1_teacher_stack {
	static void show(int[][] board) {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				String s = "";
				switch(board[i][j]) {
				case 0:		s = " "; break;
				case 1:		s = "1"; break;
				case 2:		s = "2"; break;
				case 3:		s = "3"; break;
				case 4:		s = "4"; break;
				case 5:		s = "5"; break;
				}
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Solution2_stack s = new Solution2_stack();
		int[][] board = { 
				{ 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 3 },
				{ 0, 2, 5, 0, 1 },
				{ 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 }
		};
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		
		show(board);
		
		int answer = s.solution(board, moves);
		
		show(board);
		System.out.println("answer = " + answer);
		System.out.println(answer == 4 ? "정답" : "오답");
	}
}
