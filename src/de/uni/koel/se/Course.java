package de.uni.koel.se;

import java.util.ArrayList;

public class Course {

    private int id;
    private String name;
    private int maxCapacity;
    private boolean isFull;
    private Professor professor;
    private TA ta;
    private ArrayList<Student> listOfEnrolledStudents;

    public Course(int id, String name, int cap, Professor prof) {
        this.id = id;
        this.name = name;
        this.maxCapacity = cap;
        this.professor = prof;
        this.listOfEnrolledStudents = new ArrayList<Student>();

    }


    public void enroll(Student student) {

    }

    public void apply(TA ta) {

    }

    //Getter&Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Student> getListOfEnrolledStudents() {
        return listOfEnrolledStudents;
    }

    public void setListOfEnrolledStudents(ArrayList<Student> listOfEnrolledStudents) {
        this.listOfEnrolledStudents = listOfEnrolledStudents;
    }

    public TA getTa() {
        return ta;
    }

    public void setTa(TA ta) {
        this.ta = ta;
    }
}
