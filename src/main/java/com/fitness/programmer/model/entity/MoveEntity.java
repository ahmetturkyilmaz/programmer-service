package com.fitness.programmer.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Map;

@Entity
@Table(name = "moveEntity")
public class MoveEntity extends BaseEntity {
    @NotBlank
    private String name;
    @NotNull
    private Integer number;

    private String sets;

    @ElementCollection
    private Map<Integer, Double> setWeightMap;

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

    public String getSets() {
        return sets;
    }

    public void setSets(String sets) {
        this.sets = sets;
    }

    public Map<Integer, Double> getSetWeightMap() {
        return setWeightMap;
    }

    public void setSetWeightMap(Map<Integer, Double> setWeightMap) {
        this.setWeightMap = setWeightMap;
    }

    public DailyProgramEntity getDailyProgram() {
        return dailyProgram;
    }

    public void setDailyProgram(DailyProgramEntity dailyProgram) {
        this.dailyProgram = dailyProgram;
    }
}
