package com.fitness.programmer.model.entity;

import com.fitness.programmer.model.dto.RepWeightDto;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document(collection = "moveEntity")
public class MoveEntity extends BaseEntity {
    private String name;
    private String moveType;

    private Integer moveNumber;
    private Integer sets;
    private Map<Integer, RepWeightEntity> setRepWeightMap;
    private Long time;

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
