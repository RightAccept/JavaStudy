package thread;

import java.util.Scanner;

class Timer2 implements Runnable {
	private boolean over = false;
	private Question q;

	@Override
	public void run() {
		for (int i = 5; i != -1 && q.isWrite() == false; i--) {
			System.out.printf("\n%02d : %02d\t", i / 60, i % 60);
			try { Thread.sleep(1000); } catch (Exception e) {}
		}
		over = true;
	}

	public void setQuestion(Question q) {
		this.q = q;
	}

	public boolean isOver() {
		return over;
	}
}

class Question implements Runnable {
	
	private Scanner sc = new Scanner(System.in);
	private boolean write = false;
	private Timer2 timer;
	
	public void setTimer(Timer2 timer) {
		this.timer = timer;
	}
	
	public boolean isWrite() {
		return write;
	}
	
	@Override
	public void run() {
		System.out.println("문제) 다음 중 출연 작품이 서로 다른 하나는?");
		System.out.println("1. 짱구");
		System.out.println("2. 유리");
		System.out.println("3. 철수");
		System.out.println("4. 코난");
		System.out.println("5. 훈이");
		System.out.print("입력 >>> ");
		int answer = sc.nextInt();
		write = true;
		if(answer == 4 && timer.isOver() == false) {
			System.out.println("정답");
		}
		else {
			System.out.println("오답");
		}
		sc.close();
	}
}

public class Ex04 {
	public static void main(String[] args) {

		// 타이머가 시작된 후 문제를 낸다
		// 문제는 객관식으로 1번에서 5번까지의 선택지가 있다
		// 답을 입력하면 정답/오답을 판별하여 출력해야 한다
		// 정답/오답 여부에 상관없이 타이머가 종료되었다면 오답으로 판정한다
		// 이미 입력이 끝났다면 더 이상 타이머를 진행하지 않아야 한다
		
		Timer2 timer = new Timer2();
		Question question = new Question();
		
		Thread th1 = new Thread(timer);
		Thread th2 = new Thread(question);
		
		timer.setQuestion(question);
		question.setTimer(timer);
		
		th2.start();
		th1.start();
	}
}
