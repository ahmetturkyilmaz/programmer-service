package com.fitness.programmer.model.entity;

import com.fitness.programmer.model.enums.DayOfWeek;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

public class DailyProgramEntity {
    private String name;

    private DayOfWeek dayOfWeek;

    private List<MoveEntity> moveSet;

    public DailyProgramEntity() {
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

}
