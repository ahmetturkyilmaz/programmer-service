package com.fitness.programmer.model.dto;

import com.fitness.programmer.model.entity.MoveEntity;
import com.fitness.programmer.model.entity.WeeklyProgramEntity;
import com.fitness.programmer.model.enums.DayOfWeek;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.List;

public class DailyProgramDto {
    private String name;
    private DayOfWeek dayOfWeek;
    private List<MoveEntity> moveSet;
    private WeeklyProgramEntity weeklyProgram;

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

    public List<MoveEntity> getMoveSet() {
        return moveSet;
    }

    public void setMoveSet(List<MoveEntity> moveSet) {
        this.moveSet = moveSet;
    }

    public WeeklyProgramEntity getWeeklyProgram() {
        return weeklyProgram;
    }

    public void setWeeklyProgram(WeeklyProgramEntity weeklyProgram) {
        this.weeklyProgram = weeklyProgram;
    }

}
