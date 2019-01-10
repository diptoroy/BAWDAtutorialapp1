package com.example.nimai.bawd_atutorialapp.Model;

import android.content.Context;

public class course {

    private String courseName;
    private String courseImage;
    private String courseAuthorName;

    public int getImageResourceId(Context context){
        return context.getResources().getIdentifier(this.courseImage,"drawable",context.getPackageName());
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseImage() {
        return courseImage;
    }

    public void setCourseImage(String courseImage) {
        this.courseImage = courseImage;
    }

    public String getCourseAuthorName() {
        return courseAuthorName;
    }

    public void setCourseAuthorName(String courseAuthorName) {
        this.courseAuthorName = courseAuthorName;
    }

}
