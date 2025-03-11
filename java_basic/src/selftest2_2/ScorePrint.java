package selftest2_2;



public class ScorePrint {
	
	
	public void show(Score[] std) {
		show_title();
		for( Score s: std) {System.out.printf("%s\t%d\t%d\t%d\t%.2f\t%s\n", s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getAvg(), s.getPass() );}
	}
	public void show_title() {
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n"
				+ "이름\t국어\t영어\t수학\t평균\t합격여부\r\n"
				+ ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
	
	}

}
