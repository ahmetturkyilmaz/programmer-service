package com.fitness.programmer.model.entity;

import java.util.List;

public class WeeklyProgramEntity extends BaseEntity {
    private String name;

    private List<DailyProgramEntity> dailyPrograms;

    private String weekNumber;

    private String totalProgramId;

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

    public String getTotalProgramId() {
        return totalProgramId;
    }

    public void setTotalProgramId(String totalProgramId) {
        this.totalProgramId = totalProgramId;
    }

    public String getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(String weekNumber) {
        this.weekNumber = weekNumber;
    }
}
