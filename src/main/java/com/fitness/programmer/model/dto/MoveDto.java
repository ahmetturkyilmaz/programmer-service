package com.fitness.programmer.model.dto;

import java.util.Map;

public class MoveDto {
    private String name;
    private String moveType;
    private Integer moveNumber;
    private Long time;
    private Integer sets;
    private Map<Integer, SetInfoDto> setInfoMap;


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

    public Map<Integer, SetInfoDto> getSetInfoMap() {
        return setInfoMap;
    }

    public void setSetInfoMap(Map<Integer, SetInfoDto> setInfoMap) {
        this.setInfoMap = setInfoMap;
    }
}
