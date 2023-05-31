package tv;

class RemoteController {
	TV tv; // TV 객체를 참조할 수 있는 참조 변수

	RemoteController() {
		System.out.println("연결된 tv가 없습니다.");
	}

	void setTV(TV tv) {
		this.tv = tv;
		System.out.println("tv가 연결되었습니다.");
	}

	void turn() {
		if (tv != null) {
			tv.turn();
		}
	}

	void chUp() {
		if (tv != null) {
			tv.chUp();
		}
	}

	void chUp(int chUp) {
		if (tv != null) {
			tv.chUp(chUp);
		}
	}

	void chDown() {
		if (tv != null) {
			tv.chDown();
		}
	}

	void chDown(int chDown) {
		if (tv != null) {
			tv.chDown(chDown);
		}
	}

	void volUp() {
		if (tv != null) {
			tv.volUp();
		}
	}

	void volUp(int volUp) {
		if (tv != null) {
			tv.volUp(volUp);
		}
	}

	void volDown() {
		if (tv != null) {
			tv.volDown();
		}
	}

	void volDown(int volDown) {
		if (tv != null) {
			tv.volDown(volDown);
		}
	}

	void shut() {
		if (tv != null) {
			tv.shut();
		}
	}

	void setChannel(int channel) {
		tv.setChannel(channel);
	}
}
