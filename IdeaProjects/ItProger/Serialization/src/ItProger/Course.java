package ItProger;

import java.io.Serializable;

public class Course implements Serializable {

    private transient int i;// transient is for not to be serialized
    private String str;

    public Course(int i, String str) {
        this.str = str;
        this.i = i;
    }

    public String toString() {
        //return String.valueOf(id);
        return i + " - " + str;
    }

    public boolean equals(Object obj){
        Course course = (Course) obj;
        return i == course.i;
    }


}
