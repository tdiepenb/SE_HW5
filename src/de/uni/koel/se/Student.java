package de.uni.koel.se;

import java.util.ArrayList;

public class Student {

    private int id;
    private String name;
    private Project project;

    private ArrayList<Exam> registeredExam;
    private ArrayList<Course> listOfCourses;

    public Student(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.registeredExam = new ArrayList<Exam>();
        this.listOfCourses = new ArrayList<Course>();
        this.listOfCourses.add(course);
    }

    public String getName() {
        return this.name;
    }

    public Project getProject() {
        return this.project;
    }

    public void registerForCourse(Course course) {
        listOfCourses.add(course);
        course.enroll(this);
    }

    public void registerForExam(Exam exam) {
        if (exam.register(this)) {
            registeredExam.add(exam);
        } else {
            System.out.println("Exam was Full");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
