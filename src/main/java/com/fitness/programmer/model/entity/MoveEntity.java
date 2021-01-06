package com.fitness.programmer.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @JsonIgnore
    @ElementCollection(fetch = FetchType.EAGER)
    private Map<Integer, Integer> setRepMap;

    @JsonIgnore
    @ElementCollection(fetch = FetchType.EAGER)
    private Map<Integer, Double> setWeightMap;

    @JsonIgnore
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

    public Map<Integer, Integer> getSetRepMap() {
        return setRepMap;
    }

    public void setSetRepMap(Map<Integer, Integer> setRepMap) {
        this.setRepMap = setRepMap;
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
