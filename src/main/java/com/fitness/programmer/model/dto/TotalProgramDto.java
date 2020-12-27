package com.fitness.programmer.model.dto;

import com.fitness.programmer.model.enums.ProgramWeekType;

import java.util.List;

public class TotalProgramDto extends BaseDto {
    private String programName;
    private ProgramWeekType programWeekType;
    private List<WeeklyProgramDto> weeklyPrograms;

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public ProgramWeekType getProgramWeekType() {
        return programWeekType;
    }

    public void setProgramWeekType(ProgramWeekType programWeekType) {
        this.programWeekType = programWeekType;
    }

    public List<WeeklyProgramDto> getWeeklyPrograms() {
        return weeklyPrograms;
    }

    public void setWeeklyPrograms(List<WeeklyProgramDto> weeklyProgramDtos) {
        this.weeklyPrograms = weeklyProgramDtos;
    }
}
