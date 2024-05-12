package com.mohsin.SpringJDBCEx.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

    private int rollNo;
    private int marks;
    private String name;
    private String fatherName;
    private String grade;
    private int _class;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int get_class() {
        return _class;
    }

    public void set_class(int _class) {
        this._class = _class;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", grade='" + grade + '\'' +
                ", _class=" + _class +
                '}';
    }

}
