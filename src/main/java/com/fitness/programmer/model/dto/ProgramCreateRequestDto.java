package com.fitness.programmer.model.dto;

import org.springframework.lang.NonNull;

public class ProgramCreateRequestDto {
    @NonNull
    private String nameOfProgram;
    @NonNull
    private int numberOfWeeks;

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
}
