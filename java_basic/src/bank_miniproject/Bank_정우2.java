package bank_miniproject;
 
import java.util.Arrays;
import java.util.Scanner;

public class Bank_정우2 {
	public static void main(String[] args) {
		// 변수
		int num;
		char delete = ' ';
		String[]id      = new String[3];   // 
		String[]pass    = new String[3];
		int   []balance = new int[3];
		Scanner scanner = new Scanner(System.in);
		// 입력 + 입력+ 처리+ 출력
		// step1.
		for (;;) {
			System.out.println(Arrays.toString(id));   // [null, null, null]
			System.out.println(Arrays.toString(pass));
			System.out.println(Arrays.toString(balance));
			System.out.print("======BANK======\n* 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n입력>>>");
			num = scanner.nextInt();
			if (num == 9) {
				System.out.println("종료기능입니다.");
				break;
			}
			// step2. 기능
			switch (num) {
				case 1:
					System.out.println("추가기능입니다.");
					// step3
					// *ID : _입력받기 first
					// *PASS : _입력받기 1111
					// *BALANCE : _입력받기 10000

					//ver-0 빈칸이라면 입력받기
					//ver-1 if(id[0]==null ) {입력받기}
					//      if(id[1]==null ) {입력받기}  
					//      if(id[2]==null ) {입력받기} 
					//ver-2 for(int i=0; i<=2; i++) {    if(id[i]==null ) {입력받기  break;   }   }
					for (int i = 0; i <= 2; i++) {
						if (id[i] == null) {
							System.out.print("ID : ");
							id[i] = scanner.next();

							System.out.print("PASS  : ");
							pass[i] = scanner.next();
							System.out.print("BALANCE : ");
							balance[i] = scanner.nextInt();
							break;
						}
					}
					break; // end case1
				/* 	case 2:   case 3: case 4: case 5:
						// step4
						// 변수 - 임시변수 temp_id, 임시변수 temp_pass
						// 입력 - 임시변수 temp_id, temp_pass 입력받기
						// 처리 - temp_id 와 id가 같고 temp_pass 와 pass가 같다면 사용자정보출력
						// 아니라면 비밀번호 확인해주세요.
						String temp_id = " ", temp_pass = " ";
						System.out.print("ID : ");
						temp_id = scanner.next();
						System.out.print("PASS: ");
						temp_pass = scanner.next();
						if (!(id == temp_id && pass == temp_pass)) { System.out.println("비밀번호 확인해주세요.");  break;  }
						
						if(num==2) {
							System.out.println("조회기능입니다.");
							System.out.println("ID: " + id + "\nPASS: " + pass + "\nBALANCE: " + balance);
						}else if(num==3) { 
							System.out.println("입금기능입니다.");
							System.out.print("입금 : ");
							int deposit = scanner.nextInt();
							balance += deposit;
							System.out.println("==입금완료" + "\n잔액 :" + balance);
						}else if(num==4) { 
							System.out.println("출금기능입니다.");   // 마이너스 통장 안되게....
							System.out.print("출금 : ");
							int withdrawal = scanner.nextInt();   // 입력받은 값
							if (withdrawal>balance) {System.out.println("출금액이 잔액보다 크면 안됩니다");continue;}
							
							balance -= withdrawal;   
							System.out.println("==출금완료" + "\n잔액 :" + balance);
						}else if(num==5) {
							System.out.println("삭제기능입니다.");
							System.out.println("계좌를 삭제하시겠습니까? (y/n) : ");
							delete = scanner.next().charAt(0);
							if (delete == 'y') {
								id = ' ';
								pass = ' ';
								balance = 0;
							}
						}
				
						break; 
				*/
			}

		}

	} // end main
} // end class
 


