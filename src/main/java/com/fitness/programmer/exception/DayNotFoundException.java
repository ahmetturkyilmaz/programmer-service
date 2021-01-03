package com.fitness.programmer.exception;


public class DayNotFoundException extends RequestException {

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    private String day;

    public DayNotFoundException(String day) {
        this.day = day;
    }

}
