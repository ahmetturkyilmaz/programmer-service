package com.fitness.programmer.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Map;

public class MoveEntity extends BaseEntity {
    private String name;
    private Integer number;

    @JsonIgnore
    private Map<Integer, Integer> setRepMap;

    @JsonIgnore
    private Map<Integer, Double> setWeightMap;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Map<Integer, Integer> getSetRepMap() {
        return setRepMap;
    }

    public void setSetRepMap(Map<Integer, Integer> setRepMap) {
        this.setRepMap = setRepMap;
    }

    public Map<Integer, Double> getSetWeightMap() {
        return setWeightMap;
    }

    public void setSetWeightMap(Map<Integer, Double> setWeightMap) {

        this.setWeightMap = setWeightMap;
    }
}
