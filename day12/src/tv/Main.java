package tv;

public class Main {
	public static void main(String[] args) {
		// 객체 생성
		TV tv = new TV();
		
		// 생성된 TV객체의 기능 테스트
		tv.turn();
		tv.chUp(80);
		tv.chUp(90);
		tv.chUp(800);
		tv.chUp(28);
		tv.chUp(20);
		tv.chDown(18);
		tv.chDown(1);
		tv.chDown(30);
		tv.volUp(70);
		tv.volUp(15);
		tv.volUp(10);
		tv.volUp(10);
		tv.volDown(50);
		tv.volDown(40);
		tv.volDown(20);
		tv.volDown(20);
		tv.volUp(30);
		tv.shut();
		tv.shut();
		tv.chUp();
		tv.volUp();
		tv.volDown(30);
		tv.volDown();
		tv.volDown();
		tv.shut();
		tv.volDown();
		tv.turn();
		tv.chUp();
		tv.chUp();
	}
}




