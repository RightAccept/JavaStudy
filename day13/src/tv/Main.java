package tv;

public class Main {
	public static void main(String[] args) {
		TV tv = new TV();
		RemoteController remocon = new RemoteController();
		
		// 리모컨의 메서드를 호출하면, TV의 기능이 작동하도록 코드를 작성하여
		// 아래에서 테스트하세요
		remocon.setTV(tv);
		remocon.turn();
		remocon.chUp();
		remocon.chUp(50);
		remocon.volUp();
		remocon.volUp(30);
		remocon.setChannel(842);
		remocon.turn();
		remocon.setChannel(432);;
		remocon.turn();
		remocon.shut();
	}
}
