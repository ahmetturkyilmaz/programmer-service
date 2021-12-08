package com.fitness.programmer.model.entity;

import com.fitness.programmer.model.enums.DayOfWeek;
import com.mongodb.lang.NonNull;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "DailyProgramEntity")

public class DailyProgramEntity extends BaseEntity {
    private String name;

    @NonNull
    private DayOfWeek dayOfWeek;

    private List<Move> moveSet;
    @NonNull
    private String totalProgramId;
    @NonNull
    private Integer weekNumber;

    public DailyProgramEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public List<Move> getMoveSet() {
        return moveSet;
    }

    public void setMoveSet(List<Move> moveSet) {
        this.moveSet = moveSet;
    }

    public String getTotalProgramId() {
        return totalProgramId;
    }

    public void setTotalProgramId(String totalProgramId) {
        this.totalProgramId = totalProgramId;
    }

    public Integer getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(Integer weekNumber) {
        this.weekNumber = weekNumber;
    }
}
