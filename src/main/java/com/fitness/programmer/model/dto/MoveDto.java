package com.fitness.programmer.model.dto;

import javax.persistence.ElementCollection;
import javax.validation.constraints.NotBlank;
import java.util.HashMap;

public class MoveDto {
    private String name;
    private String sets;
    private HashMap<Integer, String> setWeightMap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSets() {
        return sets;
    }

    public void setSets(String sets) {
        this.sets = sets;
    }

    public HashMap<Integer, String> getSetWeightMap() {
        return setWeightMap;
    }

    public void setSetWeightMap(HashMap<Integer, String> setWeightMap) {
        this.setWeightMap = setWeightMap;
    }
}
