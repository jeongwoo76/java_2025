// lib/main.dart
import 'package:flutter/material.dart';
import 'pages/todo_page.dart';

//1. 앱시작점
void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});
  @override
  Widget build(BuildContext context) {
    return const MaterialApp(home: TodoPage());
  }
}