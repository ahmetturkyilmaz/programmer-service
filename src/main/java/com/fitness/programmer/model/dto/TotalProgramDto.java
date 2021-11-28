package com.fitness.programmer.model.dto;


import java.util.List;

public class TotalProgramDto extends BaseDto {
    private String programName;
    private List<WeeklyProgramDto> weeklyPrograms;
    private boolean isActive;
    private int orderNumber;

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public List<WeeklyProgramDto> getWeeklyPrograms() {
        return weeklyPrograms;
    }

    public void setWeeklyPrograms(List<WeeklyProgramDto> weeklyProgramDtos) {
        this.weeklyPrograms = weeklyProgramDtos;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
}
