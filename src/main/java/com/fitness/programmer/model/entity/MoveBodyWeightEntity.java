package com.fitness.programmer.model.entity;

import javax.persistence.Table;
import java.util.Map;
@Table(name = "moveBodyWeightEntity")
public class MoveBodyWeightEntity extends MoveEntity {
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
