package com.fitness.programmer.model.dto;

import java.util.Map;

public class MoveDto {
    private String name;
    private Integer moveNumber;
    private Integer sets;
    private Map<Integer, RepWeightDto> setRepWeightMap;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMoveNumber() {
        return moveNumber;
    }

    public Integer getSets() {
        return sets;
    }

    public void setSets(Integer sets) {
        this.sets = sets;
    }

    public void setMoveNumber(Integer moveNumber) {
        this.moveNumber = moveNumber;
    }

    public Map<Integer, RepWeightDto> getSetRepWeightMap() {
        return setRepWeightMap;
    }

    public void setSetRepWeightMap(Map<Integer, RepWeightDto> setRepWeightMap) {
        this.setRepWeightMap = setRepWeightMap;
    }
}
