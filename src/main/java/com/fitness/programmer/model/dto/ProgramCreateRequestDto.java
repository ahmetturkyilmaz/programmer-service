package com.fitness.programmer.model.dto;

import org.springframework.lang.NonNull;

public class ProgramCreateRequestDto extends BaseDto{
    @NonNull
    private String nameOfProgram;
    @NonNull
    private int numberOfWeeks;

    private boolean isActive;

    public String getNameOfProgram() {
        return nameOfProgram;
    }

    public void setNameOfProgram(String nameOfProgram) {
        this.nameOfProgram = nameOfProgram;
    }

    public int getNumberOfWeeks() {
        return numberOfWeeks;
    }

    public void setNumberOfWeeks(int numberOfWeeks) {
        this.numberOfWeeks = numberOfWeeks;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
