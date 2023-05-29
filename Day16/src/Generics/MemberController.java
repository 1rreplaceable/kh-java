package Generics;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MemberController {

	private HashMap<String, Member> map = new HashMap<>();

	boolean joinMemberShip(String id, Member temp) {

		map.put(id, temp);

		boolean res = map.containsKey(id);

		return res;
	}

	String login(String id, String pass) {
		if (map.containsKey(id)) {
			if (map.get(id).getPass().equals(pass)) {
				return map.get(id).getName();
			} else {
				return "";
			}
		} else {
			return "";
		}
	}

	boolean changePassword(String id, String oldPw, String newPw) {
		if (map.containsKey(id)) {
			map.get(id).setPass(newPw);
			return true;
		} else {
			return false;
		}
	}

	void changeName(String id, String newName) {
		map.get(id).setName(newName);
	}

	TreeMap<String, Member> sameName(String name) {
		TreeMap<String , Member> names = new TreeMap<>();
		
		for (Entry<String, Member> entry : map.entrySet()) {
			if(entry.getValue().equals(name)){
				names.put(entry.getKey(),entry.getValue());
			}
		}
		return names;
	}
}
