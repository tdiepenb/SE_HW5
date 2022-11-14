package de.uni.koel.se;

import java.util.ArrayList;

public class Course {

    private int id;
    private String name;
    private int maxCapacity;
    private boolean isFull = false;
    private Department department;
    private ArrayList<Professor> professorList;
    private ArrayList<Student> listOfEnrolledStudents;
    private ArrayList<Project> listOfProjects;
    private ArrayList<Exam> listOfExams;
    private ArrayList<TA> listOfTA;

    public Course(int id, String name, int cap, Professor prof) {
        this.id = id;
        this.name = name;
        this.maxCapacity = cap;
        professorList = new ArrayList<Professor>();
        addProf(prof);
        this.listOfEnrolledStudents = new ArrayList<Student>();
        this.listOfProjects = new ArrayList<Project>();
        this.listOfExams = new ArrayList<Exam>();
        listOfExams.add(new Exam(new Question(1, "ExampleQuestion", 10), 50));
        this.listOfTA = new ArrayList<TA>();
    }

    public void enroll(Student student) {
        listOfEnrolledStudents.add(student);
    }

    public void apply(TA ta) {

    }

    public void addTA(TA ta) {
        listOfTA.add(ta);
    }

    public void addProf(Professor prof) {
        if (professorList.size() < 3) {
            professorList.add(prof);
            prof.addCourse(this);
        } else {
            System.out.println("Max Number of Profs reached");
        }
    }

    public void addExam(Exam exam) {
        listOfExams.add(exam);
    }

    public void addProject(Project project) {
        listOfProjects.add(project);
        project.setCourse(this);
    }

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

    public void setMaxCap(int max) {
        this.maxCapacity = max;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public ArrayList<Student> getListOfEnrolledStudents() {
        return listOfEnrolledStudents;
    }

    public void setListOfEnrolledStudents(ArrayList<Student> listOfEnrolledStudents) {
        this.listOfEnrolledStudents = listOfEnrolledStudents;
    }

    public ArrayList<Professor> getProf() {
        return professorList;
    }

    public void setProfessorList(ArrayList<Professor> professorList) {
        this.professorList = professorList;
    }

    public ArrayList<Project> getListOfProjects() {
        return listOfProjects;
    }

    public void setListOfProjects(ArrayList<Project> listOfProjects) {
        this.listOfProjects = listOfProjects;
    }

    public ArrayList<Exam> getListOfExams() {
        return listOfExams;
    }

    public void setListOfExams(ArrayList<Exam> listOfExams) {
        this.listOfExams = listOfExams;
    }

    public ArrayList<TA> getTA() {
        return listOfTA;
    }

    public void setTA(ArrayList<TA> listOfTA) {
        this.listOfTA = listOfTA;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
