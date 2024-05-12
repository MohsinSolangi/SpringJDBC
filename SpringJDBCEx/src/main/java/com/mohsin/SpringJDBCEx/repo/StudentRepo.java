package com.mohsin.SpringJDBCEx.repo;

import com.mohsin.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepo {


    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {

        String Query = "Insert into student (rollno,name,FatherName, marks,grade,class) values(?,?,?,?,?,?)";
        int rows=jdbc.update(Query,s.getRollNo(),s.getName(),s.getFatherName(),s.getMarks(),s.getGrade(),s.get_class());
        System.out.println(rows+" effected");
    }

    public List<Student> findAll() {
     String Query = "Select * from student";

        return jdbc.query(Query,(rset, rowNum) -> {

            Student s= new Student();
            s.setRollNo(rset.getInt("rollno"));
            s.setName(rset.getString("name"));
            s.setFatherName(rset.getString("FatherName"));
            s.setMarks(rset.getInt("marks"));
            s.setGrade(rset.getString("grade"));
            s.set_class(rset.getInt("class"));

            return s;
        });

    }
}
