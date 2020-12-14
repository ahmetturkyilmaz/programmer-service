package com.fitness.programmer.model.dto;

import javax.persistence.ElementCollection;
import javax.validation.constraints.NotBlank;
import java.util.HashMap;

public class MoveDto extends BaseDto {
    private String name;
    private String sets;
    private HashMap<Integer, String> setWeightMap;
}
