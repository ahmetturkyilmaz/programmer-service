package com.fitness.programmer.model.dto;

import java.util.HashMap;

public class DailyProgramDto extends BaseDto {

    private String name;
    private HashMap<String, MoveDto> moveSet;

    public DailyProgramDto() {

    }

    public DailyProgramDto(String name, HashMap<String, MoveDto> moveSet) {
        this.name = name;
        this.moveSet = moveSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, MoveDto> getMoveSet() {
        return moveSet;
    }

    public void setMoveSet(HashMap<String, MoveDto> moveSet) {
        this.moveSet = moveSet;
    }
}
