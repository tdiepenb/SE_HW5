package de.uni.koel.se;

import java.util.ArrayList;

public class Exam {

    private int maxValue;
    ArrayList<Question> questionList;
    ArrayList<Student> registeredStudents;
    ArrayList<Professor> profList;

    public Exam(Question firstQuestion, int maxValue) {
        questionList = new ArrayList<Question>();
        questionList.add(firstQuestion);
        this.maxValue = maxValue;
        profList = new ArrayList<Professor>();
    }

    /**
     * Adds the given student to the registeredStudentsList if the length of the list is smaller than maxValue
     *
     * @param student
     * @return
     */
    public boolean register(Student student) {
        boolean wasRegistered = false;
        if (registeredStudents.size() < maxValue) {
            registeredStudents.add(student);
            student.registerForExam(this);
            wasRegistered = true;
        }
        return wasRegistered;
    }

    /**
     * Adds a new Question to the questionList with the given Parameters
     *
     * @param id
     * @param task
     * @param value
     */
    public void addQuestion(int id, String task, int value) {
        questionList.add(new Question(id, task, value));
    }

    /**
     * Returns the ArrayList registeredStudents
     *
     * @return
     */
    public ArrayList<Student> getRegisteredStudents() {
        return registeredStudents;
    }

    public void addProfToExam(Professor prof) {
        profList.add(prof);
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public ArrayList<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(ArrayList<Question> questionList) {
        this.questionList = questionList;
    }

    public void setRegisteredStudents(ArrayList<Student> registeredStudents) {
        this.registeredStudents = registeredStudents;
    }
}
