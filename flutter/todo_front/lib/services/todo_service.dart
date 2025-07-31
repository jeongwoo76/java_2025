//192.168.40.19
import 'package:http/http.dart' as http; // http 연결
import 'dart:convert';  // 인코딩 및 json 디코딩
import '../models/todo.dart'; //todo 모델클래스

Future<List<Todo>> fetchTodos() async { // 비동기 - List<Todo>
  final response = 
      await http.get(Uri.parse("http://192.168.40.19:8080/api/todos")); // 비동기처리

      if (response.statusCode == 200) {
        final decoded = utf8.decode(response.bodyBytes);
        List<dynamic> jsonData = json.decode(decoded);
        return jsonData.map((item) => Todo.fromJson(item)).toList();  // json 
      } else {
        throw Exception("API 호출실패: ${response.statusCode}");
      }
}

//http://localhost:8080/api/todos
//http://192.168.40.19:8080/api/todos