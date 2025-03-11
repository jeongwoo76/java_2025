package selftest2;

/* 
abstract 과 interface의 공통점과 차이점은?
공통점 :  자식클래스를 통해서 설계부분을 구현한다.
차이점 :  추상화정도가 interface 가 높다
         abstract 일반클래스+ 설계도  - 인스턴스변수, 인스턴스메서드 사용가능
		  interface         설계도  
		  멤버변수는 public static final 이 붙은 상수
		  멤버함수는 public abstract       abstract 메서드
*/

/*
		Vehicle16 (run)
		↑ 		↑
 MoterCycle16  Car16 (run) @Override


 */
interface Vehicle16{ public void run();
public void helmet(); }
class MoterCycle16 implements Vehicle16{ 
	@Override public void run() { System.out.println("오토바이가 달립니다."); } 
	@Override public void helmet() {System.out.println("헬멧을 착용합니다"); }
}
class Car16 implements Vehicle16{ @Override public void run() 
{ System.out.println("자동차가 달립니다."); }

@Override
public void helmet() {
}


}
class Driver16{ 
	
	void drive( Vehicle16 v){    
	if( v instanceof MoterCycle16) { ((MoterCycle16) v).helmet(); }
	v.run(); 
	}
}

public class Interface016_instanceof {
	public static void main(String[] args) {
		Driver16 driver16 = new Driver16();
		MoterCycle16 MoterCycle16 = new MoterCycle16();
		Car16 car16 = new Car16();
		
		driver16.drive(car16);  // 리턴값 메서드명(파라미터)
								// void driver16(car16)
								// void driver16(MoterCycle16)
		System.out.println("\n\n>>자동차가 고장나서 교통수단을 바꿉니다!");
		
		driver16.drive(MoterCycle16);
		
	}
}
