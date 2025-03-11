package selftest2;

//1. 바뀌면 안되게 설정 final(하지마) 클래스(상속받지마) 멤버변수(수정못해! : 상수) 멤버함수(오버라이딩하지마) 
//2. 멤버변수 초기화 : 기본값 '\u0000', null - 명시적초기화 - 초기화블록 - 생성자 

class User004{
	final char division;
	final String jumin;
	public User004() { division='A'; jumin="123456-1234567"; }
	public User004(char division, String jumin) { super(); this.division = division; this.jumin = jumin; }
	@Override
	public String toString() { return "User004 [division=" + division + ", jumin=" + jumin + "]"; }
	
}
public class Final004 {
	public static void main(String[] args) {
	User004 c1 = new User004('B', "200101-1234567"); System.out.println(c1);
	User004 c2 = new User004();						 System.out.println(c2);

	}
}
/*
접근자의 범위를 넓은 범위에서 좁은범위로 적으시오.
public > protected  > default(package) > private 
*/