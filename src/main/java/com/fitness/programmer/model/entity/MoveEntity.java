package com.fitness.programmer.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Map;

public class MoveEntity {
    private String name;
    private Integer moveNumber;
    private Integer sets;

    @JsonIgnore
    private Map<Integer, RepWeightEntity> setRepWeightMap;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMoveNumber() {
        return moveNumber;
    }

    public void setMoveNumber(Integer moveNumber) {
        this.moveNumber = moveNumber;
    }

    public Integer getSets() {
        return sets;
    }

    public void setSets(Integer sets) {
        this.sets = sets;
    }

    public Map<Integer, RepWeightEntity> getSetRepWeightMap() {
        return setRepWeightMap;
    }

    public void setSetRepWeightMap(Map<Integer, RepWeightEntity> setRepWeightMap) {
        this.setRepWeightMap = setRepWeightMap;
    }
}
