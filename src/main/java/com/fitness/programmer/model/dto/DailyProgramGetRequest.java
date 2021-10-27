package com.fitness.programmer.model.dto;

import com.fitness.programmer.model.enums.DayOfWeek;

public class DailyProgramGetRequest {
    private String totalProgramId;

    private Integer weekNumber;

    private DayOfWeek dayOfWeek;

    public String getTotalProgramId() {
        return totalProgramId;
    }

    public void setTotalProgramId(String totalProgramId) {
        this.totalProgramId = totalProgramId;
    }

    public Integer getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(Integer weekNumber) {
        this.weekNumber = weekNumber;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
