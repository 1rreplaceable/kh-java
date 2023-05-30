package lotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class LotteryController {

	HashSet<Lottery> lottery = new HashSet<>();
	HashSet<Lottery> win = new HashSet<>();

	public boolean insertObject(Lottery l) {
		if (!(lottery.contains(l))) {
			lottery.add(l);
			return true;
		} else {
			return false;
		}
	}

	public boolean deleteObject(Lottery l) {
		if (lottery.contains(l) && !(win.contains(l))) {
			lottery.remove(l);
			return true;
		} else {
			return false;
		}
	}

	public HashSet<Lottery> winObject() {
		Random r = new Random();
		Lottery[] arr = new Lottery[lottery.size()];
		lottery.toArray(arr);
		while (win.size() < 4) {
			int ran = r.nextInt(lottery.size());
			win.add(arr[ran]);
		}
		return win;
	}

//	TreeSet<Lottery> sortedWinObject(){}
	boolean searchWinner(Lottery l) {
		if (win.contains(l)) {
			return true;
		} else {
			return false;
		}
	}
}
