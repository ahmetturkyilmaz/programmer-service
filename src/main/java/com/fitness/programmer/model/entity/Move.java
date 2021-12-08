package com.fitness.programmer.model.entity;


import java.util.List;

public class Move {

    private String name;

    private String moveType;

    private Integer moveNumber;

    private Integer sets;

    private Long time;

    private List<SetInfo> setInfoList;

    public List<SetInfo> getSetInfoList() {
        return setInfoList;
    }

    public void setSetInfoList(List<SetInfo> setInfoList) {
        this.setInfoList = setInfoList;
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
