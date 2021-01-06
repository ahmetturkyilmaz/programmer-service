package com.fitness.programmer.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.util.CollectionUtils;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "weeklyProgram")
public class WeeklyProgramEntity extends BaseEntity {
    @NotBlank
    private String name;

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL}, mappedBy = "weeklyProgram")
    private List<DailyProgramEntity> dailyPrograms;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "total_program_id")
    private TotalProgramEntity totalProgram;

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
        if (!CollectionUtils.isEmpty(dailyProgram)) {
            for (DailyProgramEntity dailyProgramEntity : dailyProgram) {
                dailyProgramEntity.setWeeklyProgram(this);
            }
        }
    }

    public TotalProgramEntity getTotalProgram() {
        return totalProgram;
    }

    public void setTotalProgram(TotalProgramEntity totalProgram) {
        this.totalProgram = totalProgram;

    }
}
