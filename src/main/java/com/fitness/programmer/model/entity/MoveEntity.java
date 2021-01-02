package com.fitness.programmer.model.entity;

import com.fitness.programmer.model.enums.MoveType;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Map;

@Entity
@Table(name = "moveEntity")
public abstract class MoveEntity extends BaseEntity {
    private String moveType;
    @NotBlank
    private String name;
    @NotNull
    private Integer number;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "dailyProgram_id")
    private DailyProgramEntity dailyProgram;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


    public DailyProgramEntity getDailyProgram() {
        return dailyProgram;
    }

    public void setDailyProgram(DailyProgramEntity dailyProgram) {
        this.dailyProgram = dailyProgram;
    }
}
