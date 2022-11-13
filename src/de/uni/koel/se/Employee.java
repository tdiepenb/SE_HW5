package de.uni.koel.se;

import java.util.ArrayList;

public class Employee {
    private String name;
    private int employeeId;

    private ArrayList<Professor> listOfProfessors;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;

    }

    //Getter&Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public ArrayList<Professor> getListOfProfessors() {
        return listOfProfessors;
    }

    public void setListOfProfessors(ArrayList<Professor> listOfProfessors) {
        this.listOfProfessors = listOfProfessors;
    }
}
