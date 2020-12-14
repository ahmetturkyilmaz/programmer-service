package com.fitness.programmer.model.entity;

import com.fitness.programmer.model.dto.MoveDto;

import java.util.HashMap;

public class DailyProgramEntity {

    private String name;
    private HashMap<String, MoveEntity> moveSet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, MoveEntity> getMoveSet() {
        return moveSet;
    }

    public void setMoveSet(HashMap<String, MoveEntity> moveSet) {
        this.moveSet = moveSet;
    }
}
