package de.uni.koel.se;

import java.util.ArrayList;

public class TA {

    private String name;

    private ArrayList<Course> listOfCourses;

    public TA(String name, Course course) {
        this.name = name;
        listOfCourses = new ArrayList<Course>();
        listOfCourses.add(course);
    }

    public void extendContract(Course course) {

    }

    public void addCourse(Course course) {
        listOfCourses.add(course);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



