package com.pam.recycleView;

public class Movie {
    private String title,year;

    public Movie(String title, String year) {
        this.title = title;
        this.year = year;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public void setYear(String year){
        this.year = year;
    }

    public String getTitle(){
        return title;
    }

    public String getYear(){
        return year;
    }
}
