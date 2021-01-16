package com.fitness.programmer.model.dto;

import java.util.Map;

public class MoveDto extends BaseDto {
    private String name;
    private String moveType;
    private Integer moveNumber;
    private Long time;
    private Integer sets;
    private Map<Integer, RepWeightDto> setRepWeightMap;

    public MoveDto() {

    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        this.moveType = moveType;
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

    public Map<Integer, RepWeightDto> getSetRepWeightMap() {
        return setRepWeightMap;
    }

    public void setSetRepWeightMap(Map<Integer, RepWeightDto> setRepWeightMap) {
        this.setRepWeightMap = setRepWeightMap;
    }
}
