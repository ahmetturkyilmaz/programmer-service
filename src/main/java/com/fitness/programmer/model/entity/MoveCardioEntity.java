package com.fitness.programmer.model.entity;

import com.fitness.programmer.model.enums.CardioMoveType;

public class MoveCardioEntity extends MoveEntity{
    private Double minutes;
    private CardioMoveType cardioMove;

    public Double getMinutes() {
        return minutes;
    }

    public void setMinutes(Double minutes) {
        this.minutes = minutes;
    }

    public CardioMoveType getCardioMove() {
        return cardioMove;
    }

    public void setCardioMove(CardioMoveType cardioMove) {
        this.cardioMove = cardioMove;
    }
}
