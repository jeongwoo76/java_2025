class Todo {
  //1. table + entity 매칭
  final int id;
  final String title;
  final bool completed;
  //required  반드시 값필요함.
  Todo({required this.id, required this.title, required this.completed});

  factory Todo.fromJson(Map<String, dynamic> json) {
    // json 데이터를 Dart 객체로 변환해주는 팩토리 생성자
    return Todo(
      id: json['id'],
      title: json['title'],
      completed: json['completed'],
    );
  }

  //////
  Map<String, dynamic> toJson() {
    return {
      'title': title,
      'completed': completed,
    };
  }

  //////
  Todo copyWith({int? id, String? title, bool? completed}) {
    //전달된 값
    //## 객체복사해서 일부값만 변경시
    return Todo(
      // 기존의 값을 기반
      id: id ?? this.id, // 전달되지 않으면 (null) 기존값으로 대체
      title: title ?? this.title, // title이 null이면 기존의 title유지
      completed: completed ?? this.completed,
    );
  }
}
