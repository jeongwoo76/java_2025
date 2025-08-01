// ## 🧸 예제 1: 내 이름과 나이 말해보기 - 연습문제

// ### 🥇 연습 1
// - 🎯 문제: 이름은 "토끼", 나이는 6살인 친구를 소개해주세요
// - 🖨️ 출력예시: `안녕하세요, 토끼! 당신은 6살입니다.`
// - 💡 힌트: 문자열 보간(`$변수`)을 사용해요
// - ✅ 여기에서 실습!
// void main() {
//   String name ="토끼";
//   int age = 6;
//   print('안녕하세요, $name! 당신은 $age살입니다.');
// }

// ---
// ### 🥈 연습 2

// - 🎯 문제: 본인의 이름과 나이를 물어보고 출력해보세요 (직접 입력!)
// - 💡 힌트: `print`로 물어본 뒤 `변수`에 저장해서 출력하기
// - ✅ 여기에서 실습!

// import 'dart:io';

// void main() {
//   stdout.write('이름을 입력하세요: ');
//   String? name = stdin.readLineSync();

//   stdout.write('나이를 입력하세요: ');
//   String? ageInput = stdin.readLineSync();
//   int? age = int.tryParse(ageInput ?? '');

//   if (name != null && age != null) {
//     print('안녕하세요 $name 님! 나이는 $age살이군요.');
//   } else {
//     print('입력값이 올바르지 않습니다.');
//   }
// }

// ---
// ### 🥉 연습 3

// - 🎯 문제: 다른 친구 이름("곰")과 나이(3)를 출력하세요
// - 🖨️ 출력예시: `안녕하세요, 곰! 당신은 3살입니다.`
// - 💡 힌트: 숫자와 문자열은 다르게 저장해요
// - ✅ 여기에서 실습!


import 'dart:convert';
import 'dart:io';

void main() {
  stdout.write('이름을 입력해주세요');
  String? name = stdin.readLineSync(encoding: utf8)?.trim() ?? '';

  stdout.write('나이를 입력해주세요');
  String? ageInput = stdin.readLineSync(encoding: utf8)?.trim() ?? '';
  int? age = int.tryParse(ageInput);

  if(age == null) {
    return;
  }
  if(age<= 19){
    print('$name님 미성년자입니다!');
  } else {
    print('$name님 성년입니다!');
  }
}

// ---
// ## 🎨 예제 2: 컬렉션 다루기 - 연습문제
// ### 🥇 연습 1
// - 🎯 문제: 좋아하는 과일 리스트를 만들고 첫 번째 과일을 출력하세요
// - 🖨️ 출력예시: `내가 좋아하는 과일은 사과!`
// - 💡 힌트: 리스트는 `[]`, 리스트의 첫번째 값은 `[0]`
// - ✅ 여기에서 실습!

// ---
// ### 🥈 연습 2
// - 🎯 문제: 친구 이름과 키(cm)를 맵에 저장하고 철수의 키를 출력하세요
// - 🖨️ 출력예시: `철수의 키는 120cm입니다.`
// - 💡 힌트: 맵은 `{key: value}` 형식이에요
// - ✅ 여기에서 실습!

// ---
// ### 🥉 연습 3
// - 🎯 문제: 리스트에 색깔 2개 추가하고, 두 번째 색 출력하기
// - 🖨️ 출력예시: `내가 좋아하는 두 번째 색은 파랑!`
// - 💡 힌트: 두 번째는 `[1]`
// - ✅ 여기에서 실습!

// ---
// ## 🧮 예제 3: 반복과 조건문 - 연습문제
// ### 🥇 연습 1

// - 🎯 문제: 1부터 5까지 숫자 중 짝수만 출력하세요
// - 🖨️ 출력예시: `2는 짝수입니다`, `4는 짝수입니다`
// - 💡 힌트: `i % 2 == 0`이면 짝수
// - ✅ 여기에서 실습!

// ---
// ### 🥈 연습 2
// - 🎯 문제: 3번 반복해서 "안녕!" 출력하기
// - 🖨️ 출력예시:
//   안녕!
//   안녕!
//   안녕!
// - 💡 힌트: `for` 반복문으로 3번 돌리기
// - ✅ 여기에서 실습!

// ---
// ### 🥉 연습 3
// - 🎯 문제: `while`문으로 1~3 숫자 출력하기
// - 💡 힌트: `while (조건)`과 증가시켜야 끝나요
// - ✅ 여기에서 실습!

// ---
// ## 🧠 예제 4: 함수와 람다 - 연습문제
// ### 🥇 연습 1
// - 🎯 문제: 두 숫자 2와 5를 더하는 함수 만들기
// - 🖨️ 출력예시: `2 + 5 = 7`
// - 💡 힌트: `(a + b)` 형태로 함수 만들기
// - ✅ 여기에서 실습!

