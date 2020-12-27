package com.fitness.programmer.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "weeklyProgram")
public class WeeklyProgramEntity extends BaseEntity {
    @NotBlank
    private String name;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private List<DailyProgramEntity> dailyProgram;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "totalProgram_id")
    private TotalProgramEntity totalProgram;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DailyProgramEntity> getDailyProgram() {
        return dailyProgram;
    }

    public void setDailyProgram(List<DailyProgramEntity> dailyProgram) {
        this.dailyProgram = dailyProgram;
    }

    public TotalProgramEntity getTotalProgram() {
        return totalProgram;
    }

    public void setTotalProgram(TotalProgramEntity totalProgram) {
        this.totalProgram = totalProgram;
    }
}
