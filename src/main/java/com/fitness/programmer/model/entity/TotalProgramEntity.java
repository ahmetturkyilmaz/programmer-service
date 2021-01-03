package com.fitness.programmer.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fitness.programmer.model.enums.ProgramWeekType;
import org.springframework.util.CollectionUtils;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "totalProgram")
public class TotalProgramEntity extends BaseEntity {
    @NotBlank
    private String programName;
    private ProgramWeekType programWeekType;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "totalProgram")
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
        if (!CollectionUtils.isEmpty(weeklyPrograms)) {
            for (WeeklyProgramEntity weeklyProgramEntity : weeklyPrograms) {
                weeklyProgramEntity.setTotalProgram(this);
            }
        }
    }


}
