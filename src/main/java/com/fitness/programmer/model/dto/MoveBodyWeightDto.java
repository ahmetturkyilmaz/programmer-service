package com.fitness.programmer.model.dto;

import java.util.Map;

public class MoveBodyWeightDto {
    private String sets;
    private Map<Integer, Integer> setRepMap;

    public String getSets() {
        return sets;
    }

    public void setSets(String sets) {
        this.sets = sets;
    }

    public Map<Integer, Integer> getSetRepMap() {
        return setRepMap;
    }

    public void setSetRepMap(Map<Integer, Integer> setRepMap) {
        this.setRepMap = setRepMap;
    }
}
