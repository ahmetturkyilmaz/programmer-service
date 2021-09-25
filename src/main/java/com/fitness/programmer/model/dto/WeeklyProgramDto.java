package com.fitness.programmer.model.dto;


import org.springframework.lang.NonNull;

import java.util.List;

public class WeeklyProgramDto extends BaseDto {

    private String name;

    private List<DailyProgramDto> dailyPrograms;

    private Integer weekNumber;


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

    public Integer getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(Integer weekNumber) {
        this.weekNumber = weekNumber;
    }

}
