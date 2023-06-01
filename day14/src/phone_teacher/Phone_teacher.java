package phone_teacher;

public class Phone_teacher {
	private String name;
	
	public Phone_teacher(String name) {
		this.name = name;
	}
	
	// 문자열 메시지를 다른 Phone에게 보내기
	public void sendMessage(Phone_teacher target, String message) {
		target.recieveMessage(this, message);
	}
	
	// 전달받은 메세지를 화면에 출력하기
	public void recieveMessage(Phone_teacher sender, String message) {
		System.out.println("메시지 도착");
		System.out.println("보낸 사람 : " + sender.name);
		System.out.println("내용 : " + message);
		System.out.println();
	}
	
}
