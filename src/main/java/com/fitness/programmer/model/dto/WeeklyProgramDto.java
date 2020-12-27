package com.fitness.programmer.model.dto;

import java.util.List;

public class WeeklyProgramDto {

    private String name;

    private List<DailyProgramDto> dailyProgram;

    private TotalProgramDto totalProgram;

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

    public TotalProgramDto getTotalProgram() {
        return totalProgram;
    }

    public void setTotalProgram(TotalProgramDto totalProgram) {
        this.totalProgram = totalProgram;
    }
}
