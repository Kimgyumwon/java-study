package Homework.Homework02;

import java.util.ArrayList;
import java.util.HashSet;
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
		if (lottery.size() < 4) return null;
		List<Lottery> random = new ArrayList<Lottery>(lottery);
		int ran = (int)(Math.random()*random.size());
		while (win.size() < 4) {
			win.add(random.get(ran));
			
		}
		
		
		// 2. 랜덤으로 뽑기 위해 lottery를 ArrayList에 담고
		// 이때, 당첨자 수는 무조건 4명 이를 위한 추첨자 수는 4명 이상
		// 만일 당첨자 목록에 삭제된 추첨 대상자가 있다면
		// 기존에 당첨된 사람은 제외
		// 삭제된 사람의 자리만 새로운 추첨자로 채우기
	}
	
	
	
	
	
}
