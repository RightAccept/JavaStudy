package programmers;

class Solution {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		int basket[] = new int[moves.length];
		int line = board.length;
		int save = 0;
		
		// 크레인의 이동 횟수만큼 반복한다
		for(int i = 0; i < moves.length; i++) {
			// board의 열의 크기만큼 반복한다
			// 인형이 존재한다면 밑으로 밀어넣어서 뽑아야 하기 때문에, 있을 때 까지 반복한다
			for(int y = 0; y < line; y++) {
				// 메겨진 번호가 1, 2, 3, 4, 5이기 때문에, moves에서 1을 빼준다
				// 만약 board의 y번째 줄의 moves의 위치가 0이 아니면
				// = 뽑을 인형이 있으면
				if(board[y][moves[i]-1] != 0) {
					// 저장공간 basket의 save번째에 뽑은 인형을 넣는다
					basket[save++] = board[y][moves[i]-1];
					// 뽑은 자리를 0으로 바꾼다
					board[y][moves[i]-1] = 0;
					
					// 뽑은 인형을 터트리는 반복
					for(int j = save; j > 0; j--) {
						
						// 만약 basket의 두 자리가 같고, 앞자리가 0이 아니면 => 빈 공간이 아닐 때, 같은 인형 2개가 모이면
						if(basket[j] == basket[j-1] && basket[j] != 0) {
							// 앞자리와 뒷자리 모두 0으로 바꾸고 => 인형을 터트리고
							basket[j] = basket[j+2];
							basket[j-1] = basket[j+1];
							// 저장공간 번호도 2줄인다 => 인형 터트린 공간을 다른 인형으로 채울 수 있게 만든다
							save -= 2;
							// 터트린 개수를 저장한다
							answer += 2;
						}	// if
					}	// for
					// 크레인 이동을 초기화하는 break
					// break하지 않으면, 같은 자리에 있는 인형을 모두 뽑아버린다
					break;
				}	// if
			}	// for
		}	// for
		
		return answer;
	}
}

public class Quiz1 {
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
		Solution s = new Solution();
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
