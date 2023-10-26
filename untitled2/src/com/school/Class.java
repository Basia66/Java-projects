package com.company;

import java.util.HashMap;
import java.util.Map;

public class Class {
    private String name;
    private Teacher teacher;
    private int classNumber;
    private Map<Student, Mark> assignedStudents = new HashMap<>();

    public Class(String name, Teacher teacher, int classNumber) {
        this.name = name;
        this.teacher = teacher;
        this.classNumber = classNumber;
    }

    public void ChangeClass(int newClassNumber){
        classNumber = newClassNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public Map<Student, Mark> getAssignedStudents() {
        return assignedStudents;
    }

    public void setAssignedStudents(Map<Student, Mark> assignedStudents) {
        this.assignedStudents = assignedStudents;
    }

    public void addNewStudent(Student newStudent) {
        getAssignedStudents().put(newStudent, new Mark(5));
    }

    public Mark getMarkForStudent(Student student){
        return getAssignedStudents().get(student);
    }
}
