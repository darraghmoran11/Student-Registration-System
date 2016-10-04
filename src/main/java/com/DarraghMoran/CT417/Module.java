package com.DarraghMoran.CT417;

import java.util.ArrayList;

public class Module
{
    private String moduleName;
    private String id;
    private ArrayList<Student> student;

    //Constructor Method
    public Module(String moduleName, String id)
    {
        this.moduleName=moduleName;
        this.id=id;
        this.student=new ArrayList<Student>();
    }

    //Getter and Setter Methods
    public String getModuleName() {
        return moduleName;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Student> getStudent() {
        return student;
    }

    public void setStudent(ArrayList<Student> student) {
        this.student.addAll(student);
    }

    public ArrayList<Student> getStudents() {
        return student;
    }

    public void addStudents(ArrayList<Student> student) {
        this.student.addAll(student);
    }
}
