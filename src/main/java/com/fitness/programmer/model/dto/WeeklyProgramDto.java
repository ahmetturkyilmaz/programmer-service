package com.fitness.programmer.model.dto;

import java.util.List;

public class WeeklyProgramDto {

    private String name;

    private List<DailyProgramDto> dailyProgram;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DailyProgramDto> getDailyProgram() {
        return dailyProgram;
    }

    public void setDailyProgram(List<DailyProgramDto> dailyProgram) {
        this.dailyProgram = dailyProgram;
    }
}
