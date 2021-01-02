package com.fitness.programmer.model.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fitness.programmer.model.enums.MoveType;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "moveType", visible = true, defaultImpl = MoveCardioDto.class)
@JsonSubTypes({
        @JsonSubTypes.Type(value = MoveCardioDto.class, name = MoveType.CARDIO),
        @JsonSubTypes.Type(value = MoveWeightliftingDto.class, name = MoveType.Weightlifting),
        @JsonSubTypes.Type(value = MoveWeightliftingDto.class, name = MoveType.BodyWeight)
})
public abstract class MoveDto {
    private String moveType;
    private String name;
    private Integer number;
    private DailyProgramDto dailyProgramDto;

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

}
