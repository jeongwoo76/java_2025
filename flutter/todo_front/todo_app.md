#### 1. Todo 개요
1. 백엔드 api 설계 및 구현
2. flutter에서 api 연동 테스트
3. flutter ui기본구조작성 - list, add, update, delete

<br/>
<br/>
<br/>

---

##### 1. 백엔드 api 설계 및 구현
1. spring boot 프로젝트 (jap, mysql, lobok, spring-dev , web)
   - pom.xml / build path
2. model - entity , repository
3. service
4. controller
5. rest api postman 테스트

##### 2. flutter에서 api 연동 테스트
■ 프로젝트만들기
1. ctrl + shift + p
2. Flutter:New Project

■ 애뮬레이터실행
1. ctrl + shift + p
2. Flutter:Launch Emulator

```bash
flutter  devices
flutter  run  -d  chrome
```

   
##### 3. flutter ui기본구조작성 - list, add, update, delete
###### 1. 구조확인
■ model/todo.dart
■ services/todo_service.dart
■ pages/todo_page.dart
■ main.dart

lib/
├── main.dart
├── models/
│   └── todo.dart
├── services/
│   └── todo_service.dart 
├── pages/
│   └── todo_page.dart


###### 2. http 패키지추가
1. pubspec.yaml

```yaml
dependencies : 
   flutter:
      sdk: flutter
   http: ^0.13.6
```

2. 다운로드
```bash
flutter pub get
```

3. models/todo.dart
```dart
```

4. services/todo_service.dart
```dart
```

5. pages/todo_page.dart
```dart
```

###### 3. 전체리스트

lib/
├── main.dart
├── models/
│   └── todo.dart
├── services/
│   └── todo_service.dart 
├── pages/
│   └── todo_page.dart