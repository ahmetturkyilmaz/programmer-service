package com.fitness.programmer.model.entity;

import com.fitness.programmer.model.enums.ProgramWeekType;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "TotalProgramEntity")
public class TotalProgramEntity extends BaseEntity {
    private String programName;
    private ProgramWeekType programWeekType;

    private List<WeeklyProgramEntity> weeklyPrograms;

    public TotalProgramEntity() {

    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public ProgramWeekType getProgramWeekType() {
        return programWeekType;
    }

    public void setProgramWeekType(ProgramWeekType programWeekType) {
        this.programWeekType = programWeekType;
    }

    public List<WeeklyProgramEntity> getWeeklyPrograms() {
        return weeklyPrograms;
    }

    public void setWeeklyPrograms(List<WeeklyProgramEntity> weeklyPrograms) {
        this.weeklyPrograms = weeklyPrograms;
    }

}
