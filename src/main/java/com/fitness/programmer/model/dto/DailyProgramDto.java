package com.fitness.programmer.model.dto;

import com.fitness.programmer.model.entity.WeeklyProgramEntity;
import com.fitness.programmer.model.enums.DayOfWeek;

import java.util.List;

public class DailyProgramDto extends BaseDto{
    private String name;
    private DayOfWeek dayOfWeek;
    private List<MoveDto> moveSet;
    private WeeklyProgramDto weeklyProgram;

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

    public WeeklyProgramDto getWeeklyProgram() {
        return weeklyProgram;
    }

    public void setWeeklyProgram(WeeklyProgramDto weeklyProgram) {
        this.weeklyProgram = weeklyProgram;
    }
}
