package com.fitness.programmer.model.dto;

import java.util.List;

public class WeeklyProgramDto {

    private String name;

    private List<DailyProgramDto> dailyPrograms;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DailyProgramDto> getDailyPrograms() {
        return dailyPrograms;
    }

    public void setDailyPrograms(List<DailyProgramDto> dailyProgram) {
        this.dailyPrograms = dailyProgram;
    }

}
