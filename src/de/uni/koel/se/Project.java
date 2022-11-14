package de.uni.koel.se;

import java.util.ArrayList;

public class Project {

    private String name;
    private ArrayList<Student> member;

    private Course course;


    public Project(String name, Course course) {
        this.name = name;
        this.member = new ArrayList<Student>();
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void addMember(Student student) {
        member.add(student);
    }

    public void removeMember(Student student) {
        member.remove(student);
        student.setProject(null);
    }

    private void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getMembers() {
        return member;
    }

    public void setMember(ArrayList<Student> member) {
        this.member = member;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
