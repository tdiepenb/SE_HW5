package de.uni.koel.se;

public class Student {

    private int id;
    private String name;
    private Project project;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Project getProject() {
        return this.project;
    }

}
