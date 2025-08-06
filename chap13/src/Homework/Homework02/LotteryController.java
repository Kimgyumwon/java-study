package Homework.Homework02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LotteryController {
	Set<Lottery> lottery =  new HashSet<Lottery>();
	Set<Lottery> win = new HashSet<Lottery>();
	
	public boolean insertObject(Lottery l) {
		lottery.add(l);
		return true;
	}
	
	public boolean deleteObject(Lottery l) {
		if (lottery.contains(l)) {
			lottery.remove(l);
		} else {
			return false;
		}
		if(!(win.isEmpty())) {
			win.remove(l);
		}
		return true;
	}
	public Set<Lottery> searchObject(){
		return lottery;
	}
	
	public Set<Lottery> winObject(){
		if (lottery.size() < 4) {
			return null;
		}
		// 기존 당첨자 목록에서 삭제된 대상자가 있으면 제거 
		win.retainAll(lottery);
		if (win.size() < 4) {
	        // 후보자: 추첨 대상 중 아직 당첨되지 않은 사람들
	        List<Lottery> candidates = new ArrayList<>(lottery);
	        candidates.removeAll(win);

	        if (candidates.size() < (4 - win.size())) return null;

	        Collections.shuffle(candidates);
	        win.addAll(candidates.subList(0, 4 - win.size()));
		}

		    return win;
	}
	public Set<Lottery> sortedWinObject(){
		List<Lottery> list = new ArrayList<Lottery>(win);
		Collections.sort(list);
		Set<Lottery> link = new LinkedHashSet<Lottery>(list);
		return link;
	}
	
	public boolean searchWinner(Lottery l) {
		
		if (win.contains(l)) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
