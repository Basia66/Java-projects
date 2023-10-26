package com.company;

import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<Class> classes = new ArrayList<>();

    public Teacher(String name, String surname, String address) {
        super(name, surname, address);
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Class> classes) {
        this.classes = classes;
    }

    public void assignNewClass(Class newClass){
        getClasses().add(newClass);
        newClass.setTeacher(this);
    }

    public void setMarkForStudent(Class class_m, Student student, int mark) {
        class_m.getAssignedStudents().get(student).setMark(mark);
    }
}
