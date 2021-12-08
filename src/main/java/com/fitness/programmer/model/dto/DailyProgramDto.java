package com.fitness.programmer.model.dto;

import com.fitness.programmer.model.enums.DayOfWeek;
import org.springframework.lang.NonNull;

import java.util.List;

public class DailyProgramDto extends BaseDto {
    private String name;
    private DayOfWeek dayOfWeek;
    private List<MoveDto> moveSet;
    private String totalProgramId;
    private Integer weekNumber;

    public DailyProgramDto() {

    }

    public String getTotalProgramId() {
        return totalProgramId;
    }

    public void setTotalProgramId(String totalProgramId) {
        this.totalProgramId = totalProgramId;
    }

    public Integer getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(Integer weekNumber) {
        this.weekNumber = weekNumber;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MoveDto> getMoveSet() {
        return moveSet;
    }

    public void setMoveSet(List<MoveDto> moveSet) {
        this.moveSet = moveSet;
    }

}
