package com.fitness.programmer.model.dto;

import java.util.Map;

public class MoveDto {
    private String name;
    private Integer number;
    private String sets;
    private Map<Integer, Double> setWeightMap;
    private DailyProgramDto dailyProgram;

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

    public DailyProgramDto getDailyProgram() {
        return dailyProgram;
    }

    public void setDailyProgram(DailyProgramDto dailyProgram) {
        this.dailyProgram = dailyProgram;
    }
}
