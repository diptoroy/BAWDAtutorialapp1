package com.example.nimai.bawd_atutorialapp.Adapter;

import com.example.nimai.bawd_atutorialapp.Model.Course;

import java.util.ArrayList;

public class CourseDate {
    private String[] coursenames = {"First Course", "Second Course", "Third Course", "Fourth Course", "Fifth Course", "Sixth Course", "Seventh Course"};

    public ArrayList<Course> courselist(){
        ArrayList<Course> list = new ArrayList<>();
        for(int i = 0;i<coursenames.length;i++){
            Course course = new Course(coursenames[i],coursenames[i].replace(" ","")
                    .toLowerCase(),"ic_launcher_round");
            list.add(course);
        }
        return list;
    }

}
