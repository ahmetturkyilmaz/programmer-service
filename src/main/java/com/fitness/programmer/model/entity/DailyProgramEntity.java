package com.fitness.programmer.model.entity;

import com.fitness.programmer.model.enums.DayOfWeek;

import java.util.List;

public class DailyProgramEntity extends BaseEntity {
    private String name;

    private DayOfWeek dayOfWeek;
    private List<MoveEntity> moveSet;


    public DailyProgramEntity() {
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
/*        String day = dayOfWeek.toString();
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
        }*/
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
    }

}
