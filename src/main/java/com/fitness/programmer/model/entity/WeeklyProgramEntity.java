package com.fitness.programmer.model.entity;

import java.util.List;

public class WeeklyProgramEntity extends BaseEntity {
    private String name;

    private List<DailyProgramEntity> dailyPrograms;

    private String weekNumber;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DailyProgramEntity> getDailyPrograms() {
        return dailyPrograms;
    }

    public void setDailyPrograms(List<DailyProgramEntity> dailyProgram) {
        this.dailyPrograms = dailyProgram;

    }

    public String getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(String weekNumber) {
        this.weekNumber = weekNumber;
    }
}
