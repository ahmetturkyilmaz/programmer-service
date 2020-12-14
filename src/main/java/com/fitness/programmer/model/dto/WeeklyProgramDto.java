package com.fitness.programmer.model.dto;

import com.fitness.programmer.model.enums.DayOfWeek;

import java.util.HashMap;

public class WeeklyProgramDto {

    private String name;
    private HashMap<DayOfWeek, DailyProgramDto> dailyProgramDtos;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<DayOfWeek, DailyProgramDto> getDailyProgramDtos() {
        return dailyProgramDtos;
    }

    public void setDailyProgramDtos(HashMap<DayOfWeek, DailyProgramDto> dailyProgramDtos) {
        this.dailyProgramDtos = dailyProgramDtos;
    }
}
