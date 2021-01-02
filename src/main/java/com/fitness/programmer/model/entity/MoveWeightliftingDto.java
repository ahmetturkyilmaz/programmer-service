package com.fitness.programmer.model.entity;

import javax.persistence.ElementCollection;
import java.util.Map;

public class MoveWeightliftingDto extends MoveEntity{
    private String sets;

    @ElementCollection
    private Map<Integer, Double> setWeightMap;

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
}
