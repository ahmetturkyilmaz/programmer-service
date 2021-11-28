package com.fitness.programmer.model.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "TotalProgramEntity")
public class TotalProgramEntity extends BaseEntity {
    private String programName;
    private List<WeeklyProgram> weeklyPrograms;
    private boolean isActive;
    private int orderNumber;

    public TotalProgramEntity() {

    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }


    public List<WeeklyProgram> getWeeklyPrograms() {
        return weeklyPrograms;
    }

    public void setWeeklyPrograms(List<WeeklyProgram> weeklyPrograms) {
        this.weeklyPrograms = weeklyPrograms;
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
