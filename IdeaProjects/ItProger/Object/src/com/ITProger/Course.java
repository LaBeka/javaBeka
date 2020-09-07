package com.ITProger;

public class Course {

    private int id;
    private  String title;


    public Course(int id, String title){
        this.title = title;
        this.id = id;
    }

    @Override
    public String toString() {
        //return String.valueOf(id);
        return id + " - " + title;
    }

    public  boolean equals(Object obj){
        // return id == obj.id; // this is error, instead try the next:
        Course course = (Course) obj;
        return id == course.id; // compare the int id. Id of  both objects are (2)
    }
}
