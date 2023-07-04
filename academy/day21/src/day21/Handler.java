package day21;

import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Handler {
	private ArrayList<PhoneBookInfo> list = new ArrayList<>();
	private final String fileName = "phonebook.txt";

	// 저장
	public int save() throws Exception {
		int row = 0;
		File f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		for (PhoneBookInfo info : list) {
			fw.write(info.toString() + "\n");
		}
		fw.flush();
		fw.close();
		row = 1;

		return row;
	}

	// 불러오기
	public void load() throws Exception {
		File f = new File(fileName);
		if (f.exists() == false) { // 만약 파일이 없다면
			f.createNewFile(); // 지정한 이름으로 파일을 생성하고
			return; // 불러오는 내용은 수행하지 않는다(어차피 내용이 없다)
		}
		Scanner sc = new Scanner(f);
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String name = line.split(", ")[0];
			int age = Integer.parseInt(line.split(", ")[1]);
			String pnum = line.split(", ")[2];
			list.add(new PhoneBookInfo(name, age, pnum));
		}
		sc.close();
	}

	// 전체 목록
	public List<PhoneBookInfo> select() {
		return list;
	}

	// 추가
	public int append(PhoneBookInfo tmp) {
		int row = 0;
		list.add(tmp);
		row = 1;
		return row;
	}

	// 검색
	public PhoneBookInfo search(String search) {
		PhoneBookInfo info = null;
		for (PhoneBookInfo tmp : list) {
			if (tmp.getName().equals(search)) {
				info = tmp;
			}
		}
		return info;
	}

	// 삭제
	public int delete(String search) {
		int row = 0;
		int index = 0;
		for (PhoneBookInfo tmp : list) {
			if (tmp.getName().equals(search)) {
				index = list.indexOf(tmp);
				list.remove(index);
				row = 1;
				break;
			}
		}

		return row;
	}
}
