package com.fitness.programmer.model.dto;

import com.fitness.programmer.model.enums.ProgramWeekType;

import java.util.HashMap;

public class TotalProgramDto {
    private String programName;
    private ProgramWeekType programWeekType;
    private HashMap<Integer, WeeklyProgramDto> totalPrograms;
}
