package bank_miniproject;

import java.util.Scanner;

public class Bank_v1_control {
	public static void main(String[] args) {
		// 변수
		int num; char id=' ', pass=' ', delete=' '; int balance=0,  deposit=0, Withdrawal=0; 
		Scanner scanner = new Scanner(System.in);
		// 입력 + 입력+ 처리+ 출력
		//step1.
		for(;;) {
		System.out.print("======BANK======\n* 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n입력>>>");
		num = scanner.nextInt();
		if(num==9) {System.out.println("종료기능입니다.");break;}
		//step2. 기능
		switch(num) {
			case 1: System.out.println("추가기능입니다."); 
				// step3
				//  *ID :   _입력받기 first
				//  *PASS :   _입력받기 1111 
				//  *BALANCE : _입력받기 10000
			System.out.print("ID : ");            id = scanner.next().charAt(0);    
			System.out.print("PASS  : ");       pass = scanner.next().charAt(0);  
			System.out.print("BALANCE : ");  balance = scanner.nextInt();     
			
			break;  // end case1
			case 2: System.out.println("조회기능입니다."); 
			    // step4
				// 변수 - 임시변수 temp_id, 임시변수 temp_pass
				// 입력 - 임시변수 temp_id, temp_pass 입력받기
				// 처리 - temp_id 와 id가 같고 temp_pass 와 pass가 같다면 사용자정보출력
				//       아니라면 비밀번호 확인해주세요.
			char temp_id =' ', temp_pass=' ';
			System.out.print("ID : ");      temp_id = scanner.next().charAt(0);    
			System.out.print("PASS: ");   temp_pass = scanner.next().charAt(0);
			if(id==temp_id && pass==temp_pass) {System.out.println(  "ID: "+ id + "\nPASS: " + pass + "\nBALANCE: " + balance );}
			else {System.out.println("비밀번호 확인해주세요.");}
				
			break;  // end case2
			case 3: System.out.println("입금기능입니다."); 
			// step5
			// 변수 - 임시변수 temp_id, 임시변수 temp_pass, deposit
			// 입력 - 임시변수 temp_id, temp_pass 입력받기, 입금(deposit)
			// 처리 - temp_id 와 id가 같고 temp_pass 와 pass가 같다면 입금완료 후 잔액 출력
			//       아니라면 비밀번호 확인해주세요.  
			temp_id =' '; temp_pass=' ';
			System.out.print("ID : ");      temp_id = scanner.next().charAt(0);    
			System.out.print("PASS: ");   temp_pass = scanner.next().charAt(0);
			if(id==temp_id && pass==temp_pass) {System.out.print( "입금 : "); deposit = scanner.nextInt(); 
			int balance1= balance+deposit;
			System.out.println("==입금완료"+"\n잔액 :" + balance1  );}
			
		    else {System.out.println("비밀번호 확인해주세요.");}
		
			
			break;  // end case3
			case 4: System.out.println("출금기능입니다."); 
			// step6
			// 변수 - 임시변수 temp_id, 임시변수 temp_pass, Withdrawal
			// 입력 - 임시변수 temp_id, temp_pass 입력받기, 출금(Withdrawal)
			// 처리 - temp_id 와 id가 같고 temp_pass 와 pass가 같다면 사용자정보출력 출금완료 후 잔액 출력
			// 아니라면 비밀번호 확인해주세요.
			temp_id = ' ';
			temp_pass = ' ';
			System.out.print("ID : ");
			temp_id = scanner.next().charAt(0);
			System.out.print("PASS: ");
			temp_pass = scanner.next().charAt(0);
			if (id == temp_id && pass == temp_pass) {
				System.out.print("출금 : ");
				Withdrawal = scanner.nextInt();
			int balance2 = balance+deposit - Withdrawal;
			System.out.println("==출금완료" + "\n잔액 :" + balance2  );
				} 
			else {System.out.println("비밀번호 확인해주세요."); }
			
			
			break;  // end case4
			case 5: System.out.println("삭제기능입니다."); 
			// step7
			// 변수 - 임시변수 temp_id, 임시변수 temp_pass, delete
			// 입력 - 임시변수 temp_id, temp_pass 입력받기, 삭제 delete
			// 처리 - temp_id 와 id가 같고 temp_pass 와 pass가 같다면 삭제할지 안할지 
			// 아니라면 비밀번호 확인해주세요.
			temp_id = ' ';
			temp_pass = ' ';
			System.out.print("ID : ");
			temp_id = scanner.next().charAt(0);
			System.out.print("PASS: ");
			temp_pass = scanner.next().charAt(0);
			if (id == temp_id && pass == temp_pass) {
				System.out.println("계좌를 삭제하시겠습니까? (y/n) : ");
				delete = scanner.next().charAt(0);
				if(delete=='y') {id=' '; pass=' '; balance=0; } else if (delete=='n') { } 
			} else {
				System.out.println("비밀번호 확인해주세요.");
			}
			
		
			break;  // end case5
		
        }
		
		}
		
		
	}  // end main
}     // end class


/*step1. Q1. 메뉴판 무한반복
for ()   { // 1-1 무한반복

   // 1-2 빠져나올조건 9일때
}

step2. 
for() { 

  // 해당번호입력
  // 번호가 if or switch
  1을 입력하면 추가기능입니다.  출력구문까지만
  2를 입력하면 조회기능입니다.  출력구문까지만
  3을 입력하면 입금기능입니다.  출력구문까지만
  4를 입력하면 출금기능입니다.  출력구문까지만
  5를 입력하면 삭제기능입니다.  출력구문까지만
}
...................................
Step3. 추가

*ID :   _입력받기 first
*PASS :   _입력받기 1111 
*BALANCE : _입력받기 10000

//변수
//입력
//처리
//출력

Step4. 조회

*ID : first
*PASS : 1234
조회가 실패했습니다. 

*ID : first
*PASS : 1111
======조회결과======
아이디 : first 
잔액 : 10000
암호 : 1111
조회가 성공했습니다. 


step5. 입금
*ID : first
*PASS : 1234
다시 확인해주세요

*ID : first
*PASS : 1111
입금 : 100
==입금완료
잔액:101


step6. 출금

*ID : first
*PASS : 1234
다시 확인해주세요

*ID : first
*PASS : 1111
출금 : 100
==출금완료
잔액:1


step7. 삭제
입력5
*ID : first
*PASS : 1234
다시 확인해주세요

*ID : first
*PASS : 1111
계좌를 삭제하시겠습니까? (Y/N)
n

입력 2. 조회
*ID : first
*PASS : 1111
==계좌조회
*ID : first
*PASS : 1111
잔액 :1

*ID : first
*PASS : 1111
계좌를 삭제하시겠습니까? (Y/N)
y

입력 2. 조회
*ID : first
*PASS : 1111
다시 확인해주세요


입력9.
종료기능입니다.
 */
