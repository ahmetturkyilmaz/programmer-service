package com.fitness.programmer.model.dto;

import com.fitness.programmer.model.entity.WeeklyProgramEntity;
import com.fitness.programmer.model.enums.DayOfWeek;

import java.util.List;

public class DailyProgramDto {
    private String name;
    private DayOfWeek dayOfWeek;
    private List<MoveDto> moveSet;
    private WeeklyProgramDto weeklyProgramDto;

    public DailyProgramDto() {

    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MoveDto> getMoveSet() {
        return moveSet;
    }

    public void setMoveSet(List<MoveDto> moveSet) {
        this.moveSet = moveSet;
    }

    public WeeklyProgramDto getWeeklyProgramDto() {
        return weeklyProgramDto;
    }

    public void setWeeklyProgramDto(WeeklyProgramDto weeklyProgramDto) {
        this.weeklyProgramDto = weeklyProgramDto;
    }
}
