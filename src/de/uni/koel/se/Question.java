package de.uni.koel.se;

public class Question {
    private String task;
    private int maxValue;
    private int id;


    public Question(int id, String task, int value) {
        this.task = task;
        this.maxValue = value;
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
