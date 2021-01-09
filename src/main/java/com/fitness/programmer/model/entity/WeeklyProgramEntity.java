package com.fitness.programmer.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.util.CollectionUtils;

import java.util.List;

public class WeeklyProgramEntity  {
    private String name;

    private List<DailyProgramEntity> dailyPrograms;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DailyProgramEntity> getDailyPrograms() {
        return dailyPrograms;
    }

    public void setDailyPrograms(List<DailyProgramEntity> dailyProgram) {
        this.dailyPrograms = dailyProgram;

    }

}
