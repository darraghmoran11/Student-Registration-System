package com.DarraghMoran.CT417;

import org.joda.time.LocalDate;
import java.util.ArrayList;

public class CourseProgramme
{
    private String courseName;
    private LocalDate startDate;
    private LocalDate endDate;
    private ArrayList<Module> modules;

    //Constructor Method
    public CourseProgramme(String courseName, LocalDate startDate, LocalDate endDate, ArrayList<Module> modules)
    {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.modules = modules;
    }

    //Getter and Setter Methods
    public ArrayList<Module> getModule() {
        return modules;
    }

    public void addModule(Module module) {
        modules.add(module);
    }

    public String getCourseName() {
        return courseName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
}
