package com.fitness.programmer.model.entity;


import java.util.Map;

public class MoveEntity {

    private String name;

    private String moveType;

    private Integer moveNumber;

    private Integer sets;

    private Map<Integer, RepWeightEntity> setRepWeightMap;

    private Long time;

    private String RPM;

    public String getRPM() {
        return RPM;
    }

    public void setRPM(String RPM) {
        this.RPM = RPM;
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        this.moveType = moveType;
    }

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

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
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
