package com.fitness.programmer.model.entity;



import java.util.Map;

public class Move {

    private String name;

    private String moveType;

    private Integer moveNumber;

    private Integer sets;

    private Long time;

    private Map<Integer, SetInfo> setInfoMap;

    public Map<Integer, SetInfo> getSetInfoMap() {
        return setInfoMap;
    }

    public void setSetInfoMap(Map<Integer, SetInfo> setInfoMap) {
        this.setInfoMap = setInfoMap;
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


}
