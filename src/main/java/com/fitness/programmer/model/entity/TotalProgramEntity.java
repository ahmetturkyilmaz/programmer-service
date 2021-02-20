package com.fitness.programmer.model.entity;

import com.fitness.programmer.model.enums.ProgramWeekType;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "TotalProgramEntity")
public class TotalProgramEntity extends BaseEntity {
    private String programName;
    private ProgramWeekType programWeekType;


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


}
