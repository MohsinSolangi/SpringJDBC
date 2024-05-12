package com.mohsin.SpringJDBCEx;

import com.mohsin.SpringJDBCEx.model.Student;
import com.mohsin.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);

		Student s = context.getBean(Student.class);

		s.setName("zuhaib");
		s.setFatherName("Raheem");
		s.setMarks(85);
		s.setGrade("A");
		s.setRollNo(7);
		s.set_class(7);


		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);


		List<Student> students =service.getStudents();

		System.out.println(students);
	}


}
