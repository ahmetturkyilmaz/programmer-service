package com.fitness.programmer.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fitness.programmer.exception.DayNotFoundException;
import com.fitness.programmer.model.enums.DayOfWeek;
import org.springframework.util.CollectionUtils;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "dailyProgram")
public class DailyProgramEntity extends BaseEntity {
    @NotBlank
    private String name;

    private DayOfWeek dayOfWeek;
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "dailyProgram")
    private List<MoveEntity> moveSet;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "weekly_program_id")
    private WeeklyProgramEntity weeklyProgram;

    public DailyProgramEntity() {
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) throws DayNotFoundException {
        String day = dayOfWeek.toString();
        switch (day) {
            case "MONDAY":
                this.dayOfWeek = DayOfWeek.MONDAY;
                break;
            case "TUESDAY":
                this.dayOfWeek = DayOfWeek.TUESDAY;
                break;
            case "WEDNESDAY":
                this.dayOfWeek = DayOfWeek.WEDNESDAY;
                break;
            case "THURSDAY":
                this.dayOfWeek = DayOfWeek.THURSDAY;
                break;
            case "FRIDAY":
                this.dayOfWeek = DayOfWeek.FRIDAY;
                break;
            case "SATURDAY":
                this.dayOfWeek = DayOfWeek.SATURDAY;
                break;
            case "SUNDAY":
                this.dayOfWeek = DayOfWeek.SUNDAY;
                break;
            default:
                throw new DayNotFoundException(day);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MoveEntity> getMoveSet() {
        return moveSet;
    }

    public void setMoveSet(List<MoveEntity> moveSet) {
        this.moveSet = moveSet;
        if (!CollectionUtils.isEmpty(moveSet)) {
            for (MoveEntity moveEntity : moveSet) {
                moveEntity.setDailyProgram(this);
            }
        }
    }

    public WeeklyProgramEntity getWeeklyProgram() {
        return weeklyProgram;
    }

    public void setWeeklyProgram(WeeklyProgramEntity weeklyProgram) {
        this.weeklyProgram = weeklyProgram;
    }
}
