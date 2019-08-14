package ru.inno.stc16.entity;

public class Course {

    private static Integer LAST_ID = 0;

    private int id;
    private String title;

    public Course() {
        this.id = LAST_ID++;
    }

    public Course(String title) {
        this();
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
