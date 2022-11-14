package de.uni.koel.se;

import java.util.ArrayList;

public class Professor extends Employee {

    private ArrayList<Exam> examList;
    private ArrayList<Course> profCourseList;

    public Professor(String name, int employeeId, Course firstCourse) {
        super(name, employeeId);
        profCourseList = new ArrayList<Course>();
        profCourseList.add(firstCourse);
        examList = new ArrayList<Exam>();
    }

    /**
     * Adds an Exam to the examList and adds the Prof to the Exam
     *
     * @param exam
     */
    public void addExam(Exam exam) {
        examList.add(exam);
        exam.addProfToExam(this);
    }

    public void addCourse(Course course) {
        profCourseList.add(course);
    }

    public void publicCourse() {

    }

    public void assignTA() {

    }

    public void addCourse() {

    }

}
