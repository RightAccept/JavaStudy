package tv;

// 필드와 메서드
// 필요하다면 생성자를 활용하여 TV객체의 구성을 클래스로 나타냅니다

// 속성(명사형)은 필드
// 기능(동사형)은 메서드로 나타냅니다

public class TV {

	// 필드
	boolean power; // = false;
	boolean shut;
	int channel = 1;
	int volume = 10;
	int savevolume;

	// 메서드
	void turn() {
		power = !power;
		if(power == true) {	// power가 boolean이라서 == true 안써도 됨.
			System.out.printf("tv를 켭니다(현재 채널 : %d번)\n", channel);
		}
		else {
			System.out.println("tv를 끕니다.");
		}
	}
	
	void chUp() {
		if(power == true) {
			if(channel < 999) {
				channel += 1;
			}
			else {
				channel = 1;
			}
			System.out.printf("현재 채널 : %d번\n", channel);
		}
	}
	
	void chDown() {
		if(power == true) {
			if(channel > 1) {	// 2일 때 1 감소해도 1, 0으로 두면 1일 때 -1해서 0번 나옴
				channel -= 1;
			}
			else {
				channel = 999;
			}
			System.out.printf("현재 채널 : %d번\n", channel);
		}
	}
	
	void chUp(int chUp) {
		if (power == true) {
			if (channel + chUp <= 999) {
				channel += chUp;
			} else if (channel + chUp > 999) {
				for (int i = 0; i < chUp; i++) {
					channel += 1;
					if (channel == 1000) {
						channel = 1;
					}
				}
//			channel += chUp;
//			channel -= 999;
			}
			System.out.printf("현재 채널 : %d번\n", channel);
		}
	}

	void chDown(int chDown) {
		if (power == true) {
			if (channel - chDown >= 1) {
				channel -= chDown;
			} else if (channel - chDown < 1) {
				for (int i = 0; i < chDown; i++) {
					channel -= 1;
					if (channel == 0) {
						channel = 999;
					}
				}
//			channel -= chDown;
//			channel += 999;
			}
			System.out.printf("현재 채널 : %d번\n", channel);
		}
	}
	
	void volUp() {
		if (power == true) {
			if (volume < 100) {
				if (shut == true) {
					shut = !shut;
				}
				volume += 1;
			}
			else {
				volume = 100;
			}
			System.out.printf("현재 볼륨 : %d\n", volume);
		}
	}
	
	void volDown() {
		if (power == true) {
			if(volume >0) {
				if (shut == true) {
					shut = !shut;
				}
				volume -= 1;
			}
			else {
				volume = 0;
			}
			System.out.printf("현재 볼륨 : %d\n", volume);
		}
	}
	
	void volUp(int volUp) {
		if (power == true) {
			if (volume < 100) {
				if(shut == true) {
					shut = !shut;
				}
				volume += volUp;
				if (volume >= 100) {
					volume = 100;
				}
			}
			else {
				shut = !shut;
			}
			System.out.printf("현재 볼륨 : %d\n", volume);
		}
	}

	void volDown(int volDown) {
		if (power == true) {
			if (volume > 0) {
				if(shut == true) {
					shut = !shut;
				}
				volume -= volDown;
				if (volume < 0) {
					volume = 0;
				}
			}
			else {
				shut = !shut;
			}
			System.out.printf("현재 볼륨 : %d\n", volume);
		}
	}

	void shut() {
		if (power == true) {
			shut = !shut;
			if (shut == true) {
				savevolume = volume;
				volume = 0;
				System.out.println("현재 볼륨 : 음소거");
			}
			if (shut == false) {
				volume = savevolume;
				System.out.println("현재 볼륨 : " + volume);
			}
		}
	}
}
