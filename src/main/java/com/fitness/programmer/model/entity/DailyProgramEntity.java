package com.fitness.programmer.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "dailyProgram")
public class DailyProgramEntity extends BaseEntity {
    @NotBlank
    private String name;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private List<MoveEntity> moveSet;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "weeklyProgram_id")
    private WeeklyProgramEntity weeklyProgram;

    public DailyProgramEntity() {
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
