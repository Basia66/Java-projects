package com.company;

public class Student extends Person {
    private int index;
    private Teacher headTeacher;

    public Student(String name, String surname, String address, int index, Teacher headTeacher) {
        super(name, surname, address);
        this.index = index;
        this.headTeacher = headTeacher;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Teacher getHeadTeacher() {
        return headTeacher;
    }

    public void setHeadTeacher(Teacher headTeacher) {
        this.headTeacher = headTeacher;
    }

    public void AssignToClass(Class class_m) {
        class_m.addNewStudent(this);
    }

    public int getMarkForClass(Class class_m) {
        return class_m.getMarkForStudent(this).getMark();
    }
}
