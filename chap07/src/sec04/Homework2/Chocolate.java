package sec04.Homework2;

public class Chocolate extends Cake {
	private int cherry;
	private int chip;
	
	public Chocolate() {
	}

	public Chocolate(double flour, double cream,int cherry, int chip) {
		super(flour , cream);
		this.cherry = cherry;
		this.chip = chip;
	}

	public int getCherry() {
		return cherry;
	}

	public void setCherry(int cherry) {
		this.cherry = cherry;
	}

	public int getChip() {
		return chip;
	}

	public void setChip(int chip) {
		this.chip = chip;
	}
	
	@Override
	public String toString() {
		return "밀가루 : " + super.getFlour()+"(g)"+"\n"
		     + "크림 : " + super.getCream()+"(g)"+"\n"+
		       "체리 : " + cherry+"(개)"+"\n"+
		       "초콜릿 칩 : " + chip+"(개)"+"\n"+
		       "초콜릿 케이크가 완성되었습니다.";
	}
}
