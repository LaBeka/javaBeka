package com.ITProger;

import com.ITProger.Course;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    //Object some = new Object();
	    /*some.equals();
	    some.hashCode();
	    some.toString();
	    some.getClass();
	    some.notify();
	    some.notifyAll();
	    some.wait();
	    some.*/

        /*Course newCourse = new Course();
        System.out.println(newCourse.hashCode());

        Course newC = new Course();
        System.out.println(newC.hashCode() == newC.hashCode());*/

       /* Course newCOurse = new Course("Android");
        System.out.println(newCOurse.toString());*/

        /*Course android = new Course(2, "Android");
        Course kotlin = new Course(2, "KOtlin");*/

        /*System.out.println(android);
        System.out.println(kotlin);
        System.out.println(android.equals(kotlin));

        String sit = "Hello";
        String str = "Hello";

        System.out.println(str.equals(sit)); // returns true*/

        // list is consisted from the base of Course

        List<Course> listOfCourses = new ArrayList<>();

        listOfCourses.add(new Course(2, "AAndroid"));
        listOfCourses.add(new Course(2, "KKotlin"));

        printList(listOfCourses);

        List<Course> listOfLessons = new ArrayList<>();

        listOfLessons.add(new Lessons(11, "Android"));
        listOfLessons.add(new Lessons(11, "Kotlin"));

        printList(listOfLessons);
    }

    public static void printList(List<? extends Course> list){//extends Object works too
        for (Object el: list){
            System.out.println(el);
        }
    }
}