// ---
// ### 🥈 연습 2
// - 🎯 문제: 세 숫자 더하기 함수 만들고 `1+2+3` 계산하기
// - 🖨️ 출력예시: `합은 6입니다.`
// - 💡 힌트: 함수에 숫자 3개 넣고 모두 더해요
// - ✅ 여기에서 실습!

// ---
// ### 🥉 연습 3
// - 🎯 문제: 곱셈 함수 만들어 `3 * 4` 계산하세요
// - 🖨️ 출력예시: `3 곱하기 4는 12입니다.`
// - 💡 힌트: `a * b` 사용해요
// - ✅ 여기에서 실습!

// ---
// ## 💥 예제 5: 예외 처리 - 연습문제
// ### 🥇 연습 1
// - 🎯 문제: 50을 0으로 나눠서 에러 메시지 출력하기
// - 🖨️ 출력예시: `앗! 문제가 생겼어요: IntegerDivisionByZeroException`
// - 💡 힌트: `try-catch` 안에서 `~/ 0` 사용
// - ✅ 여기에서 실습!

// ---
// ### 🥈 연습 2
// - 🎯 문제: 나눗셈 성공 코드와 실패 코드 둘 다 출력해보기
// - 💡 힌트: 하나는 100~/2, 하나는 100~/0
// - ✅ 여기에서 실습!

// ---
// ### 🥉 연습 3
// - 🎯 문제: finally 구문을 추가해 "계산 끝!" 출력하기
// - 💡 힌트: try-catch-finally 구조 사용
// - ✅ 여기에서 실습!

// ---
// ## 🐶 예제 6: 클래스와 객체 - 연습문제
// ### 🥇 연습 1
// - 🎯 문제: 이름이 "고양이"인 동물을 만들고 "야옹!"을 출력하세요
// - 💡 힌트: speak 대신 meow 함수 만들기
// - ✅ 여기에서 실습!

// void main() {
//   Cat kitty = Cat('고양이');
//   kitty.meow();
// }

// ---
// ### 🥈 연습 2
// - 🎯 문제: "토끼"라는 동물 클래스를 만들고 "깡총!" 출력하세요
// - 💡 힌트: speak 함수 안에서 "깡총!" 사용
// - ✅ 여기에서 실습!

// void main() {
//   Rabbit bunny = Rabbit('토끼');
//   bunny.speak();
// }

// ---
// ### 🥉 연습 3
// - 🎯 문제: 여러 동물 만들고 각각 말하게 해보세요
// - 💡 힌트: Dog, Cat 클래스를 둘 다 만들어 사용하기
// - ✅ 여기에서 실습!

// void main() {
//   Animal dog = Animal('강아지');
//   Animal cat = Animal('고양이');

//   dog.speak();
//   cat.speak();
// }

// ---
// ## 🕒 예제 7: Future와 비동기 처리 – 연습문제
// ### 🥇 연습 1
// - 🎯 문제: 2초 기다린 후 "간식 나왔어요!" 라고 출력하기
// - 🖨️ 출력예시:
//   기다리는 중...
//   간식 나왔어요!
// - 💡 힌트: `await Future.delayed` 사용, `Duration(seconds: 2)`
// - ✅ 여기에서 실습!

// ---
// ### 🥈 연습 2
// - 🎯 문제: 비동기 함수로 "엄마가 간식을 준비 중이에요..."를 1초 후에 출력하세요
// - 🖨️ 출력예시:
//   준비 중...
//   엄마가 간식을 준비 중이에요...
// - 💡 힌트: `await`를 사용해서 잠깐 쉬었다가 진행돼요
// - ✅ 여기에서 실습!

 

// ---
// ### 🥉 연습 3
// - 🎯 문제: 기다리는 시간과 메시지를 바꿔보세요 – 3초 기다린 후 "게임 시작!" 출력
// - 💡 힌트: 기다리는 초만 바꾸면 돼요
// - ✅ 여기에서 실습!

 
// ---
// ## 📦 예제 8: 레코드 & 구조 분해 – 연습문제
// ### 🥇 연습 1

// - 🎯 문제: ('코코', 7) 이란 정보를 받아 이름과 나이를 나눠 출력하세요
// - 🖨️ 출력예시: `코코는 7살이에요!`
// - 💡 힌트: `(name, age)` 구조 분해 사용하기
// - ✅ 여기에서 실습!

 

// ---
// ### 🥈 연습 2
// - 🎯 문제: 친구 정보 2개 (`('찬이', 6)`, `('나리', 5)`)를 받아 각각 출력하세요
// - 💡 힌트: 레코드 여러 번 사용하면 돼요
// - ✅ 여기에서 실습!

 
// ---
// ### 🥉 연습 3
// - 🎯 문제: 이름과 장난감 정보를 구조 분해해서 출력하세요 (`('민수', '로봇')`)
// - 🖨️ 출력예시: `민수는 로봇 장난감을 좋아해요!`
// - 💡 힌트: `(String, String)` 형식으로 레코드 만들기
// - ✅ 여기에서 실습!

 