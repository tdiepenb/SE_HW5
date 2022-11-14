package de.uni.koel.se;

import java.util.ArrayList;

public class Department {


    private String name;
    private ArrayList<Employee> employeeList;
    private ArrayList<Course> courses;

    public Department(String name) {
        this.name = name;
        this.employeeList = new ArrayList<Employee>();
        this.courses = new ArrayList<Course>();
    }

    public void addEmployeeToDepartment(Employee employee) {
        employeeList.add(employee);
        employee.setDepartment(this);
    }

    public void emptyDepartment() {
        for (Employee employee : employeeList) {
            employee.setDepartment(null);
        }
        employeeList.clear();
    }

    public void addCourse(Course course) {
        courses.add(course);
        course.setDepartment(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Employee> getEmployeeList() {
        return this.employeeList;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
