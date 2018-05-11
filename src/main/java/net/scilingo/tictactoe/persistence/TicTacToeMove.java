package net.scilingo.tictactoe.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name="MOVE")
public class TicTacToeMove implements IMove, Serializable {

    @Column(name="game_id")
    private Long gameId;

    @Column(name="upper_left")
    private Character upperLeft;

    @Column(name="upper_middle")
    private Character upperMiddle;

    @Column(name="upper_right")
    private Character upperRight;

    @Override
    public Long getGameId() {
        return null;
    }

    @Override
    public Character getUpperLeft() {
        return null;
    }

    @Override
    public Character getUpperMiddle() {
        return null;
    }

    @Override
    public Character getUpperRight() {
        return null;
    }

    @Override
    public Character getMiddleLeft() {
        return null;
    }

    @Override
    public Character getMiddleMiddle() {
        return null;
    }

    @Override
    public Character getMiddleRight() {
        return null;
    }

    @Override
    public Character getLowerLeft() {
        return null;
    }

    @Override
    public Character getLowerMiddle() {
        return null;
    }

    @Override
    public Character getLowerRight() {
        return null;
    }

    @Override
    public Calendar getLastUpdated() {
        return null;
    }

    @Override
    public void setGameId(Long gameId) {

    }

    @Override
    public void setUpperLeft(Character upperLeft) {

    }

    @Override
    public void setUpperMiddle(Character upperMiddle) {

    }

    @Override
    public void setUpperRight(Character upperRight) {

    }

    @Override
    public void setMiddleLeft(Character middleLeft) {

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
