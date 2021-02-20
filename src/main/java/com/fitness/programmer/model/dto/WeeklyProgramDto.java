package com.fitness.programmer.model.dto;

import com.sun.istack.internal.NotNull;

import java.util.List;

public class WeeklyProgramDto extends BaseDto {

    private String name;

    private List<DailyProgramDto> dailyPrograms;

    private Integer weekNumber;

    @NotNull
    private String totalProgramId;

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

    public String getTotalProgramId() {
        return totalProgramId;
    }

    public void setTotalProgramId(String totalProgramId) {
        this.totalProgramId = totalProgramId;
    }
}
