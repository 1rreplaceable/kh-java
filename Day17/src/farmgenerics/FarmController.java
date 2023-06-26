package farmgenerics;

import java.util.ArrayList;
import java.util.HashMap;

public class FarmController {

	HashMap<Farm, Integer> h = new HashMap<>();
	ArrayList<Farm> list = new ArrayList<>();

	public boolean addNewKind(Farm f, int amount) {
		if (!(h.containsKey(f))) {
			h.put(f, amount);
			return true;
		}
		return false;
	}

	public boolean removeKind(Farm f) {
		if (h.containsKey(f)) {
			h.remove(f);
			return true;
		}
		return false;
	}

	public boolean changeAmount(Farm f, int amount) {
		if (h.containsKey(f)) {
			h.put(f, amount);
			return true;
		}
		return false;
	}

	HashMap<Farm, Integer> printFarm(){
		return h;
	}
	public boolean buyFarm(Farm f) {
		if (h.containsKey(f) && h.getOrDefault(f, null) > 0) {
			list.add(f);
			int amount = h.getOrDefault(f, null) - 1;
			h.put(f, amount);
			return true;
		}
		return false;
	}

	public boolean removeFarm(Farm f) {
		if (h.containsKey(f)) {
			list.remove(f);
			int amount = h.getOrDefault(f, null) + 1;
			h.put(f, amount);
			return true;
		}
		return false;
	}
	ArrayList<Farm> printBuyFarm() {
		return list;
	}
}
