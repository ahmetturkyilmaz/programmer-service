package com.fitness.programmer.model.dto;

import com.fitness.programmer.model.entity.DailyProgramEntity;

import java.util.Map;

public class MoveDto extends BaseDto{
    private String name;
    private Integer number;
    private Map<Integer, Integer> setRepMap;
    private Map<Integer, Double> setWeightMap;

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
    private DailyProgramDto dailyProgram;

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

    public DailyProgramDto getDailyProgram() {
        return dailyProgram;
    }

    public void setDailyProgram(DailyProgramDto dailyProgram) {
        this.dailyProgram = dailyProgram;
    }
}
