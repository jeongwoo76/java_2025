package selftest2_2;


public class ScoreProcess {
	public void process_avg(Score[] std) { 
		for (int i=0; i<std.length; i++)
		{ std[i].setAvg (  ( std[i].getKor() + std[i].getEng() + std[i].getMath() )/3.0); }
	}

	public void process_pass(Score[] std) {
		for(int i=0; i<std.length; i++) {std[i].setPass(std [i].getAvg()>=60? "합격" : "불합격");}
	}
}
