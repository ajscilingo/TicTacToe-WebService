package net.scilingo.tictactoe.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name = "MOVE")
public class TicTacToeMove implements IMove, Serializable {

    @Column(name = "game_id")
    private Long gameId;

    @Column(name = "upper_left")
    private Character upperLeft;

    @Column(name = "upper_middle")
    private Character upperMiddle;

    @Column(name = "upper_right")
    private Character upperRight;

    @Column(name = "middle_left")
    private Character middleLeft;

    @Column(name = "middle_middle")
    private Character middleMiddle;

    @Column(name = "middle_right")
    private Character middleRight;

    @Column(name = "lower_left")
    private Character lowerLeft;

    @Column(name = "lower_middle")
    private Character lowerMiddle;

    @Column(name = "lower_right")
    private Character lowerRight;

    @Column(name = "last_updated", updatable = false, insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar lastUpdated;

    @Override
    public Long getGameId() {
        return this.gameId;
    }

    @Override
    public Character getUpperLeft() {
        return this.upperLeft;
    }

    @Override
    public Character getUpperMiddle() {
        return this.upperMiddle;
    }

    @Override
    public Character getUpperRight() {
        return this.upperRight;
    }

    @Override
    public Character getMiddleLeft() {
        return this.middleLeft;
    }

    @Override
    public Character getMiddleMiddle() {
        return this.middleMiddle;
    }

    @Override
    public Character getMiddleRight() {
        return this.middleRight;
    }

    @Override
    public Character getLowerLeft() {
        return this.lowerLeft;
    }

    @Override
    public Character getLowerMiddle() {
        return this.lowerMiddle;
    }

    @Override
    public Character getLowerRight() {
        return this.lowerRight;
    }

    @Override
    public Calendar getLastUpdated() {
        return this.getLastUpdated();
    }

    @Override
    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    @Override
    public void setUpperLeft(Character upperLeft) {
        this.upperLeft = upperLeft;
    }

    @Override
    public void setUpperMiddle(Character upperMiddle) {
        this.upperMiddle = upperMiddle;
    }

    @Override
    public void setUpperRight(Character upperRight) {
        this.upperRight = upperRight;
    }

    @Override
    public void setMiddleLeft(Character middleLeft) {
        this.middleLeft = middleLeft;
    }

    @Override
    public void setMiddleMiddle(Character middleMiddle) {

    }

    @Override
    public void setMiddleRight(Character middleRight) {

    }

    @Override
    public void setLowerLeft(Character lowerLeft) {

    }

    @Override
    public void setLowerMiddle(Character lowerMiddle) {

    }

    @Override
    public void setLowerRight(Character lowerRight) {

    }

    @Override
    public void setLastUpdated(Calendar lastUpdated) {

    }
}
