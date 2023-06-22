package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Ex11 {
	public static void main(String[] args) {
		
		// 1부터 1000 사이의 정수 중 3의 배수, 5의 배수, 7의 배수의 개수를 각각 구하세요
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String qotn3 = "3의 배수";
		String qotn5 = "5의 배수";
		String qotn7 = "7의 배수";
		int num = 1;
		
		while(num <= 1000) {
			if(num % 3 == 0) {
				map.put(qotn3, map.getOrDefault(qotn3, 0) + 1);
			}
			if(num % 5 == 0) {
				map.put(qotn5, map.getOrDefault(qotn5, 0) + 1);
			}
			if(num % 7 == 0) {
				map.put(qotn7, map.getOrDefault(qotn7, 0) + 1);
			}
			num++;
		}
		
		Set<String> keySet = map.keySet();
		ArrayList<String> list = new ArrayList<String>();
		
		for (String key : keySet) {
			int value = map.get(key);
			list.add(key + " : " + value);
		}
		list.sort(null);
		System.out.println(list);
	}
}
