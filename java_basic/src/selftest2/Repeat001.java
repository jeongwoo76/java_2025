package selftest2;

class Coffee012 {
	String name; int num, price;
	void show() {System.out.println("=====커피\r\n"
	  		+ "커피명 : "  + name +"\r\n"
	  		+ "커피잔수 : " + num + "\r\n"
	  		+ "커피가격 : " + num*price);
	}
	public Coffee012(String name, int num, int price) {
		super();
		this.name = name;
		this.num = num;
		this.price = price;
	}
	public Coffee012() { name= "아메리카노";  num=1; price=2000;  }
	
	
	
}
public class Repeat001 {
	public static void main(String[] args) {
		Coffee012 a1 = new Coffee012("까페라떼",2,4000);
		a1.show();
		Coffee012 a2 = new Coffee012();
		a2.show();

	}
}
