Spring Boot 3 Console Student Management Application

This project demonstrates a console application built with Spring Boot 3 for managing student information. It allows users to:

Add new students with details like roll number, name, father's name, marks, grade, and class.
Retrieve a list of all registered students.
Technical Stack:

Spring Boot 3: Provides a foundation for rapid application development.
JDBC Template: Executes SQL queries for data persistence (implemented in save and findAll methods of StudentRepo).
Student Model (Student class): Represents the data structure for a student.
