package com.fitness.programmer.model.dto;

import java.util.List;

public class WeeklyProgramDto extends BaseDto {

    private String name;

    private List<DailyProgramDto> dailyPrograms;
    private TotalProgramDto totalProgram;


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

    public TotalProgramDto getTotalProgram() {
        return totalProgram;
    }

    public void setTotalProgram(TotalProgramDto totalProgram) {
        this.totalProgram = totalProgram;
    }
}
