package com.fitness.programmer.model.dto;

import com.fitness.programmer.model.enums.ProgramWeekType;

import java.util.HashMap;

public class TotalProgramDto extends BaseDto{
    private String programName;
    private ProgramWeekType programWeekType;
    private HashMap<Integer, WeeklyProgramDto> totalPrograms;

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

    public HashMap<Integer, WeeklyProgramDto> getTotalPrograms() {
        return totalPrograms;
    }

    public void setTotalPrograms(HashMap<Integer, WeeklyProgramDto> totalPrograms) {
        this.totalPrograms = totalPrograms;
    }
}
